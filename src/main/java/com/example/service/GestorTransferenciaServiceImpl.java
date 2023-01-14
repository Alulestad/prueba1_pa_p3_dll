package com.example.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.modelo.CuentaBancaria;
import com.example.modelo.RegistroTransferencia;

@Service
public class GestorTransferenciaServiceImpl implements IGestorTransferenciaService {

	@Autowired
	private IRegistroTransferenciaService iRegistroTransferenciaService;
	@Autowired
	private ICuentaBancariaService bancariaService;

	
	@Override
	public void transferir(String cuentaOrigen, String cuentaDestino,BigDecimal monto) {
		// TODO Auto-generated method stub
		System.out.println("Transferir");
		RegistroTransferencia registroTransferencia = new RegistroTransferencia();
		registroTransferencia.setCuentaOrigen(cuentaOrigen);
		registroTransferencia.setCuentaDestino(cuentaDestino);
		registroTransferencia.setFecha(LocalDateTime.now());
		registroTransferencia.setMonto(monto);
		
		
		//////
		BigDecimal comision= monto.multiply(new BigDecimal(0.05));
		
		registroTransferencia.setComision(comision);
		
		/////
		
		CuentaBancaria cuentaBancariaOrigen=this.bancariaService.buscar(cuentaOrigen);
		BigDecimal saldoOrigen= cuentaBancariaOrigen.getSaldo();
		saldoOrigen.subtract(monto);
		if(saldoOrigen.compareTo(monto)<0) {
			System.out.println("No se puede transferir, saldo insuficiente");
			return;
		}
		cuentaBancariaOrigen.setSaldo(saldoOrigen);
		
		
		CuentaBancaria cuentaBancariaDestino=this.bancariaService.buscar(cuentaDestino);
		BigDecimal saldoDestino= cuentaBancariaDestino.getSaldo();
		saldoDestino.add(monto);
		saldoDestino.subtract(comision);
		cuentaBancariaDestino.setSaldo(saldoDestino);
		
		bancariaService.actualizar(cuentaBancariaDestino);
		bancariaService.actualizar(cuentaBancariaOrigen);
		/////
		
		iRegistroTransferenciaService.agregar(registroTransferencia);
		
		
	}

}

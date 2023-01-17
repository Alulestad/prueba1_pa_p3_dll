package com.example.demo.correccion.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.correccion.modelo.CuentaBancaria;
import com.example.demo.correccion.modelo.RegistroTransferencia;

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
		System.out.println("Monto: "+monto);
		RegistroTransferencia registroTransferencia = new RegistroTransferencia();
		registroTransferencia.setCuentaOrigen(cuentaOrigen);
		registroTransferencia.setCuentaDestino(cuentaDestino);
		registroTransferencia.setFecha(LocalDateTime.now());
		registroTransferencia.setMonto(monto);
		
		
		//////
		BigDecimal comision= monto.multiply(new BigDecimal(0.05));
		
		registroTransferencia.setComision(comision);
		
		/////
		
		CuentaBancaria cuentaBancariaOrigen=this.bancariaService.encontrar(cuentaOrigen);
		BigDecimal saldoOrigen= cuentaBancariaOrigen.getSaldo();
		saldoOrigen=saldoOrigen.subtract(monto);
		System.out.println("Saldo origen substraido: "+saldoOrigen);
		if(saldoOrigen.compareTo(monto)<0) {
			System.out.println("No se puede transferir, saldo insuficiente");
			return;
		}
		cuentaBancariaOrigen.setSaldo(saldoOrigen);
		
		
		CuentaBancaria cuentaBancariaDestino=this.bancariaService.encontrar(cuentaDestino);
		BigDecimal saldoDestino= cuentaBancariaDestino.getSaldo();
		saldoDestino=saldoDestino.add(monto);
		saldoDestino=saldoDestino.subtract(comision);
		cuentaBancariaDestino.setSaldo(saldoDestino);
		
		System.out.println("Cuenta destino saldo nuevo: "+saldoDestino);
		
		bancariaService.modificar(cuentaBancariaDestino);
		bancariaService.modificar(cuentaBancariaOrigen);
		/////
		
		iRegistroTransferenciaService.agregar(registroTransferencia);
		
		
	}

}

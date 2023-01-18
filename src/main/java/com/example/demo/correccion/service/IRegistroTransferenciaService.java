package com.example.demo.correccion.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.correccion.modelo.RegistroTransferencia;
import com.example.demo.correccion.repo.ICuentaBancariaRepo;
import com.example.demo.correccion.repo.IRegistroTransferenciaRepo;

public interface IRegistroTransferenciaService {


	
	
	public void realizar (String numeroOrigen, String numeroDestino, BigDecimal monto);


	
}

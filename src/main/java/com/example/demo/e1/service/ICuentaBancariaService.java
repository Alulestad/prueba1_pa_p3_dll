package com.example.demo.e1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.e1.repo.ICuentaBancariaRepo;
import com.example.demo.e1.modelo.CuentaBancaria;

public interface ICuentaBancariaService {
	
	public void agregar (CuentaBancaria bancaria);
	public void actualizar(CuentaBancaria bancaria);
	public CuentaBancaria buscar(String numero);
	
	
	
	
	
}

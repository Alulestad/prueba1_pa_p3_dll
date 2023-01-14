package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.modelo.CuentaBancaria;
import com.example.repo.ICuentaBancariaRepo;

public interface ICuentaBancariaService {
	
	public void agregar (CuentaBancaria bancaria);
	public void actualizar(CuentaBancaria bancaria);
	public CuentaBancaria buscar(String numero);
	
	
	
	
	
}

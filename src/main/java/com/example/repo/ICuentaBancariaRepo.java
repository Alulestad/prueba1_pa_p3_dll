package com.example.repo;

import com.example.modelo.CuentaBancaria;

public interface ICuentaBancariaRepo {
	//CRUD
	
	public void insertar(CuentaBancaria bancaria);
	public CuentaBancaria buscar(String numero);
	public void actualizar(CuentaBancaria bancaria);
	//No hace falta:
	//public void eliminar(String numero);
	
	
}

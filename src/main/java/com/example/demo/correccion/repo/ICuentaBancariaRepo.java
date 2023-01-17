package com.example.demo.correccion.repo;

import com.example.demo.correccion.modelo.CuentaBancaria;

public interface ICuentaBancariaRepo {
	//CRUD
	
	public void insertar(CuentaBancaria bancaria);
	public CuentaBancaria buscar(String numero);
	public void actualizar(CuentaBancaria bancaria);
	public void eliminar(String numero);
	
	
}

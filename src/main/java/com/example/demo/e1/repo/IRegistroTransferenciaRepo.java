package com.example.demo.e1.repo;

import com.example.demo.e1.modelo.RegistroTransferencia;

public interface IRegistroTransferenciaRepo {

	
	//CRUD
	
	public void insertar(RegistroTransferencia registroTransferencia);
	public RegistroTransferencia buscar(Integer id);
	//No hace falta:
	//
	//public void actualizar(CuentaBancaria bancaria);
	//public void eliminar(String numero);
}

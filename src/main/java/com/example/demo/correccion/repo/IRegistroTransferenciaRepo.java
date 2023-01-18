package com.example.demo.correccion.repo;

import com.example.demo.correccion.modelo.RegistroTransferencia;

public interface IRegistroTransferenciaRepo {

	
	//CRUD
	
	public void insertar(RegistroTransferencia registroTransferencia);

	//No hace falta:
	//
	//public void actualizar(CuentaBancaria bancaria);
	//public void eliminar(String numero);
}

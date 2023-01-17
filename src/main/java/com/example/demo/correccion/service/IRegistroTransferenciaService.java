package com.example.demo.correccion.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.correccion.modelo.RegistroTransferencia;
import com.example.demo.correccion.repo.ICuentaBancariaRepo;
import com.example.demo.correccion.repo.IRegistroTransferenciaRepo;

public interface IRegistroTransferenciaService {


	
	
	public void agregar (RegistroTransferencia registroTransferencia);

	public RegistroTransferencia buscar(Integer id);
	
}

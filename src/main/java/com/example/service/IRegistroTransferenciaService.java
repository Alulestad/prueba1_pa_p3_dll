package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.modelo.RegistroTransferencia;
import com.example.repo.ICuentaBancariaRepo;
import com.example.repo.IRegistroTransferenciaRepo;

public interface IRegistroTransferenciaService {


	
	
	public void agregar (RegistroTransferencia registroTransferencia);

	public RegistroTransferencia buscar(Integer id);
	
}

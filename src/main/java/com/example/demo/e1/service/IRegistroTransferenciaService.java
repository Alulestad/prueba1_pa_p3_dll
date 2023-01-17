package com.example.demo.e1.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.e1.repo.ICuentaBancariaRepo;
import com.example.demo.e1.repo.IRegistroTransferenciaRepo;
import com.example.demo.e1.modelo.RegistroTransferencia;

public interface IRegistroTransferenciaService {


	
	
	public void agregar (RegistroTransferencia registroTransferencia);

	public RegistroTransferencia buscar(Integer id);
	
}

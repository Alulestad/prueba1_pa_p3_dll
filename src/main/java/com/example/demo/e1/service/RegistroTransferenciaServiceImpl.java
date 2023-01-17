package com.example.demo.e1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.e1.repo.IRegistroTransferenciaRepo;
import com.example.demo.e1.modelo.RegistroTransferencia;

//@Service
public class RegistroTransferenciaServiceImpl implements IRegistroTransferenciaService {

	@Autowired
	private IRegistroTransferenciaRepo iRegistroTransferenciaRepo;
	
	@Override
	public void agregar(RegistroTransferencia registroTransferencia) {
		// TODO Auto-generated method stub
		this.iRegistroTransferenciaRepo.insertar(registroTransferencia);
	}

	@Override
	public RegistroTransferencia buscar(Integer id) {
		// TODO Auto-generated method stub
		RegistroTransferencia registroTransferencia1=this.iRegistroTransferenciaRepo.buscar(id);
		return registroTransferencia1;
	}

}

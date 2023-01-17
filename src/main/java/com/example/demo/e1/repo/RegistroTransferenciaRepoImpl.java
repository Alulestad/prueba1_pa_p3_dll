package com.example.demo.e1.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.e1.modelo.RegistroTransferencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

//@Repository
//@Transactional
public class RegistroTransferenciaRepoImpl implements IRegistroTransferenciaRepo {

	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(RegistroTransferencia registroTransferencia) {
		// TODO Auto-generated method stub
		this.entityManager.persist(registroTransferencia);
	}

	@Override
	public RegistroTransferencia buscar(Integer id) {
		RegistroTransferencia registroTransferencia=this.entityManager.find(RegistroTransferencia.class, id);
		return registroTransferencia;
	}

}

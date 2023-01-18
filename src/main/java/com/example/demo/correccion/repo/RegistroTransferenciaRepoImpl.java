package com.example.demo.correccion.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.correccion.modelo.RegistroTransferencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class RegistroTransferenciaRepoImpl implements IRegistroTransferenciaRepo {

	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(RegistroTransferencia registroTransferencia) {
		// TODO Auto-generated method stub
		this.entityManager.persist(registroTransferencia);
	}



}

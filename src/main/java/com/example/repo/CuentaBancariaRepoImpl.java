package com.example.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.example.modelo.CuentaBancaria;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CuentaBancariaRepoImpl implements ICuentaBancariaRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(CuentaBancaria bancaria) {
		
		this.entityManager.persist(bancaria);

	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		CuentaBancaria encontrado=this.entityManager.find(CuentaBancaria.class, numero);
		return encontrado;
	}

	@Override
	public void actualizar(CuentaBancaria bancaria) {
		// TODO Auto-generated method stub
		this.entityManager.merge(bancaria);
	}

}

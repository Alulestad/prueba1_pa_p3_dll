package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.modelo.CuentaBancaria;
import com.example.repo.ICuentaBancariaRepo;

@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService {

	@Autowired
	private ICuentaBancariaRepo bancariaRepo;
	
	@Override
	public void agregar(CuentaBancaria bancaria) {
		// TODO Auto-generated method stub
		this.bancariaRepo.insertar(bancaria);
	}

	@Override
	public void actualizar(CuentaBancaria bancaria) {
		// TODO Auto-generated method stub
		this.bancariaRepo.actualizar(bancaria);
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		CuentaBancaria bancaria1=this.bancariaRepo.buscar(numero);
		return bancaria1;
	}

	//@Autowired
	//private ICuentaBancariaRepo bancariaRepo;
	
//	@Override
//	public void agregar(CuentaBancaria bancaria) {
//		// TODO Auto-generated method stub
//		//this.bancariaRepo.insertar(bancaria);
//	}
//
//	@Override
//	public void actualizar(CuentaBancaria bancaria) {
//		// TODO Auto-generated method stub
//		//this.bancariaRepo.actualizar(bancaria);
//	}
//
//	@Override
//	public CuentaBancaria buscar(String numero) {
//		// TODO Auto-generated method stub
//		//CuentaBancaria bancaria1=this.bancariaRepo.buscar(numero);
//		//return bancaria1;
//		return null;
//	}

}

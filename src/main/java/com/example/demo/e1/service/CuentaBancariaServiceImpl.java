package com.example.demo.e1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.e1.repo.ICuentaBancariaRepo;
import com.example.demo.e1.modelo.CuentaBancaria;

//@Service
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
		System.out.println("Se busco la siguiente cuenta: "+bancaria1);
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

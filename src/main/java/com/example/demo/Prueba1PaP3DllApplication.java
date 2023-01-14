package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.modelo.CuentaBancaria;
import com.example.service.ICuentaBancariaService;
import com.example.service.IGestorTransferenciaService;

@SpringBootApplication
public class Prueba1PaP3DllApplication implements CommandLineRunner{

	@Autowired
	private ICuentaBancariaService bancariaService;
	
	@Autowired
	private IGestorTransferenciaService gestorTransferenciaService;
	
	public static void main(String[] args) {
		SpringApplication.run(Prueba1PaP3DllApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Sistema bancario");
		CuentaBancaria cuenta1=new CuentaBancaria();
		cuenta1.setNumero("234");
		cuenta1.setCedula("12389127");
		cuenta1.setSaldo(new BigDecimal(1000));
		cuenta1.setTipo("CORRIENTE");
		
		CuentaBancaria cuenta2=new CuentaBancaria();
		cuenta2.setNumero("235");
		cuenta2.setCedula("13456127");
		cuenta2.setSaldo(new BigDecimal(2000));
		cuenta2.setTipo("AHORROS");
		
		
		this.bancariaService.agregar(cuenta1);
		this.bancariaService.agregar(cuenta2);
		
		
		this.gestorTransferenciaService.transferir("234", "235", new BigDecimal(10));
		
		
		CuentaBancaria cuentaOrigenMod= bancariaService.buscar("234");
		System.out.println("La cuenta de origen: ");
		System.out.println(cuentaOrigenMod);
		
	}

}

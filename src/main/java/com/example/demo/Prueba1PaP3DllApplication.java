package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.correccion.modelo.CuentaBancaria;
import com.example.demo.correccion.service.ICuentaBancariaService;
import com.example.demo.correccion.service.IRegistroTransferenciaService;

@SpringBootApplication
public class Prueba1PaP3DllApplication implements CommandLineRunner{

	@Autowired
	private ICuentaBancariaService bancariaService;
	
	@Autowired
	private IRegistroTransferenciaService iRegistroTransferenciaService;
	

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
		cuenta1.setTipo("A");
		
		CuentaBancaria cuenta2=new CuentaBancaria();
		cuenta2.setNumero("235");
		cuenta2.setCedula("13456127");
		cuenta2.setSaldo(new BigDecimal(2000));
		cuenta2.setTipo("C");
		
		
		this.bancariaService.guardar(cuenta1);
		this.bancariaService.guardar(cuenta2);
		
		
		this.iRegistroTransferenciaService.realizar("234", "235", new BigDecimal(100));
		
		System.out.println("Saldo cuenta origen");
		System.out.println(cuenta1.getSaldo());
		
		System.out.println("Saldo cuenta origen actual");
		System.out.println(this.bancariaService.encontrar("234").getSaldo());
	}

}

package com.example.demo.e1.service;

import java.math.BigDecimal;

public interface IGestorTransferenciaService {

	public void transferir(String cuentaOrigen,String cuentaDestino,BigDecimal monto);
	
}

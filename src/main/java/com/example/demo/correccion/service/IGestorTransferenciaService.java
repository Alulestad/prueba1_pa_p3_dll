package com.example.demo.correccion.service;

import java.math.BigDecimal;

public interface IGestorTransferenciaService {

	public void transferir(String cuentaOrigen,String cuentaDestino,BigDecimal monto);
	
}

package com.solorzano;

import java.util.HashMap;
import java.util.Map;

import org.example.paises.Moneda;
import org.example.paises.Pais;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import jakarta.annotation.PostConstruct;

@Component
public class PaisRepositorio {
	private static final Map<String, Pais> paises = new HashMap<>();
	
	@PostConstruct
	public void initData() {
		Pais peru = new Pais();
		peru.setNombre("Perú");
		peru.setCapital("Lima");
		peru.setPoblacion(33035304);
		peru.setMoneda(Moneda.SOL);
		paises.put(peru.getNombre(), peru);
		
		Pais ecuador = new Pais();
		ecuador.setNombre("Venezuela");
		ecuador.setCapital("Caracas");
		ecuador.setPoblacion(28515829);
		ecuador.setMoneda(Moneda.BOLÍVAR);
		paises.put(ecuador.getNombre(), ecuador);
		
		Pais venezuela = new Pais();
		venezuela.setNombre("Venezuela");
		venezuela.setCapital("Caracas");
		venezuela.setPoblacion(28515829);
		venezuela.setMoneda(Moneda.BOLÍVAR);
		paises.put(venezuela.getNombre(), venezuela);
	}
	
	public Pais buscarPais(String nombre) {
		Assert.notNull(nombre, "El nombre del pais no puede ser nulo");
		return paises.get(nombre);
	}
}

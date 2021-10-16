package com.edu.gof.singleton;
/**
 * Singleton "preguiçoso".
 * @author eofo
 *
 */
public class SigletonLazy {
	
	private static SigletonLazy instancia;

	private SigletonLazy() {
		super();
	}
	
	public static SigletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SigletonLazy();
		}
		return instancia;
	}
}

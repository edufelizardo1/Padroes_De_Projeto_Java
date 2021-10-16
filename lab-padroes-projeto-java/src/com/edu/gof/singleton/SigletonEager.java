package com.edu.gof.singleton;
/**
 * Singleton "apressado".
 * @author eofo
 *
 */
public class SigletonEager {
	
	private static SigletonEager instancia =  new SigletonEager();

	private SigletonEager() {
		super();
	}
	
	public static SigletonEager getInstancia() {
		return instancia;
	}
}

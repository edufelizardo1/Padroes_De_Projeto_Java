package com.edu.gof.singleton;
/**
 * Singleton "apressado".
 * @author eofo
 *
 */

public class SigletonLazyHolder {
	
	private static class InstaceHolder {
		public static SigletonLazyHolder instancia = new SigletonLazyHolder();
	}

	private SigletonLazyHolder() {
		super();
	}
	
	public static SigletonLazyHolder getInstancia() {
		return InstaceHolder.instancia;
	}
}

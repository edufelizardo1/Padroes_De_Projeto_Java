package com.edu.gof;

import com.edu.gof.facade.Facade;
import com.edu.gof.singleton.SigletonEager;
import com.edu.gof.singleton.SigletonLazy;
import com.edu.gof.singleton.SigletonLazyHolder;
import com.edu.gof.strategy.Comportamento;
import com.edu.gof.strategy.ComportamentoAgressivo;
import com.edu.gof.strategy.ComportamentoDefensivo;
import com.edu.gof.strategy.ComportamentoNormal;
import com.edu.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		//	Singleton

		SigletonLazy lazy = SigletonLazy.getInstancia();
		System.out.println(lazy);
		SigletonLazy.getInstancia();
		System.out.println(lazy);

		SigletonEager eager = SigletonEager.getInstancia();
		System.out.println(eager);
		SigletonEager.getInstancia();
		System.out.println(eager);

		SigletonLazyHolder sigletonLazyHolder = SigletonLazyHolder.getInstancia();
		System.out.println(sigletonLazyHolder);
		SigletonLazyHolder.getInstancia();
		System.out.println(sigletonLazyHolder);
		
		//	Strategy
		System.out.println();
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		
		//	Facade
		System.out.println();
		Facade facade = new Facade();
		facade.migrarCliente("Eduardo", "05171-029");
	}

}


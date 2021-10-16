package test.gof.singleton;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.edu.gof.singleton.SigletonEager;
import com.edu.gof.singleton.SigletonLazy;
import com.edu.gof.singleton.SigletonLazyHolder;

class SingletonTest {

	@Test
	void SigletonLazyTest() {
		SigletonLazy lazy = SigletonLazy.getInstancia();
		String l1 = lazy.toString();
		lazy = SigletonLazy.getInstancia();
		String l2 = lazy.toString();
		
		
		Assert.assertEquals(l1, l2);
	}
	
	@Test
	void SigletonEagerTest() {
		SigletonEager eager = SigletonEager.getInstancia();
		String e1 = eager.toString();
		eager = SigletonEager.getInstancia();
		String e2 = eager.toString();
		
		
		Assert.assertEquals(e1, e2);
	}
	
	@Test
	void SigletonLazyHolderTest() {
		SigletonLazyHolder lazy = SigletonLazyHolder.getInstancia();
		String l1 = lazy.toString();
		lazy = SigletonLazyHolder.getInstancia();
		String l2 = lazy.toString();
		
		
		Assert.assertEquals(l1, l2);
	}

}

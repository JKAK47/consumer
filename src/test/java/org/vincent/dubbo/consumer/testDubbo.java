package org.vincent.dubbo.consumer;
 
import org.junit.Test;
import org.junit.runner.RunWith;
import org.service.api.Say;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:Application.xml" })
public class testDubbo {

	@Autowired
	private Say customersay;
	@Test
	public void testdubbo() {
		System.out.println(customersay.getName());
		System.out.println("sdf");
	}

}

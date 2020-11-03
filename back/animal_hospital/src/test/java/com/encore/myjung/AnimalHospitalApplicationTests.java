package com.encore.myjung;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.encore.mijung.domain.Customer;
import com.encore.mijung.repo.CustomerDAO;
import com.encore.mijung.service.CustomerService;


@SpringBootTest
class AnimalHospitalApplicationTests {

	@Test
	void contextLoads() throws Exception {
		ApplicationContext context =
				new ClassPathXmlApplicationContext(new String[] {	"/config/SqlMapConfig.xml"	 });
		
		CustomerService customersService= (CustomerService)context.getBean("mybatis-customer-mapping");
		
	}

}

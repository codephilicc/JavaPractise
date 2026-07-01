package com.practice.spring.springorm.product.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practice.spring.springorm.entity.Product;
import com.practice.spring.springorm.product.dao.ProductDao;

public class Test {

	public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("com/practice/spring/springorm/product/test/config.xml");
			ProductDao productDao = (ProductDao) context.getBean("productDao");
		    Product product = new Product();
		    product.setId(1);
		    product.setName("Iphone");
		    product.setDesc("its awesome!!");
		    product.setPrice(700);
			productDao.create(product);
	}

}

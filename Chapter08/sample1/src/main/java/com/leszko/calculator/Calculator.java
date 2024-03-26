package com.leszko.calculator;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * This Calculator class computes the sum of two numbers
 */
@Service
public class Calculator {
        final static int UML_NUMBER1 = 3;
	@Cacheable("sum")
	public int sum(int a, int b) {
		return a + b;
	}

	@Cacheable("div")
        public int div(int a, int b) {
                return a / b;
        }
}

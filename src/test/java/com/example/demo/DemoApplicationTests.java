package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class DemoApplicationTests {

	Calculator underTest = new Calculator();
	@Test
	void itshouldAddTwoNumbers() {
		//given
		int numberOne= 20;
		int numberTwo =30;

		//When

		int result=	underTest.add(numberOne, numberTwo);

		//then
		int expectedValue =50;
		assertThat(result).isEqualTo(expectedValue);

	}


	class Calculator{
		int add (int a , int b){
			return a+b;
		}
	}

}

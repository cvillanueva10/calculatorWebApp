package com.adrianacala.pojo;

import java.math.BigDecimal;

public class Input {

	private BigDecimal firstNumber, secondNumber;
	private String operator;

	public BigDecimal getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(BigDecimal firstNumber) {
		this.firstNumber = firstNumber;
	}

	public BigDecimal getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(BigDecimal secondNumber) {
		this.secondNumber = secondNumber;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}
	
}

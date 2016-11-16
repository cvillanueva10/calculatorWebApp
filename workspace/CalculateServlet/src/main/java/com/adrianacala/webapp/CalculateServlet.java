package com.adrianacala.webapp;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adrianacala.pojo.Input;
import com.adrianacala.pojo.Output;


@RestController
@EnableAutoConfiguration
public class CalculateServlet{

	static final Logger log = LoggerFactory.getLogger(CalculateServlet.class);

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ResponseEntity<Output> get(@RequestBody Input input) throws IllegalOperatorException, IllegalNumberException, IllegalDivisionException{
		log.debug("#1=" + input.getFirstNumber());
		log.debug("#2=" + input.getSecondNumber());
		log.debug("operator=" + input.getOperator());

		Output output = new Output();

		if (input.getOperator().equals("+")){
			output.setOutput(input.getFirstNumber().add(input.getSecondNumber()).toString());
		}
		else if (input.getOperator().equals("-")){
			output.setOutput(input.getFirstNumber().subtract(input.getSecondNumber()).toString());
		}
		else if (input.getOperator().equals("*")){
			output.setOutput(input.getFirstNumber().multiply(input.getSecondNumber()).toString());
		}
		else if (input.getOperator().equals("/")){
			try {
				BigDecimal result  = (input.getFirstNumber().divide(input.getSecondNumber()));
			}
			catch(ArithmeticException e){
				log.error("error=division by zero");
				IllegalDivisionException up = new IllegalDivisionException("Exception caught: Division by zero.");
				throw up;
			}
			output.setOutput(input.getFirstNumber().divide(input.getSecondNumber()).toString());
		}
		else {
			log.error("error=invalid operator");
			IllegalOperatorException up = new IllegalOperatorException("Invalid Operator");
			throw up;
		}

		log.debug("output=" + output);

		return new ResponseEntity<Output>(output, HttpStatus.OK);
	}
}
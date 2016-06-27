package com.adrianacala.webapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.adrianacala.pojo.Input;
import com.google.gson.Gson;

/**
 * Servlet implementation class CalculateServlet
 */
@WebServlet("/CalculateServlet")
public class CalculateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("1");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader in = request.getReader();
		StringBuilder input = new StringBuilder();
		String line;
		while ((line=in.readLine())!=null){
			input.append(line);
		}
		
		Gson gson = new Gson();
		
		Input inputObj = gson.fromJson(input.toString(), Input.class);
		BigDecimal firstNumber, secondNumber;
		
		
		try {
			firstNumber = new BigDecimal(inputObj.getFirstNumber());
			secondNumber = new BigDecimal(inputObj.getSecondNumber());
		} catch (NumberFormatException e) {
			response.getWriter().append("Invalid Operation");
			return;
		}
		
		if (inputObj.getOperator().equals("+")){
			response.getWriter().append(String.valueOf(firstNumber.add(secondNumber)));
		}
		else if (inputObj.getOperator().equals("-")){
			response.getWriter().append(String.valueOf(firstNumber.subtract(secondNumber)));
		}
		else if (inputObj.getOperator().equals("*")){
			response.getWriter().append(String.valueOf(firstNumber.multiply(secondNumber)));
		}
		else if (inputObj.getOperator().equals("/")){
			response.getWriter().append(String.valueOf(firstNumber.divide(secondNumber)));
		}
		
		//response.getWriter().append(String.valueOf((int)(Math.random()*100)));
	}

}

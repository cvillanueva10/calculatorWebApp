package com.adrianacala.webapp;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adrianacala.pojo.Input;
import com.adrianacala.pojo.Output;
/**
 * Servlet implementation class CalculateServlet
 */


@RestController
@EnableAutoConfiguration
public class CalculateServlet {

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ResponseEntity<Output> get(@RequestBody Input input){

		//		BufferedReader in = request.getReader();
		//		StringBuilder input = new StringBuilder();
		//		String line;
		//	while ((line=in.readLine())!=null){
		//			input.append(line);
		//		}


		Output output = new Output();

		

		//		try {
		//			firstNumber = new BigDecimal(inputObj.getFirstNumber());
		//			secondNumber = new BigDecimal(inputObj.getSecondNumber());
		//		} catch (NumberFormatException e) {
		//			response.getWriter().append("Invalid Operation");
		//			return;
		//		}
		//		
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
					output.setOutput(input.getFirstNumber().divide(input.getSecondNumber()).toString());
				}
		//		if (inputObj.getOperator().equals("+")){
		//			response.getWriter().append(String.valueOf(firstNumber.add(secondNumber)));
		//		}
		//		else if (inputObj.getOperator().equals("-")){
		//			response.getWriter().append(String.valueOf(firstNumber.subtract(secondNumber)));
		//		}
		//		else if (inputObj.getOperator().equals("*")){
		//			response.getWriter().append(String.valueOf(firstNumber.multiply(secondNumber)));
		//		}
		//		else if (inputObj.getOperator().equals("/")){
		//			response.getWriter().append(String.valueOf(firstNumber.divide(secondNumber)));
		//		}
		//	
		return new ResponseEntity<Output>(output, HttpStatus.OK);
	}
	//	public static void main(String[] args) throws Exception {
	//		SpringApplication.run(CalculateServlet.class, args);
	//	}
}
//@WebServlet("/CalculateServlet")
//public class CalculateServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public CalculateServlet() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("1");
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	//@RequestMapping(value = "/")
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		
//		
//		BufferedReader in = request.getReader();
//		StringBuilder input = new StringBuilder();
//		String line;
//		while ((line=in.readLine())!=null){
//			input.append(line);
//		}
//		
//		Gson gson = new Gson();
//		
//		Input inputObj = gson.fromJson(input.toString(), Input.class);
//		BigDecimal firstNumber, secondNumber;
//		
//		
//		try {
//			firstNumber = new BigDecimal(inputObj.getFirstNumber());
//			secondNumber = new BigDecimal(inputObj.getSecondNumber());
//		} catch (NumberFormatException e) {
//			response.getWriter().append("Invalid Operation");
//			return;
//		}
//		
//		if (inputObj.getOperator().equals("+")){
//			response.getWriter().append(String.valueOf(firstNumber.add(secondNumber)));
//		}
//		else if (inputObj.getOperator().equals("-")){
//			response.getWriter().append(String.valueOf(firstNumber.subtract(secondNumber)));
//		}
//		else if (inputObj.getOperator().equals("*")){
//			response.getWriter().append(String.valueOf(firstNumber.multiply(secondNumber)));
//		}
//		else if (inputObj.getOperator().equals("/")){
//			response.getWriter().append(String.valueOf(firstNumber.divide(secondNumber)));
//		}
//		
//		//response.getWriter().append(String.valueOf((int)(Math.random()*100)));
//	}
//
//}
//

package com.adrianacala.webapp;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExceptionHandlingController {

  // @RequestHandler methods
  
  // Exception handling methods
  
  // Convert a predefined exception to an HTTP Status code
  @ResponseStatus(value=HttpStatus.BAD_REQUEST, reason="Invalid Operator")  // 409
  @ExceptionHandler(IllegalOperatorException.class)
  public void invalidOperator() {
    // Nothing to do
  }

  
  @ResponseStatus(value=HttpStatus.UNSUPPORTED_MEDIA_TYPE, reason="Invalid Number")  // 409
@ExceptionHandler(IllegalNumberException.class)
public void invalidNumber() {
	  
	  
  }
  // Total control - setup a model and return the view name yourself. Or
  // consider subclassing ExceptionHandlerExceptionResolver (see below).
  @ExceptionHandler(Exception.class)
  public ModelAndView handleError(HttpServletRequest req, Exception ex) {
    ModelAndView mav = new ModelAndView();
    mav.addObject("exception", ex);
    mav.addObject("url", req.getRequestURL());
    mav.setViewName("error");
    return mav;
  }
}
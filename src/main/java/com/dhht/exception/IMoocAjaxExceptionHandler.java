package com.dhht.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.dhht.pojo.IMoocJSONResult;


//@RestControllerAdvice   //直接将ajax中的异常返回到前段页面上
//@ControllerAdvice
public class IMoocAjaxExceptionHandler {

   @ExceptionHandler(value = Exception.class)
   //@ResponseBody
	public IMoocJSONResult defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
		e.printStackTrace();
		return IMoocJSONResult.errorException(e.getMessage());
	}
}

package react.boot.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


@ControllerAdvice
public class UserNotFountAdvice {
	@ResponseBody
	@ExceptionHandler(UserNotFoundExeption.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
public Map<String,String> exceptionHandler(UserNotFoundExeption exeption){
	Map<String, String> errorMap= new HashMap<>();
	errorMap.put("Error Massage",exeption.getMessage());
	return errorMap;
}
}

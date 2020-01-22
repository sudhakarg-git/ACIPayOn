package com.belk.payon.exception;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.belk.payon.authtoken.model.AuthTokenResponse;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler{
	
	private final static Logger LOG = LoggerFactory.getLogger(CustomizedResponseEntityExceptionHandler.class);
	
	
	
	@ExceptionHandler(HttpClientErrorException.class)
	public final ResponseEntity<AuthTokenResponse> handleAllExceptions(HttpClientErrorException ex, WebRequest request) throws JsonParseException, JsonMappingException, IOException  {
		AuthTokenResponse  response =  null;
		if(ex.getStatusCode() == HttpStatus.BAD_REQUEST) {
			String responseString = ex.getResponseBodyAsString();
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
			response = mapper.readValue(responseString, AuthTokenResponse.class);
			LOG.info("Response Code :"+response.getResult().getCode());
			
		}
		return new ResponseEntity<AuthTokenResponse>(response,HttpStatus.BAD_REQUEST);
	}
	
//	@ExceptionHandler(DomOrderRetrievalException.class)
//	public final ResponseEntity<DOMExceptionResponse> handleAllExceptions(DomOrderRetrievalException ex, WebRequest request)  {
//		DOMExceptionResponse domExceptionResponse = new DOMExceptionResponse(new Date(),ex.getMessage(),request.getDescription(false));
//		if (LOGGER.isDebugEnabled()) {
//		LOGGER.debug("Exception Occured : {}", domExceptionResponse.getMessage());
//		}
//		return new ResponseEntity<DOMExceptionResponse>(domExceptionResponse,HttpStatus.NOT_FOUND);
//	}

}

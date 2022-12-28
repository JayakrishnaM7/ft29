package com.ibm.dip.restprocessors;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import java.io.IOException;

public interface RestApiInterface {

	public RequestEntity<Object> preProcessor(String requestObj) throws IOException;
	public String postProcessor(String requestObj, ResponseEntity<Object> responseEntity);
	public Object exceptionMessage(Exception e, String requestObj);
}

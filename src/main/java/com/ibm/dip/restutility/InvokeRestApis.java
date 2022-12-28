package com.ibm.dip.restutility;

import com.ibm.dip.restprocessors.RestApiInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class InvokeRestApis {
	private static final Logger logger = LoggerFactory.getLogger(InvokeRestApis.class);
		
		
	public String processMessage(String requestObj,RestApiInterface apiInterface) throws Exception{
		// NOSONAR

		// calling preprocessor
		logger.info("Message received for processing.");
		RequestEntity<Object> requestEntity = apiInterface.preProcessor(requestObj);

		// calling rest api
		logger.info("Calling API.");
		ResponseEntity<Object> responseEntity =invokeApi(requestEntity);


		// calling postprocessor
		logger.info("About to call post processor.");
		return apiInterface.postProcessor(requestObj,responseEntity);
	}
	
	public ResponseEntity<Object> invokeApi(RequestEntity<Object> request) {
		logger.info("About to call InvokeRestApis.invokeApi().");
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.exchange(request,Object.class);
		
	}
}

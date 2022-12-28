package com.ibm.dip.adapters;


import com.ibm.dip.restprocessors.impl.*;
import com.ibm.dip.restutility.Utility;
import com.ibm.dip.model.error.ApiError;
import com.ibm.dip.model.error.GenericError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;


@Component
public class Paymentexecution implements JavaDelegate{

    @Autowired
    private Utility utility;

    @Autowired
    private PaymentexecutionRestProcessor restProcessor;

    private final static Logger LOGGER = Logger.getLogger(Paymentexecution.class.getName());

     @Override
    public void execute(DelegateExecution execution) throws Exception {
         LOGGER.info("Adapter execution started");
         String request = (String) execution.getVariable("jsonRequest");
         Object response = utility.processMsg(request, restProcessor);
         if(response instanceof ApiError ||  response instanceof GenericError){
            //Failure Path
            throw new RuntimeException("Error occurred in the adapter:"+Paymentexecution.class.getName());
         }else{
            //success Path - enrich or transform the respone object here
         }
    }

}

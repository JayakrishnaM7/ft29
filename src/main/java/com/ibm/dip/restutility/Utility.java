package com.ibm.dip.restutility;

import com.ibm.dip.restprocessors.RestApiInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import com.bazaarvoice.jolt.Chainr;
import com.bazaarvoice.jolt.JsonUtils;
import java.io.InputStream;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

@Component
public class Utility {

    private final static Logger LOGGER = Logger.getLogger(Utility.class.getName());

    @Autowired
    private InvokeRestApis invokeRestApis;

    public Object processMsg(String requestObj, RestApiInterface restApiInterface ) {
        try {
            LOGGER.info("Inside Utility.processMsg" );
            return invokeRestApis.processMessage(requestObj,restApiInterface);
        }
        catch(Exception e) {
            return restApiInterface.exceptionMessage(e,requestObj);
        }
    }

    /**
     * This method applies the JOLT file (in the resource folder) on the JSON request and returns the tranformed object
     * @param request
     * @param joltFileName
     * @return transformedJSONRequest
     * @throws IOException
     */
    public String transformRequestUsingJOLT(String request, String joltFileName) throws IOException {
        //Read the file from resources folder
        Resource resource = new ClassPathResource(joltFileName);
        InputStream input = resource.getInputStream();

        List chainrSpecJSON = JsonUtils.jsonToList(input);
        Chainr chainr = Chainr.fromSpec(chainrSpecJSON);
        Object inputJSON = JsonUtils.jsonToObject(request);
        String transformedObj= JsonUtils.toJsonString(chainr.transform(inputJSON));
        LOGGER.info("transformed object is:" +transformedObj);
        return transformedObj;
    }


}

package com.mulesoft.testcase;

import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;

public class HelloWorldTest extends FunctionalTestCase {

    @Test
    public void cicdFlowReturnsHelloMaven() throws Exception {
        runFlowAndExpect("cicd-exampleFlow", "Hello Maven");
    }
    
  
    
    @Override
    protected String getConfigFile() {
        return "cicd-example.xml";
    }

}

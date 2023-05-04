package it.ua.finedefinition.rest;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.mockito.Mockito;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import ua.finedefinition.rest.RestResource;
import ua.finedefinition.rest.RestResourceModel;
import org.apache.wink.client.Resource;
import org.apache.wink.client.RestClient;

public class RestResourceFuncTest {

    @Before
    public void setup() {

    }

    @After
    public void tearDown() {

    }

    @Test
    public void messageIsValid() {

        String baseUrl = System.getProperty("baseurl");
        String resourceUrl = baseUrl + "/rest/app/1.0/message";

        RestClient client = new RestClient();
        Resource resource = client.resource(resourceUrl);

        RestResourceModel message = resource.get(RestResourceModel.class);

        assertEquals("wrong message","Hello World",message.getMessage());
    }
}

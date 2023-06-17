
package org.fusioproject.sdk;

import app.sdkgen.client.Exception.Authenticator.InvalidCredentialsException;
import org.junit.Assert;
import org.junit.Test;

public class ClientTest {

    @Test
    public void testClient() throws InvalidCredentialsException {
        Client client = new Client("https://demo.fusio-project.org/", "test", "FRsNh1zKCXlB");

        Assert.assertNotNull(client.backend());
        Assert.assertNotNull(client.consumer());
    }

}

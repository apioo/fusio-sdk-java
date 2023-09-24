
package org.fusioproject.sdk;

import app.sdkgen.client.Credentials.OAuth2;
import app.sdkgen.client.Exception.Authenticator.InvalidCredentialsException;
import org.junit.Assert;
import org.junit.Test;

public class ClientTest {

    @Test
    public void testClient() throws InvalidCredentialsException {
        Client client = new Client("https://demo.fusio-project.org/", new OAuth2("test", "FRsNh1zKCXlB", "https://demo.fusio-project.org/authorization/token", ""));

        Assert.assertNotNull(client.backend());
        Assert.assertNotNull(client.consumer());
    }

}

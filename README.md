
# Fusio Java SDK

This is the official Fusio Java SDK, it helps to talk to the Fusio REST API.
Fusio is an open source API management system, more information at:
https://www.fusio-project.org

## Usage

The following example shows how you can get all registered routes at the backend.
A working example is also available at: https://github.com/apioo/fusio-sample-java-cli

```java
package org.fusioproject.sample;

import app.sdkgen.client.TokenStore.MemoryTokenStore;
import app.sdkgen.client.TokenStoreInterface;
import org.fusioproject.sdk.Client;
import org.fusioproject.sdk.backend.BackendRoutesResource;
import org.fusioproject.sdk.backend.CollectionCategoryQuery;
import org.fusioproject.sdk.backend.RouteCollection;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws URISyntaxException, IOException {
        List<String> scopes = new ArrayList<>();
        scopes.add("backend");
        TokenStoreInterface tokenStore = new MemoryTokenStore();

        Client client = new Client("https://demo.fusio-project.org/", "test", "FRsNh1zKCXlB", scopes, tokenStore);

        BackendRoutesResource routes = client.backend().getBackendRoutes();
        RouteCollection collection = routes.backendActionRouteGetAll(new CollectionCategoryQuery());

        System.out.println("Routes:");
        for (int i = 0; i < collection.getEntry().length; i++) {
            System.out.println("* " + collection.getEntry()[i].getPath());
        }
    }

}
```

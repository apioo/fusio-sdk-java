
# Fusio Java SDK

This is the official Fusio Java SDK, it helps to talk to the Fusio (https://www.fusio-project.org/)
open source API management system.

## Usage

The following example shows how you can get all registered routes at the backend.
A working example is also available at: https://github.com/apioo/fusio-sample-java-cli

```java
package org.fusioproject.sample;

import app.sdkgen.client.TokenStore.MemoryTokenStore;
import app.sdkgen.client.TokenStoreInterface;
import org.fusioproject.sdk.Client;
import org.fusioproject.sdk.backend.BackendRoutesResource;
import org.fusioproject.sdk.backend.Collection_Category_Query;
import org.fusioproject.sdk.backend.Route_Collection;

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

        BackendRoutesResource resource = client.backend().backendRoute().getBackendRoutes();
        Route_Collection collection = resource.backendActionRouteGetAll(new Collection_Category_Query());

        System.out.println("Routes:");
        for (int i = 0; i < collection.getEntry().length; i++) {
            System.out.println("* " + collection.getEntry()[i].getPath());
        }
    }

}
```

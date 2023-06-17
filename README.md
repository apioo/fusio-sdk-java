
# Fusio Java SDK

This is the official Fusio Java SDK, it helps to talk to the Fusio REST API.
Fusio is an open source API management system, more information at:
https://www.fusio-project.org

## Usage

The following example shows how you can get all registered routes at the backend.
A working example is also available at: https://github.com/apioo/fusio-sample-java-cli

```java
package org.fusioproject.sample;

import app.sdkgen.client.Exception.ClientException;
import app.sdkgen.client.TokenStore.MemoryTokenStore;
import app.sdkgen.client.TokenStoreInterface;
import org.fusioproject.sdk.Client;
import org.fusioproject.sdk.backend.Operation;
import org.fusioproject.sdk.backend.OperationCollection;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ClientException {
        List<String> scopes = new ArrayList<>();
        scopes.add("backend");
        TokenStoreInterface tokenStore = new MemoryTokenStore();

        Client client = new Client("https://demo.fusio-project.org/", "test", "FRsNh1zKCXlB", scopes, tokenStore);

        OperationCollection collection = client.backend().operation().getAll();

        System.out.println("Operations:");
        for (int i = 0; i < collection.getEntry().length; i++) {
            Operation operation = collection.getEntry()[i];

            System.out.println("* " + operation.getHttpMethod() + " " + operation.getHttpPath() + " => " + operation.getName());
        }
    }

}
```

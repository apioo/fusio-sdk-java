/**
 * CommonMessageException automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import app.sdkgen.client.Exception.KnownStatusCodeException;

public class CommonMessageException extends KnownStatusCodeException {

    private CommonMessage payload;

    public CommonMessageException(CommonMessage payload) {
        super("The server returned an error");

        this.payload = payload;
    }

    public CommonMessage getPayload() {
        return this.payload;
    }

}
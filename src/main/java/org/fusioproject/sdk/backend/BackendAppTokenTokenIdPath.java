/**
 * BackendAppTokenTokenIdPath automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class BackendAppTokenTokenIdPath {
    private String tokenId;
    @JsonSetter("token_id")
    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }
    @JsonGetter("token_id")
    public String getTokenId() {
        return this.tokenId;
    }
}

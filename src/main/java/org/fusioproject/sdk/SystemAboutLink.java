/**
 * SystemAboutLink automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.*;

public class SystemAboutLink {
    private String rel;
    private String href;

    @JsonSetter("rel")
    public void setRel(String rel) {
        this.rel = rel;
    }

    @JsonGetter("rel")
    public String getRel() {
        return this.rel;
    }

    @JsonSetter("href")
    public void setHref(String href) {
        this.href = href;
    }

    @JsonGetter("href")
    public String getHref() {
        return this.href;
    }
}


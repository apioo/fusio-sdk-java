/**
 * SystemTag automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import app.sdkgen.client.Exception.ClientException;
import app.sdkgen.client.Exception.UnknownStatusCodeException;
import app.sdkgen.client.Parser;
import app.sdkgen.client.TagAbstract;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.*;
import org.apache.hc.client5.http.entity.UrlEncodedFormEntity;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.io.entity.*;
import org.apache.hc.core5.net.URIBuilder;
import org.apache.hc.core5.net.URLEncodedUtils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SystemTag extends TagAbstract {
    public SystemTag(HttpClient httpClient, ObjectMapper objectMapper, Parser parser) {
        super(httpClient, objectMapper, parser);
    }

    public SystemConnectionTag connection()
    {
        return new SystemConnectionTag(
            this.httpClient,
            this.objectMapper,
            this.parser
        );
    }

    public SystemMetaTag meta()
    {
        return new SystemMetaTag(
            this.httpClient,
            this.objectMapper,
            this.parser
        );
    }

    public SystemPaymentTag payment()
    {
        return new SystemPaymentTag(
            this.httpClient,
            this.objectMapper,
            this.parser
        );
    }


}

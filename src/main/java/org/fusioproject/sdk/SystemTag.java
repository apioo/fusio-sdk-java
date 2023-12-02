/**
 * SystemTag automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import app.sdkgen.client.Exception.ClientException;
import app.sdkgen.client.Exception.UnknownStatusCodeException;
import app.sdkgen.client.Parser;
import app.sdkgen.client.TagAbstract;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.*;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.apache.hc.core5.net.URIBuilder;

import java.io.IOException;
import java.net.URISyntaxException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class SystemTag extends TagAbstract {
    public SystemTag(HttpClient httpClient, ObjectMapper objectMapper, Parser parser) {
        super(httpClient, objectMapper, parser);
    }

    public SystemPaymentTag payment()
    {
        return new SystemPaymentTag(
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

    public SystemConnectionTag connection()
    {
        return new SystemConnectionTag(
            this.httpClient,
            this.objectMapper,
            this.parser
        );
    }


}

/**
 * LogTag automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import app.sdkgen.client.Exception.ClientException;
import app.sdkgen.client.Exception.UnknownStatusCodeException;
import app.sdkgen.client.Parser;
import app.sdkgen.client.TagAbstract;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.*;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class LogTag extends TagAbstract {
    public LogTag(HttpClient httpClient, ObjectMapper objectMapper, Parser parser) {
        super(httpClient, objectMapper, parser);
    }


    public Log get(String logId) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("log_id", logId);

            Map<String, Object> queryParams = new HashMap<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/log/$log_id&lt;[0-9]+&gt;", pathParams));
            this.parser.query(builder, queryParams);

            HttpGet request = new HttpGet(builder.build());

            HttpResponse response = this.httpClient.execute(request);
            int statusCode = response.getStatusLine().getStatusCode();

            if (statusCode >= 200 && statusCode < 300) {
                return this.parser.parse(EntityUtils.toString(response.getEntity(), "UTF-8"), Log.class);
            }

            switch (statusCode) {
                default:
                    throw new UnknownStatusCodeException("The server returned an unknown status code");
            }
        } catch (URISyntaxException | IOException e) {
            throw new ClientException("An unknown error occurred: " + e.getMessage(), e);
        }
    }

    public LogCollection getAll() throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();

            Map<String, Object> queryParams = new HashMap<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/log", pathParams));
            this.parser.query(builder, queryParams);

            HttpGet request = new HttpGet(builder.build());

            HttpResponse response = this.httpClient.execute(request);
            int statusCode = response.getStatusLine().getStatusCode();

            if (statusCode >= 200 && statusCode < 300) {
                return this.parser.parse(EntityUtils.toString(response.getEntity(), "UTF-8"), LogCollection.class);
            }

            switch (statusCode) {
                default:
                    throw new UnknownStatusCodeException("The server returned an unknown status code");
            }
        } catch (URISyntaxException | IOException e) {
            throw new ClientException("An unknown error occurred: " + e.getMessage(), e);
        }
    }

    public LogError getError(String errorId) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("error_id", errorId);

            Map<String, Object> queryParams = new HashMap<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/log/error/$error_id&lt;[0-9]+&gt;", pathParams));
            this.parser.query(builder, queryParams);

            HttpGet request = new HttpGet(builder.build());

            HttpResponse response = this.httpClient.execute(request);
            int statusCode = response.getStatusLine().getStatusCode();

            if (statusCode >= 200 && statusCode < 300) {
                return this.parser.parse(EntityUtils.toString(response.getEntity(), "UTF-8"), LogError.class);
            }

            switch (statusCode) {
                default:
                    throw new UnknownStatusCodeException("The server returned an unknown status code");
            }
        } catch (URISyntaxException | IOException e) {
            throw new ClientException("An unknown error occurred: " + e.getMessage(), e);
        }
    }

    public LogErrorCollection getAllErrors() throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();

            Map<String, Object> queryParams = new HashMap<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/log/error", pathParams));
            this.parser.query(builder, queryParams);

            HttpGet request = new HttpGet(builder.build());

            HttpResponse response = this.httpClient.execute(request);
            int statusCode = response.getStatusLine().getStatusCode();

            if (statusCode >= 200 && statusCode < 300) {
                return this.parser.parse(EntityUtils.toString(response.getEntity(), "UTF-8"), LogErrorCollection.class);
            }

            switch (statusCode) {
                default:
                    throw new UnknownStatusCodeException("The server returned an unknown status code");
            }
        } catch (URISyntaxException | IOException e) {
            throw new ClientException("An unknown error occurred: " + e.getMessage(), e);
        }
    }


}

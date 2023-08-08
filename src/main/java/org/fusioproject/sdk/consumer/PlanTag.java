/**
 * PlanTag automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.consumer;

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

public class PlanTag extends TagAbstract {
    public PlanTag(HttpClient httpClient, ObjectMapper objectMapper, Parser parser) {
        super(httpClient, objectMapper, parser);
    }


    public Plan get(String planId) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("plan_id", planId);

            Map<String, Object> queryParams = new HashMap<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/consumer/plan/$plan_id<[0-9]+>", pathParams));
            this.parser.query(builder, queryParams);

            HttpGet request = new HttpGet(builder.build());

            HttpResponse response = this.httpClient.execute(request);
            int statusCode = response.getStatusLine().getStatusCode();

            if (statusCode >= 200 && statusCode < 300) {
                return this.parser.parse(EntityUtils.toString(response.getEntity(), "UTF-8"), Plan.class);
            }

            switch (statusCode) {
                case 401:
                    throw new MessageException(this.parser.parse(EntityUtils.toString(response.getEntity(), "UTF-8"), Message.class));
                case 404:
                    throw new MessageException(this.parser.parse(EntityUtils.toString(response.getEntity(), "UTF-8"), Message.class));
                case 410:
                    throw new MessageException(this.parser.parse(EntityUtils.toString(response.getEntity(), "UTF-8"), Message.class));
                case 500:
                    throw new MessageException(this.parser.parse(EntityUtils.toString(response.getEntity(), "UTF-8"), Message.class));
                default:
                    throw new UnknownStatusCodeException("The server returned an unknown status code");
            }
        } catch (URISyntaxException | IOException e) {
            throw new ClientException("An unknown error occurred: " + e.getMessage(), e);
        }
    }

    public PlanCollection getAll(int startIndex, int count, String search) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();

            Map<String, Object> queryParams = new HashMap<>();
            queryParams.put("startIndex", startIndex);
            queryParams.put("count", count);
            queryParams.put("search", search);

            URIBuilder builder = new URIBuilder(this.parser.url("/consumer/plan", pathParams));
            this.parser.query(builder, queryParams);

            HttpGet request = new HttpGet(builder.build());

            HttpResponse response = this.httpClient.execute(request);
            int statusCode = response.getStatusLine().getStatusCode();

            if (statusCode >= 200 && statusCode < 300) {
                return this.parser.parse(EntityUtils.toString(response.getEntity(), "UTF-8"), PlanCollection.class);
            }

            switch (statusCode) {
                case 401:
                    throw new MessageException(this.parser.parse(EntityUtils.toString(response.getEntity(), "UTF-8"), Message.class));
                case 500:
                    throw new MessageException(this.parser.parse(EntityUtils.toString(response.getEntity(), "UTF-8"), Message.class));
                default:
                    throw new UnknownStatusCodeException("The server returned an unknown status code");
            }
        } catch (URISyntaxException | IOException e) {
            throw new ClientException("An unknown error occurred: " + e.getMessage(), e);
        }
    }


}

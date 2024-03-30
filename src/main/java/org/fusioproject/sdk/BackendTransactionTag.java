/**
 * BackendTransactionTag automatically generated by SDKgen please do not edit this file manually
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BackendTransactionTag extends TagAbstract {
    public BackendTransactionTag(HttpClient httpClient, ObjectMapper objectMapper, Parser parser) {
        super(httpClient, objectMapper, parser);
    }


    public BackendTransaction get(String transactionId) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("transaction_id", transactionId);

            Map<String, Object> queryParams = new HashMap<>();

            List<String> queryStructNames = new ArrayList<String>();

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/transaction/$transaction_id<[0-9]+>", pathParams));
            this.parser.query(builder, queryParams, queryStructNames);

            HttpGet request = new HttpGet(builder.build());

            final Parser.HttpReturn resp = this.httpClient.execute(request, response -> {
                return this.parser.handle(response.getCode(), EntityUtils.toString(response.getEntity()));
            });

            if (resp.code >= 200 && resp.code < 300) {
                return this.parser.parse(resp.payload, BackendTransaction.class);
            }

            switch (resp.code) {
                case 401:
                    throw new CommonMessageException(this.parser.parse(resp.payload, CommonMessage.class));
                case 404:
                    throw new CommonMessageException(this.parser.parse(resp.payload, CommonMessage.class));
                case 410:
                    throw new CommonMessageException(this.parser.parse(resp.payload, CommonMessage.class));
                case 500:
                    throw new CommonMessageException(this.parser.parse(resp.payload, CommonMessage.class));
                default:
                    throw new UnknownStatusCodeException("The server returned an unknown status code");
            }
        } catch (URISyntaxException | IOException e) {
            throw new ClientException("An unknown error occurred: " + e.getMessage(), e);
        }
    }

    public BackendTransactionCollection getAll(Integer startIndex, Integer count, String search, String from, String to, Integer planId, Integer userId, Integer appId, String status, String provider) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();

            Map<String, Object> queryParams = new HashMap<>();
            queryParams.put("startIndex", startIndex);
            queryParams.put("count", count);
            queryParams.put("search", search);
            queryParams.put("from", from);
            queryParams.put("to", to);
            queryParams.put("planId", planId);
            queryParams.put("userId", userId);
            queryParams.put("appId", appId);
            queryParams.put("status", status);
            queryParams.put("provider", provider);

            List<String> queryStructNames = new ArrayList<String>();

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/transaction", pathParams));
            this.parser.query(builder, queryParams, queryStructNames);

            HttpGet request = new HttpGet(builder.build());

            final Parser.HttpReturn resp = this.httpClient.execute(request, response -> {
                return this.parser.handle(response.getCode(), EntityUtils.toString(response.getEntity()));
            });

            if (resp.code >= 200 && resp.code < 300) {
                return this.parser.parse(resp.payload, BackendTransactionCollection.class);
            }

            switch (resp.code) {
                case 401:
                    throw new CommonMessageException(this.parser.parse(resp.payload, CommonMessage.class));
                case 500:
                    throw new CommonMessageException(this.parser.parse(resp.payload, CommonMessage.class));
                default:
                    throw new UnknownStatusCodeException("The server returned an unknown status code");
            }
        } catch (URISyntaxException | IOException e) {
            throw new ClientException("An unknown error occurred: " + e.getMessage(), e);
        }
    }


}

/**
 * BackendAppTag automatically generated by SDKgen please do not edit this file manually
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

public class BackendAppTag extends TagAbstract {
    public BackendAppTag(HttpClient httpClient, ObjectMapper objectMapper, Parser parser) {
        super(httpClient, objectMapper, parser);
    }


    public CommonMessage deleteToken(String appId, String tokenId) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("app_id", appId);
            pathParams.put("token_id", tokenId);

            Map<String, Object> queryParams = new HashMap<>();

            List<String> queryStructNames = new ArrayList<String>();

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/app/$app_id<[0-9]+>/token/:token_id", pathParams));
            this.parser.query(builder, queryParams, queryStructNames);

            HttpDelete request = new HttpDelete(builder.build());

            final Parser.HttpReturn resp = this.httpClient.execute(request, response -> {
                return this.parser.handle(response.getCode(), EntityUtils.toString(response.getEntity()));
            });

            if (resp.code >= 200 && resp.code < 300) {
                return this.parser.parse(resp.payload, CommonMessage.class);
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

    public CommonMessage delete(String appId) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("app_id", appId);

            Map<String, Object> queryParams = new HashMap<>();

            List<String> queryStructNames = new ArrayList<String>();

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/app/$app_id<[0-9]+>", pathParams));
            this.parser.query(builder, queryParams, queryStructNames);

            HttpDelete request = new HttpDelete(builder.build());

            final Parser.HttpReturn resp = this.httpClient.execute(request, response -> {
                return this.parser.handle(response.getCode(), EntityUtils.toString(response.getEntity()));
            });

            if (resp.code >= 200 && resp.code < 300) {
                return this.parser.parse(resp.payload, CommonMessage.class);
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

    public CommonMessage update(String appId, BackendAppUpdate payload) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("app_id", appId);

            Map<String, Object> queryParams = new HashMap<>();

            List<String> queryStructNames = new ArrayList<String>();

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/app/$app_id<[0-9]+>", pathParams));
            this.parser.query(builder, queryParams, queryStructNames);

            HttpPut request = new HttpPut(builder.build());
            request.addHeader("Content-Type", "application/json");
            request.setEntity(new StringEntity(this.objectMapper.writeValueAsString(payload), ContentType.APPLICATION_JSON));

            final Parser.HttpReturn resp = this.httpClient.execute(request, response -> {
                return this.parser.handle(response.getCode(), EntityUtils.toString(response.getEntity()));
            });

            if (resp.code >= 200 && resp.code < 300) {
                return this.parser.parse(resp.payload, CommonMessage.class);
            }

            switch (resp.code) {
                case 400:
                    throw new CommonMessageException(this.parser.parse(resp.payload, CommonMessage.class));
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

    public BackendApp get(String appId) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("app_id", appId);

            Map<String, Object> queryParams = new HashMap<>();

            List<String> queryStructNames = new ArrayList<String>();

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/app/$app_id<[0-9]+>", pathParams));
            this.parser.query(builder, queryParams, queryStructNames);

            HttpGet request = new HttpGet(builder.build());

            final Parser.HttpReturn resp = this.httpClient.execute(request, response -> {
                return this.parser.handle(response.getCode(), EntityUtils.toString(response.getEntity()));
            });

            if (resp.code >= 200 && resp.code < 300) {
                return this.parser.parse(resp.payload, BackendApp.class);
            }

            switch (resp.code) {
                case 404:
                    throw new CommonMessageException(this.parser.parse(resp.payload, CommonMessage.class));
                case 401:
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

    public CommonMessage create(BackendAppCreate payload) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();

            Map<String, Object> queryParams = new HashMap<>();

            List<String> queryStructNames = new ArrayList<String>();

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/app", pathParams));
            this.parser.query(builder, queryParams, queryStructNames);

            HttpPost request = new HttpPost(builder.build());
            request.addHeader("Content-Type", "application/json");
            request.setEntity(new StringEntity(this.objectMapper.writeValueAsString(payload), ContentType.APPLICATION_JSON));

            final Parser.HttpReturn resp = this.httpClient.execute(request, response -> {
                return this.parser.handle(response.getCode(), EntityUtils.toString(response.getEntity()));
            });

            if (resp.code >= 200 && resp.code < 300) {
                return this.parser.parse(resp.payload, CommonMessage.class);
            }

            switch (resp.code) {
                case 400:
                    throw new CommonMessageException(this.parser.parse(resp.payload, CommonMessage.class));
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

    public BackendAppCollection getAll(Integer startIndex, Integer count, String search) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();

            Map<String, Object> queryParams = new HashMap<>();
            queryParams.put("startIndex", startIndex);
            queryParams.put("count", count);
            queryParams.put("search", search);

            List<String> queryStructNames = new ArrayList<String>();

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/app", pathParams));
            this.parser.query(builder, queryParams, queryStructNames);

            HttpGet request = new HttpGet(builder.build());

            final Parser.HttpReturn resp = this.httpClient.execute(request, response -> {
                return this.parser.handle(response.getCode(), EntityUtils.toString(response.getEntity()));
            });

            if (resp.code >= 200 && resp.code < 300) {
                return this.parser.parse(resp.payload, BackendAppCollection.class);
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

    public BackendAppToken getToken(String tokenId) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("token_id", tokenId);

            Map<String, Object> queryParams = new HashMap<>();

            List<String> queryStructNames = new ArrayList<String>();

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/app/token/$token_id<[0-9]+>", pathParams));
            this.parser.query(builder, queryParams, queryStructNames);

            HttpGet request = new HttpGet(builder.build());

            final Parser.HttpReturn resp = this.httpClient.execute(request, response -> {
                return this.parser.handle(response.getCode(), EntityUtils.toString(response.getEntity()));
            });

            if (resp.code >= 200 && resp.code < 300) {
                return this.parser.parse(resp.payload, BackendAppToken.class);
            }

            switch (resp.code) {
                case 401:
                    throw new CommonMessageException(this.parser.parse(resp.payload, CommonMessage.class));
                case 404:
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

    public BackendAppTokenCollection getAllTokens(Integer startIndex, Integer count, String search, String from, String to, Integer appId, Integer userId, Integer status, String scope, String ip) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();

            Map<String, Object> queryParams = new HashMap<>();
            queryParams.put("startIndex", startIndex);
            queryParams.put("count", count);
            queryParams.put("search", search);
            queryParams.put("from", from);
            queryParams.put("to", to);
            queryParams.put("appId", appId);
            queryParams.put("userId", userId);
            queryParams.put("status", status);
            queryParams.put("scope", scope);
            queryParams.put("ip", ip);

            List<String> queryStructNames = new ArrayList<String>();

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/app/token", pathParams));
            this.parser.query(builder, queryParams, queryStructNames);

            HttpGet request = new HttpGet(builder.build());

            final Parser.HttpReturn resp = this.httpClient.execute(request, response -> {
                return this.parser.handle(response.getCode(), EntityUtils.toString(response.getEntity()));
            });

            if (resp.code >= 200 && resp.code < 300) {
                return this.parser.parse(resp.payload, BackendAppTokenCollection.class);
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

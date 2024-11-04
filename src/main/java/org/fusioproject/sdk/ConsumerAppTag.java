/**
 * ConsumerAppTag automatically generated by SDKgen please do not edit this file manually
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

public class ConsumerAppTag extends TagAbstract {
    public ConsumerAppTag(HttpClient httpClient, ObjectMapper objectMapper, Parser parser) {
        super(httpClient, objectMapper, parser);
    }


    public CommonMessage delete(String appId) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("app_id", appId);

            Map<String, Object> queryParams = new HashMap<>();

            List<String> queryStructNames = new ArrayList<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/consumer/app/$app_id<[0-9]+|^~>", pathParams));
            this.parser.query(builder, queryParams, queryStructNames);

            HttpDelete request = new HttpDelete(builder.build());


            return this.httpClient.execute(request, response -> {
                if (response.getCode() >= 200 && response.getCode() <= 299) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<CommonMessage>(){});

                    return data;
                }

                var statusCode = response.getCode();
                if (statusCode == 401) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<CommonMessage>(){});

                    throw new CommonMessageException(data);
                }

                if (statusCode == 404) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<CommonMessage>(){});

                    throw new CommonMessageException(data);
                }

                if (statusCode == 410) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<CommonMessage>(){});

                    throw new CommonMessageException(data);
                }

                if (statusCode == 500) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<CommonMessage>(){});

                    throw new CommonMessageException(data);
                }

                throw new UnknownStatusCodeException("The server returned an unknown status code: " + statusCode);
            });
        } catch (URISyntaxException | IOException e) {
            throw new ClientException("An unknown error occurred: " + e.getMessage(), e);
        }
    }

    public CommonMessage update(String appId, ConsumerAppUpdate payload) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("app_id", appId);

            Map<String, Object> queryParams = new HashMap<>();

            List<String> queryStructNames = new ArrayList<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/consumer/app/$app_id<[0-9]+|^~>", pathParams));
            this.parser.query(builder, queryParams, queryStructNames);

            HttpPut request = new HttpPut(builder.build());
            request.setEntity(new StringEntity(this.objectMapper.writeValueAsString(payload), ContentType.APPLICATION_JSON));

            request.setHeader("Content-Type", "application/json");

            return this.httpClient.execute(request, response -> {
                if (response.getCode() >= 200 && response.getCode() <= 299) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<CommonMessage>(){});

                    return data;
                }

                var statusCode = response.getCode();
                if (statusCode == 400) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<CommonMessage>(){});

                    throw new CommonMessageException(data);
                }

                if (statusCode == 401) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<CommonMessage>(){});

                    throw new CommonMessageException(data);
                }

                if (statusCode == 404) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<CommonMessage>(){});

                    throw new CommonMessageException(data);
                }

                if (statusCode == 410) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<CommonMessage>(){});

                    throw new CommonMessageException(data);
                }

                if (statusCode == 500) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<CommonMessage>(){});

                    throw new CommonMessageException(data);
                }

                throw new UnknownStatusCodeException("The server returned an unknown status code: " + statusCode);
            });
        } catch (URISyntaxException | IOException e) {
            throw new ClientException("An unknown error occurred: " + e.getMessage(), e);
        }
    }

    public ConsumerApp get(String appId) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("app_id", appId);

            Map<String, Object> queryParams = new HashMap<>();

            List<String> queryStructNames = new ArrayList<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/consumer/app/$app_id<[0-9]+|^~>", pathParams));
            this.parser.query(builder, queryParams, queryStructNames);

            HttpGet request = new HttpGet(builder.build());


            return this.httpClient.execute(request, response -> {
                if (response.getCode() >= 200 && response.getCode() <= 299) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<ConsumerApp>(){});

                    return data;
                }

                var statusCode = response.getCode();
                if (statusCode == 401) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<CommonMessage>(){});

                    throw new CommonMessageException(data);
                }

                if (statusCode == 404) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<CommonMessage>(){});

                    throw new CommonMessageException(data);
                }

                if (statusCode == 410) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<CommonMessage>(){});

                    throw new CommonMessageException(data);
                }

                if (statusCode == 500) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<CommonMessage>(){});

                    throw new CommonMessageException(data);
                }

                throw new UnknownStatusCodeException("The server returned an unknown status code: " + statusCode);
            });
        } catch (URISyntaxException | IOException e) {
            throw new ClientException("An unknown error occurred: " + e.getMessage(), e);
        }
    }

    public CommonMessage create(ConsumerAppCreate payload) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();

            Map<String, Object> queryParams = new HashMap<>();

            List<String> queryStructNames = new ArrayList<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/consumer/app", pathParams));
            this.parser.query(builder, queryParams, queryStructNames);

            HttpPost request = new HttpPost(builder.build());
            request.setEntity(new StringEntity(this.objectMapper.writeValueAsString(payload), ContentType.APPLICATION_JSON));

            request.setHeader("Content-Type", "application/json");

            return this.httpClient.execute(request, response -> {
                if (response.getCode() >= 200 && response.getCode() <= 299) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<CommonMessage>(){});

                    return data;
                }

                var statusCode = response.getCode();
                if (statusCode == 400) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<CommonMessage>(){});

                    throw new CommonMessageException(data);
                }

                if (statusCode == 401) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<CommonMessage>(){});

                    throw new CommonMessageException(data);
                }

                if (statusCode == 500) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<CommonMessage>(){});

                    throw new CommonMessageException(data);
                }

                throw new UnknownStatusCodeException("The server returned an unknown status code: " + statusCode);
            });
        } catch (URISyntaxException | IOException e) {
            throw new ClientException("An unknown error occurred: " + e.getMessage(), e);
        }
    }

    public ConsumerAppCollection getAll(Integer startIndex, Integer count, String search) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();

            Map<String, Object> queryParams = new HashMap<>();
            queryParams.put("startIndex", startIndex);
            queryParams.put("count", count);
            queryParams.put("search", search);

            List<String> queryStructNames = new ArrayList<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/consumer/app", pathParams));
            this.parser.query(builder, queryParams, queryStructNames);

            HttpGet request = new HttpGet(builder.build());


            return this.httpClient.execute(request, response -> {
                if (response.getCode() >= 200 && response.getCode() <= 299) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<ConsumerAppCollection>(){});

                    return data;
                }

                var statusCode = response.getCode();
                if (statusCode == 401) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<CommonMessage>(){});

                    throw new CommonMessageException(data);
                }

                if (statusCode == 500) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<CommonMessage>(){});

                    throw new CommonMessageException(data);
                }

                throw new UnknownStatusCodeException("The server returned an unknown status code: " + statusCode);
            });
        } catch (URISyntaxException | IOException e) {
            throw new ClientException("An unknown error occurred: " + e.getMessage(), e);
        }
    }



}

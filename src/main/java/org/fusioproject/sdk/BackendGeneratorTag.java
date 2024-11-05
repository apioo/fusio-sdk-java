/**
 * BackendGeneratorTag automatically generated by SDKgen please do not edit this file manually
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

public class BackendGeneratorTag extends TagAbstract {
    public BackendGeneratorTag(HttpClient httpClient, ObjectMapper objectMapper, Parser parser) {
        super(httpClient, objectMapper, parser);
    }


    public BackendGeneratorProviderChangelog getChangelog(String provider, BackendGeneratorProviderConfig payload) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("provider", provider);

            Map<String, Object> queryParams = new HashMap<>();

            List<String> queryStructNames = new ArrayList<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/generator/:provider", pathParams));
            this.parser.query(builder, queryParams, queryStructNames);

            HttpPut request = new HttpPut(builder.build());
            request.setEntity(new StringEntity(this.objectMapper.writeValueAsString(payload), ContentType.APPLICATION_JSON));

            request.setHeader("Content-Type", "application/json");

            return this.httpClient.execute(request, response -> {
                if (response.getCode() >= 200 && response.getCode() <= 299) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<BackendGeneratorProviderChangelog>(){});

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

    public CommonMessage executeProvider(String provider, BackendGeneratorProvider payload) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("provider", provider);

            Map<String, Object> queryParams = new HashMap<>();

            List<String> queryStructNames = new ArrayList<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/generator/:provider", pathParams));
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

    public CommonFormContainer getForm(String provider) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("provider", provider);

            Map<String, Object> queryParams = new HashMap<>();

            List<String> queryStructNames = new ArrayList<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/generator/:provider", pathParams));
            this.parser.query(builder, queryParams, queryStructNames);

            HttpGet request = new HttpGet(builder.build());


            return this.httpClient.execute(request, response -> {
                if (response.getCode() >= 200 && response.getCode() <= 299) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<CommonFormContainer>(){});

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

    public BackendGeneratorIndexProviders getClasses() throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();

            Map<String, Object> queryParams = new HashMap<>();

            List<String> queryStructNames = new ArrayList<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/generator", pathParams));
            this.parser.query(builder, queryParams, queryStructNames);

            HttpGet request = new HttpGet(builder.build());


            return this.httpClient.execute(request, response -> {
                if (response.getCode() >= 200 && response.getCode() <= 299) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<BackendGeneratorIndexProviders>(){});

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

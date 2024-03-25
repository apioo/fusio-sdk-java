/**
 * ConsumerAccountTag automatically generated by SDKgen please do not edit this file manually
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

public class ConsumerAccountTag extends TagAbstract {
    public ConsumerAccountTag(HttpClient httpClient, ObjectMapper objectMapper, Parser parser) {
        super(httpClient, objectMapper, parser);
    }


    public CommonMessage executePasswordReset(ConsumerUserPasswordReset payload) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();

            Map<String, Object> queryParams = new HashMap<>();

            List<String> queryStructNames = new ArrayList<String>();

            URIBuilder builder = new URIBuilder(this.parser.url("/consumer/password_reset", pathParams));
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

    public CommonMessage requestPasswordReset(ConsumerUserEmail payload) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();

            Map<String, Object> queryParams = new HashMap<>();

            List<String> queryStructNames = new ArrayList<String>();

            URIBuilder builder = new URIBuilder(this.parser.url("/consumer/password_reset", pathParams));
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

    public CommonMessage register(ConsumerUserRegister payload) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();

            Map<String, Object> queryParams = new HashMap<>();

            List<String> queryStructNames = new ArrayList<String>();

            URIBuilder builder = new URIBuilder(this.parser.url("/consumer/register", pathParams));
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
                case 500:
                    throw new CommonMessageException(this.parser.parse(resp.payload, CommonMessage.class));
                default:
                    throw new UnknownStatusCodeException("The server returned an unknown status code");
            }
        } catch (URISyntaxException | IOException e) {
            throw new ClientException("An unknown error occurred: " + e.getMessage(), e);
        }
    }

    public ConsumerUserJWT refresh(ConsumerUserRefresh payload) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();

            Map<String, Object> queryParams = new HashMap<>();

            List<String> queryStructNames = new ArrayList<String>();

            URIBuilder builder = new URIBuilder(this.parser.url("/consumer/login", pathParams));
            this.parser.query(builder, queryParams, queryStructNames);

            HttpPut request = new HttpPut(builder.build());
            request.addHeader("Content-Type", "application/json");
            request.setEntity(new StringEntity(this.objectMapper.writeValueAsString(payload), ContentType.APPLICATION_JSON));

            final Parser.HttpReturn resp = this.httpClient.execute(request, response -> {
                return this.parser.handle(response.getCode(), EntityUtils.toString(response.getEntity()));
            });

            if (resp.code >= 200 && resp.code < 300) {
                return this.parser.parse(resp.payload, ConsumerUserJWT.class);
            }

            switch (resp.code) {
                case 400:
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

    public ConsumerUserJWT login(ConsumerUserLogin payload) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();

            Map<String, Object> queryParams = new HashMap<>();

            List<String> queryStructNames = new ArrayList<String>();

            URIBuilder builder = new URIBuilder(this.parser.url("/consumer/login", pathParams));
            this.parser.query(builder, queryParams, queryStructNames);

            HttpPost request = new HttpPost(builder.build());
            request.addHeader("Content-Type", "application/json");
            request.setEntity(new StringEntity(this.objectMapper.writeValueAsString(payload), ContentType.APPLICATION_JSON));

            final Parser.HttpReturn resp = this.httpClient.execute(request, response -> {
                return this.parser.handle(response.getCode(), EntityUtils.toString(response.getEntity()));
            });

            if (resp.code >= 200 && resp.code < 300) {
                return this.parser.parse(resp.payload, ConsumerUserJWT.class);
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

    public ConsumerAuthorizeResponse authorize(ConsumerAuthorizeRequest payload) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();

            Map<String, Object> queryParams = new HashMap<>();

            List<String> queryStructNames = new ArrayList<String>();

            URIBuilder builder = new URIBuilder(this.parser.url("/consumer/authorize", pathParams));
            this.parser.query(builder, queryParams, queryStructNames);

            HttpPost request = new HttpPost(builder.build());
            request.addHeader("Content-Type", "application/json");
            request.setEntity(new StringEntity(this.objectMapper.writeValueAsString(payload), ContentType.APPLICATION_JSON));

            final Parser.HttpReturn resp = this.httpClient.execute(request, response -> {
                return this.parser.handle(response.getCode(), EntityUtils.toString(response.getEntity()));
            });

            if (resp.code >= 200 && resp.code < 300) {
                return this.parser.parse(resp.payload, ConsumerAuthorizeResponse.class);
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

    public ConsumerAuthorizeMeta getApp() throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();

            Map<String, Object> queryParams = new HashMap<>();

            List<String> queryStructNames = new ArrayList<String>();

            URIBuilder builder = new URIBuilder(this.parser.url("/consumer/authorize", pathParams));
            this.parser.query(builder, queryParams, queryStructNames);

            HttpGet request = new HttpGet(builder.build());

            final Parser.HttpReturn resp = this.httpClient.execute(request, response -> {
                return this.parser.handle(response.getCode(), EntityUtils.toString(response.getEntity()));
            });

            if (resp.code >= 200 && resp.code < 300) {
                return this.parser.parse(resp.payload, ConsumerAuthorizeMeta.class);
            }

            switch (resp.code) {
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

    public CommonMessage activate(ConsumerUserActivate payload) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();

            Map<String, Object> queryParams = new HashMap<>();

            List<String> queryStructNames = new ArrayList<String>();

            URIBuilder builder = new URIBuilder(this.parser.url("/consumer/activate", pathParams));
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
                case 500:
                    throw new CommonMessageException(this.parser.parse(resp.payload, CommonMessage.class));
                default:
                    throw new UnknownStatusCodeException("The server returned an unknown status code");
            }
        } catch (URISyntaxException | IOException e) {
            throw new ClientException("An unknown error occurred: " + e.getMessage(), e);
        }
    }

    public CommonMessage changePassword(BackendAccountChangePassword payload) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();

            Map<String, Object> queryParams = new HashMap<>();

            List<String> queryStructNames = new ArrayList<String>();

            URIBuilder builder = new URIBuilder(this.parser.url("/consumer/account/change_password", pathParams));
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
                case 500:
                    throw new CommonMessageException(this.parser.parse(resp.payload, CommonMessage.class));
                default:
                    throw new UnknownStatusCodeException("The server returned an unknown status code");
            }
        } catch (URISyntaxException | IOException e) {
            throw new ClientException("An unknown error occurred: " + e.getMessage(), e);
        }
    }

    public CommonMessage update(ConsumerUserAccount payload) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();

            Map<String, Object> queryParams = new HashMap<>();

            List<String> queryStructNames = new ArrayList<String>();

            URIBuilder builder = new URIBuilder(this.parser.url("/consumer/account", pathParams));
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

    public ConsumerUserAccount get() throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();

            Map<String, Object> queryParams = new HashMap<>();

            List<String> queryStructNames = new ArrayList<String>();

            URIBuilder builder = new URIBuilder(this.parser.url("/consumer/account", pathParams));
            this.parser.query(builder, queryParams, queryStructNames);

            HttpGet request = new HttpGet(builder.build());

            final Parser.HttpReturn resp = this.httpClient.execute(request, response -> {
                return this.parser.handle(response.getCode(), EntityUtils.toString(response.getEntity()));
            });

            if (resp.code >= 200 && resp.code < 300) {
                return this.parser.parse(resp.payload, ConsumerUserAccount.class);
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


}

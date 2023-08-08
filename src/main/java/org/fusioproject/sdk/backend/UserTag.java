/**
 * UserTag automatically generated by SDKgen please do not edit this file manually
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

public class UserTag extends TagAbstract {
    public UserTag(HttpClient httpClient, ObjectMapper objectMapper, Parser parser) {
        super(httpClient, objectMapper, parser);
    }


    public Message delete(String userId) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("user_id", userId);

            Map<String, Object> queryParams = new HashMap<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/user/$user_id<[0-9]+>", pathParams));
            this.parser.query(builder, queryParams);

            HttpDelete request = new HttpDelete(builder.build());

            HttpResponse response = this.httpClient.execute(request);
            int statusCode = response.getStatusLine().getStatusCode();

            if (statusCode >= 200 && statusCode < 300) {
                return this.parser.parse(EntityUtils.toString(response.getEntity(), "UTF-8"), Message.class);
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

    public Message update(String userId, UserUpdate payload) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("user_id", userId);

            Map<String, Object> queryParams = new HashMap<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/user/$user_id<[0-9]+>", pathParams));
            this.parser.query(builder, queryParams);

            HttpPut request = new HttpPut(builder.build());
            request.addHeader("Content-Type", "application/json");
            request.setEntity(new StringEntity(this.objectMapper.writeValueAsString(payload), ContentType.APPLICATION_JSON));

            HttpResponse response = this.httpClient.execute(request);
            int statusCode = response.getStatusLine().getStatusCode();

            if (statusCode >= 200 && statusCode < 300) {
                return this.parser.parse(EntityUtils.toString(response.getEntity(), "UTF-8"), Message.class);
            }

            switch (statusCode) {
                case 400:
                    throw new MessageException(this.parser.parse(EntityUtils.toString(response.getEntity(), "UTF-8"), Message.class));
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

    public User get(String userId) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("user_id", userId);

            Map<String, Object> queryParams = new HashMap<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/user/$user_id<[0-9]+>", pathParams));
            this.parser.query(builder, queryParams);

            HttpGet request = new HttpGet(builder.build());

            HttpResponse response = this.httpClient.execute(request);
            int statusCode = response.getStatusLine().getStatusCode();

            if (statusCode >= 200 && statusCode < 300) {
                return this.parser.parse(EntityUtils.toString(response.getEntity(), "UTF-8"), User.class);
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

    public Message create(UserCreate payload) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();

            Map<String, Object> queryParams = new HashMap<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/user", pathParams));
            this.parser.query(builder, queryParams);

            HttpPost request = new HttpPost(builder.build());
            request.addHeader("Content-Type", "application/json");
            request.setEntity(new StringEntity(this.objectMapper.writeValueAsString(payload), ContentType.APPLICATION_JSON));

            HttpResponse response = this.httpClient.execute(request);
            int statusCode = response.getStatusLine().getStatusCode();

            if (statusCode >= 200 && statusCode < 300) {
                return this.parser.parse(EntityUtils.toString(response.getEntity(), "UTF-8"), Message.class);
            }

            switch (statusCode) {
                case 400:
                    throw new MessageException(this.parser.parse(EntityUtils.toString(response.getEntity(), "UTF-8"), Message.class));
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

    public UserCollection getAll(int startIndex, int count, String search) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();

            Map<String, Object> queryParams = new HashMap<>();
            queryParams.put("startIndex", startIndex);
            queryParams.put("count", count);
            queryParams.put("search", search);

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/user", pathParams));
            this.parser.query(builder, queryParams);

            HttpGet request = new HttpGet(builder.build());

            HttpResponse response = this.httpClient.execute(request);
            int statusCode = response.getStatusLine().getStatusCode();

            if (statusCode >= 200 && statusCode < 300) {
                return this.parser.parse(EntityUtils.toString(response.getEntity(), "UTF-8"), UserCollection.class);
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

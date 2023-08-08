/**
 * ConnectionTag automatically generated by SDKgen please do not edit this file manually
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

public class ConnectionTag extends TagAbstract {
    public ConnectionTag(HttpClient httpClient, ObjectMapper objectMapper, Parser parser) {
        super(httpClient, objectMapper, parser);
    }


    public ConnectionIntrospectionEntity getIntrospectionForEntity(String connectionId, String entity) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("connection_id", connectionId);
            pathParams.put("entity", entity);

            Map<String, Object> queryParams = new HashMap<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/connection/$connection_id<[0-9]+|^~>/introspection/:entity", pathParams));
            this.parser.query(builder, queryParams);

            HttpGet request = new HttpGet(builder.build());

            HttpResponse response = this.httpClient.execute(request);
            int statusCode = response.getStatusLine().getStatusCode();

            if (statusCode >= 200 && statusCode < 300) {
                return this.parser.parse(EntityUtils.toString(response.getEntity(), "UTF-8"), ConnectionIntrospectionEntity.class);
            }

            switch (statusCode) {
                case 401:
                    throw new MessageException(this.parser.parse(EntityUtils.toString(response.getEntity(), "UTF-8"), Message.class));
                case 404:
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

    public ConnectionIntrospectionEntities getIntrospection(String connectionId) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("connection_id", connectionId);

            Map<String, Object> queryParams = new HashMap<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/connection/$connection_id<[0-9]+|^~>/introspection", pathParams));
            this.parser.query(builder, queryParams);

            HttpGet request = new HttpGet(builder.build());

            HttpResponse response = this.httpClient.execute(request);
            int statusCode = response.getStatusLine().getStatusCode();

            if (statusCode >= 200 && statusCode < 300) {
                return this.parser.parse(EntityUtils.toString(response.getEntity(), "UTF-8"), ConnectionIntrospectionEntities.class);
            }

            switch (statusCode) {
                case 401:
                    throw new MessageException(this.parser.parse(EntityUtils.toString(response.getEntity(), "UTF-8"), Message.class));
                case 404:
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

    public Message getRedirect(String connectionId) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("connection_id", connectionId);

            Map<String, Object> queryParams = new HashMap<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/connection/$connection_id<[0-9]+|^~>/redirect", pathParams));
            this.parser.query(builder, queryParams);

            HttpGet request = new HttpGet(builder.build());

            HttpResponse response = this.httpClient.execute(request);
            int statusCode = response.getStatusLine().getStatusCode();

            if (statusCode >= 200 && statusCode < 300) {
                return this.parser.parse(EntityUtils.toString(response.getEntity(), "UTF-8"), Message.class);
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

    public Message delete(String connectionId) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("connection_id", connectionId);

            Map<String, Object> queryParams = new HashMap<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/connection/$connection_id<[0-9]+|^~>", pathParams));
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

    public Message update(String connectionId, ConnectionUpdate payload) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("connection_id", connectionId);

            Map<String, Object> queryParams = new HashMap<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/connection/$connection_id<[0-9]+|^~>", pathParams));
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

    public Connection get(String connectionId) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("connection_id", connectionId);

            Map<String, Object> queryParams = new HashMap<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/connection/$connection_id<[0-9]+|^~>", pathParams));
            this.parser.query(builder, queryParams);

            HttpGet request = new HttpGet(builder.build());

            HttpResponse response = this.httpClient.execute(request);
            int statusCode = response.getStatusLine().getStatusCode();

            if (statusCode >= 200 && statusCode < 300) {
                return this.parser.parse(EntityUtils.toString(response.getEntity(), "UTF-8"), Connection.class);
            }

            switch (statusCode) {
                case 404:
                    throw new MessageException(this.parser.parse(EntityUtils.toString(response.getEntity(), "UTF-8"), Message.class));
                case 401:
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

    public FormContainer getForm(String _class) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();

            Map<String, Object> queryParams = new HashMap<>();
            queryParams.put("class", _class);

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/connection/form", pathParams));
            this.parser.query(builder, queryParams);

            HttpGet request = new HttpGet(builder.build());

            HttpResponse response = this.httpClient.execute(request);
            int statusCode = response.getStatusLine().getStatusCode();

            if (statusCode >= 200 && statusCode < 300) {
                return this.parser.parse(EntityUtils.toString(response.getEntity(), "UTF-8"), FormContainer.class);
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

    public ConnectionIndex getClasses() throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();

            Map<String, Object> queryParams = new HashMap<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/connection/list", pathParams));
            this.parser.query(builder, queryParams);

            HttpGet request = new HttpGet(builder.build());

            HttpResponse response = this.httpClient.execute(request);
            int statusCode = response.getStatusLine().getStatusCode();

            if (statusCode >= 200 && statusCode < 300) {
                return this.parser.parse(EntityUtils.toString(response.getEntity(), "UTF-8"), ConnectionIndex.class);
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

    public Message create(ConnectionCreate payload) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();

            Map<String, Object> queryParams = new HashMap<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/connection", pathParams));
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

    public ConnectionCollection getAll(int startIndex, int count, String search) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();

            Map<String, Object> queryParams = new HashMap<>();
            queryParams.put("startIndex", startIndex);
            queryParams.put("count", count);
            queryParams.put("search", search);

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/connection", pathParams));
            this.parser.query(builder, queryParams);

            HttpGet request = new HttpGet(builder.build());

            HttpResponse response = this.httpClient.execute(request);
            int statusCode = response.getStatusLine().getStatusCode();

            if (statusCode >= 200 && statusCode < 300) {
                return this.parser.parse(EntityUtils.toString(response.getEntity(), "UTF-8"), ConnectionCollection.class);
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

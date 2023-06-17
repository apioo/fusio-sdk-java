/**
 * SchemaTag automatically generated by SDKgen please do not edit this file manually
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

public class SchemaTag extends TagAbstract {
    public SchemaTag(HttpClient httpClient, ObjectMapper objectMapper, Parser parser) {
        super(httpClient, objectMapper, parser);
    }


    public Message delete(String schemaId) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("schema_id", schemaId);

            Map<String, Object> queryParams = new HashMap<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/schema/$schema_id&lt;[0-9]+|^~&gt;", pathParams));
            this.parser.query(builder, queryParams);

            HttpDelete request = new HttpDelete(builder.build());

            HttpResponse response = this.httpClient.execute(request);
            int statusCode = response.getStatusLine().getStatusCode();

            if (statusCode >= 200 && statusCode < 300) {
                return this.parser.parse(EntityUtils.toString(response.getEntity(), "UTF-8"), Message.class);
            }

            switch (statusCode) {
                default:
                    throw new UnknownStatusCodeException("The server returned an unknown status code");
            }
        } catch (URISyntaxException | IOException e) {
            throw new ClientException("An unknown error occurred: " + e.getMessage(), e);
        }
    }

    public Message update(String schemaId, SchemaUpdate payload) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("schema_id", schemaId);

            Map<String, Object> queryParams = new HashMap<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/schema/$schema_id&lt;[0-9]+|^~&gt;", pathParams));
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
                default:
                    throw new UnknownStatusCodeException("The server returned an unknown status code");
            }
        } catch (URISyntaxException | IOException e) {
            throw new ClientException("An unknown error occurred: " + e.getMessage(), e);
        }
    }

    public Schema get(String schemaId) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("schema_id", schemaId);

            Map<String, Object> queryParams = new HashMap<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/schema/$schema_id&lt;[0-9]+|^~&gt;", pathParams));
            this.parser.query(builder, queryParams);

            HttpGet request = new HttpGet(builder.build());

            HttpResponse response = this.httpClient.execute(request);
            int statusCode = response.getStatusLine().getStatusCode();

            if (statusCode >= 200 && statusCode < 300) {
                return this.parser.parse(EntityUtils.toString(response.getEntity(), "UTF-8"), Schema.class);
            }

            switch (statusCode) {
                default:
                    throw new UnknownStatusCodeException("The server returned an unknown status code");
            }
        } catch (URISyntaxException | IOException e) {
            throw new ClientException("An unknown error occurred: " + e.getMessage(), e);
        }
    }

    public Message updateForm(String schemaId, SchemaForm payload) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("schema_id", schemaId);

            Map<String, Object> queryParams = new HashMap<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/schema/form/$schema_id&lt;[0-9]+&gt;", pathParams));
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
                default:
                    throw new UnknownStatusCodeException("The server returned an unknown status code");
            }
        } catch (URISyntaxException | IOException e) {
            throw new ClientException("An unknown error occurred: " + e.getMessage(), e);
        }
    }

    public SchemaPreviewResponse getPreview(String schemaId) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("schema_id", schemaId);

            Map<String, Object> queryParams = new HashMap<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/schema/preview/:schema_id", pathParams));
            this.parser.query(builder, queryParams);

            HttpPost request = new HttpPost(builder.build());

            HttpResponse response = this.httpClient.execute(request);
            int statusCode = response.getStatusLine().getStatusCode();

            if (statusCode >= 200 && statusCode < 300) {
                return this.parser.parse(EntityUtils.toString(response.getEntity(), "UTF-8"), SchemaPreviewResponse.class);
            }

            switch (statusCode) {
                default:
                    throw new UnknownStatusCodeException("The server returned an unknown status code");
            }
        } catch (URISyntaxException | IOException e) {
            throw new ClientException("An unknown error occurred: " + e.getMessage(), e);
        }
    }

    public Message create(SchemaCreate payload) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();

            Map<String, Object> queryParams = new HashMap<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/schema", pathParams));
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
                default:
                    throw new UnknownStatusCodeException("The server returned an unknown status code");
            }
        } catch (URISyntaxException | IOException e) {
            throw new ClientException("An unknown error occurred: " + e.getMessage(), e);
        }
    }

    public SchemaCollection getAll() throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();

            Map<String, Object> queryParams = new HashMap<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/schema", pathParams));
            this.parser.query(builder, queryParams);

            HttpGet request = new HttpGet(builder.build());

            HttpResponse response = this.httpClient.execute(request);
            int statusCode = response.getStatusLine().getStatusCode();

            if (statusCode >= 200 && statusCode < 300) {
                return this.parser.parse(EntityUtils.toString(response.getEntity(), "UTF-8"), SchemaCollection.class);
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

/**
 * BackendConnectionFilesystemTag automatically generated by SDKgen please do not edit this file manually
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

public class BackendConnectionFilesystemTag extends TagAbstract {
    public BackendConnectionFilesystemTag(HttpClient httpClient, ObjectMapper objectMapper, Parser parser) {
        super(httpClient, objectMapper, parser);
    }


    /**
     * Uploads one or more files on the filesystem connection
     */
    public CommonMessage create(String connectionId, org.apache.hc.client5.http.entity.mime.MultipartEntityBuilder payload) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("connection_id", connectionId);

            Map<String, Object> queryParams = new HashMap<>();

            List<String> queryStructNames = new ArrayList<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/connection/:connection_id/filesystem", pathParams));
            this.parser.query(builder, queryParams, queryStructNames);

            HttpPost request = new HttpPost(builder.build());
            request.setEntity(payload.build());


            return this.httpClient.execute(request, response -> {
                if (response.getCode() >= 200 && response.getCode() <= 299) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<CommonMessage>(){});

                    return data;
                }

                var statusCode = response.getCode();
                if (statusCode >= 0 && statusCode <= 999) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<CommonMessage>(){});

                    throw new CommonMessageException(data);
                }

                throw new UnknownStatusCodeException("The server returned an unknown status code: " + statusCode);
            });
        } catch (ClientException e) {
            throw e;
        } catch (URISyntaxException | IOException e) {
            throw new ClientException("An unknown error occurred: " + e.getMessage(), e);
        }
    }

    /**
     * Deletes an existing file on the filesystem connection
     */
    public CommonMessage delete(String connectionId, String fileId) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("connection_id", connectionId);
            pathParams.put("file_id", fileId);

            Map<String, Object> queryParams = new HashMap<>();

            List<String> queryStructNames = new ArrayList<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/connection/:connection_id/filesystem/:file_id", pathParams));
            this.parser.query(builder, queryParams, queryStructNames);

            HttpDelete request = new HttpDelete(builder.build());


            return this.httpClient.execute(request, response -> {
                if (response.getCode() >= 200 && response.getCode() <= 299) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<CommonMessage>(){});

                    return data;
                }

                var statusCode = response.getCode();
                if (statusCode >= 0 && statusCode <= 999) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<CommonMessage>(){});

                    throw new CommonMessageException(data);
                }

                throw new UnknownStatusCodeException("The server returned an unknown status code: " + statusCode);
            });
        } catch (ClientException e) {
            throw e;
        } catch (URISyntaxException | IOException e) {
            throw new ClientException("An unknown error occurred: " + e.getMessage(), e);
        }
    }

    /**
     * Returns the content of the provided file id on the filesystem connection
     */
    public byte[] get(String connectionId, String fileId) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("connection_id", connectionId);
            pathParams.put("file_id", fileId);

            Map<String, Object> queryParams = new HashMap<>();

            List<String> queryStructNames = new ArrayList<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/connection/:connection_id/filesystem/:file_id", pathParams));
            this.parser.query(builder, queryParams, queryStructNames);

            HttpGet request = new HttpGet(builder.build());

            request.setHeader("Accept", "application/octet-stream");

            return this.httpClient.execute(request, response -> {
                if (response.getCode() >= 200 && response.getCode() <= 299) {
                    var data = EntityUtils.toByteArray(response.getEntity());

                    return data;
                }

                var statusCode = response.getCode();
                if (statusCode >= 0 && statusCode <= 999) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<CommonMessage>(){});

                    throw new CommonMessageException(data);
                }

                throw new UnknownStatusCodeException("The server returned an unknown status code: " + statusCode);
            });
        } catch (ClientException e) {
            throw e;
        } catch (URISyntaxException | IOException e) {
            throw new ClientException("An unknown error occurred: " + e.getMessage(), e);
        }
    }

    /**
     * Returns all available files on the filesystem connection
     */
    public BackendFileCollection getAll(String connectionId, Integer startIndex, Integer count) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("connection_id", connectionId);

            Map<String, Object> queryParams = new HashMap<>();
            queryParams.put("startIndex", startIndex);
            queryParams.put("count", count);

            List<String> queryStructNames = new ArrayList<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/connection/:connection_id/filesystem", pathParams));
            this.parser.query(builder, queryParams, queryStructNames);

            HttpGet request = new HttpGet(builder.build());


            return this.httpClient.execute(request, response -> {
                if (response.getCode() >= 200 && response.getCode() <= 299) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<BackendFileCollection>(){});

                    return data;
                }

                var statusCode = response.getCode();
                if (statusCode >= 0 && statusCode <= 999) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<CommonMessage>(){});

                    throw new CommonMessageException(data);
                }

                throw new UnknownStatusCodeException("The server returned an unknown status code: " + statusCode);
            });
        } catch (ClientException e) {
            throw e;
        } catch (URISyntaxException | IOException e) {
            throw new ClientException("An unknown error occurred: " + e.getMessage(), e);
        }
    }

    /**
     * Updates an existing file on the filesystem connection
     */
    public CommonMessage update(String connectionId, String fileId, org.apache.hc.client5.http.entity.mime.MultipartEntityBuilder payload) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();
            pathParams.put("connection_id", connectionId);
            pathParams.put("file_id", fileId);

            Map<String, Object> queryParams = new HashMap<>();

            List<String> queryStructNames = new ArrayList<>();

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/connection/:connection_id/filesystem/:file_id", pathParams));
            this.parser.query(builder, queryParams, queryStructNames);

            HttpPut request = new HttpPut(builder.build());
            request.setEntity(payload.build());


            return this.httpClient.execute(request, response -> {
                if (response.getCode() >= 200 && response.getCode() <= 299) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<CommonMessage>(){});

                    return data;
                }

                var statusCode = response.getCode();
                if (statusCode >= 0 && statusCode <= 999) {
                    var data = this.parser.parse(EntityUtils.toString(response.getEntity()), new TypeReference<CommonMessage>(){});

                    throw new CommonMessageException(data);
                }

                throw new UnknownStatusCodeException("The server returned an unknown status code: " + statusCode);
            });
        } catch (ClientException e) {
            throw e;
        } catch (URISyntaxException | IOException e) {
            throw new ClientException("An unknown error occurred: " + e.getMessage(), e);
        }
    }



}

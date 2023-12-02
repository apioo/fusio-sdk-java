/**
 * BackendStatisticTag automatically generated by SDKgen please do not edit this file manually
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

public class BackendStatisticTag extends TagAbstract {
    public BackendStatisticTag(HttpClient httpClient, ObjectMapper objectMapper, Parser parser) {
        super(httpClient, objectMapper, parser);
    }


    public BackendStatisticChart getUsedPoints(int startIndex, int count, String search, String from, String to, int operationId, int appId, int userId, String ip, String userAgent, String method, String path, String header, String body) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();

            Map<String, Object> queryParams = new HashMap<>();
            queryParams.put("startIndex", startIndex);
            queryParams.put("count", count);
            queryParams.put("search", search);
            queryParams.put("from", from);
            queryParams.put("to", to);
            queryParams.put("operationId", operationId);
            queryParams.put("appId", appId);
            queryParams.put("userId", userId);
            queryParams.put("ip", ip);
            queryParams.put("userAgent", userAgent);
            queryParams.put("method", method);
            queryParams.put("path", path);
            queryParams.put("header", header);
            queryParams.put("body", body);

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/statistic/used_points", pathParams));
            this.parser.query(builder, queryParams);

            HttpGet request = new HttpGet(builder.build());

            final Parser.HttpReturn resp = this.httpClient.execute(request, response -> {
                return this.parser.handle(response.getCode(), EntityUtils.toString(response.getEntity()));
            });

            if (resp.code >= 200 && resp.code < 300) {
                return this.parser.parse(resp.payload, BackendStatisticChart.class);
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

    public BackendStatisticChart getTimePerOperation(int startIndex, int count, String search, String from, String to, int operationId, int appId, int userId, String ip, String userAgent, String method, String path, String header, String body) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();

            Map<String, Object> queryParams = new HashMap<>();
            queryParams.put("startIndex", startIndex);
            queryParams.put("count", count);
            queryParams.put("search", search);
            queryParams.put("from", from);
            queryParams.put("to", to);
            queryParams.put("operationId", operationId);
            queryParams.put("appId", appId);
            queryParams.put("userId", userId);
            queryParams.put("ip", ip);
            queryParams.put("userAgent", userAgent);
            queryParams.put("method", method);
            queryParams.put("path", path);
            queryParams.put("header", header);
            queryParams.put("body", body);

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/statistic/time_per_operation", pathParams));
            this.parser.query(builder, queryParams);

            HttpGet request = new HttpGet(builder.build());

            final Parser.HttpReturn resp = this.httpClient.execute(request, response -> {
                return this.parser.handle(response.getCode(), EntityUtils.toString(response.getEntity()));
            });

            if (resp.code >= 200 && resp.code < 300) {
                return this.parser.parse(resp.payload, BackendStatisticChart.class);
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

    public BackendStatisticChart getTimeAverage(int startIndex, int count, String search, String from, String to, int operationId, int appId, int userId, String ip, String userAgent, String method, String path, String header, String body) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();

            Map<String, Object> queryParams = new HashMap<>();
            queryParams.put("startIndex", startIndex);
            queryParams.put("count", count);
            queryParams.put("search", search);
            queryParams.put("from", from);
            queryParams.put("to", to);
            queryParams.put("operationId", operationId);
            queryParams.put("appId", appId);
            queryParams.put("userId", userId);
            queryParams.put("ip", ip);
            queryParams.put("userAgent", userAgent);
            queryParams.put("method", method);
            queryParams.put("path", path);
            queryParams.put("header", header);
            queryParams.put("body", body);

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/statistic/time_average", pathParams));
            this.parser.query(builder, queryParams);

            HttpGet request = new HttpGet(builder.build());

            final Parser.HttpReturn resp = this.httpClient.execute(request, response -> {
                return this.parser.handle(response.getCode(), EntityUtils.toString(response.getEntity()));
            });

            if (resp.code >= 200 && resp.code < 300) {
                return this.parser.parse(resp.payload, BackendStatisticChart.class);
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

    public BackendStatisticChart getMostUsedOperations(int startIndex, int count, String search, String from, String to, int operationId, int appId, int userId, String ip, String userAgent, String method, String path, String header, String body) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();

            Map<String, Object> queryParams = new HashMap<>();
            queryParams.put("startIndex", startIndex);
            queryParams.put("count", count);
            queryParams.put("search", search);
            queryParams.put("from", from);
            queryParams.put("to", to);
            queryParams.put("operationId", operationId);
            queryParams.put("appId", appId);
            queryParams.put("userId", userId);
            queryParams.put("ip", ip);
            queryParams.put("userAgent", userAgent);
            queryParams.put("method", method);
            queryParams.put("path", path);
            queryParams.put("header", header);
            queryParams.put("body", body);

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/statistic/most_used_operations", pathParams));
            this.parser.query(builder, queryParams);

            HttpGet request = new HttpGet(builder.build());

            final Parser.HttpReturn resp = this.httpClient.execute(request, response -> {
                return this.parser.handle(response.getCode(), EntityUtils.toString(response.getEntity()));
            });

            if (resp.code >= 200 && resp.code < 300) {
                return this.parser.parse(resp.payload, BackendStatisticChart.class);
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

    public BackendStatisticChart getMostUsedApps(int startIndex, int count, String search, String from, String to, int operationId, int appId, int userId, String ip, String userAgent, String method, String path, String header, String body) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();

            Map<String, Object> queryParams = new HashMap<>();
            queryParams.put("startIndex", startIndex);
            queryParams.put("count", count);
            queryParams.put("search", search);
            queryParams.put("from", from);
            queryParams.put("to", to);
            queryParams.put("operationId", operationId);
            queryParams.put("appId", appId);
            queryParams.put("userId", userId);
            queryParams.put("ip", ip);
            queryParams.put("userAgent", userAgent);
            queryParams.put("method", method);
            queryParams.put("path", path);
            queryParams.put("header", header);
            queryParams.put("body", body);

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/statistic/most_used_apps", pathParams));
            this.parser.query(builder, queryParams);

            HttpGet request = new HttpGet(builder.build());

            final Parser.HttpReturn resp = this.httpClient.execute(request, response -> {
                return this.parser.handle(response.getCode(), EntityUtils.toString(response.getEntity()));
            });

            if (resp.code >= 200 && resp.code < 300) {
                return this.parser.parse(resp.payload, BackendStatisticChart.class);
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

    public BackendStatisticChart getIssuedTokens(int startIndex, int count, String search, String from, String to, int operationId, int appId, int userId, String ip, String userAgent, String method, String path, String header, String body) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();

            Map<String, Object> queryParams = new HashMap<>();
            queryParams.put("startIndex", startIndex);
            queryParams.put("count", count);
            queryParams.put("search", search);
            queryParams.put("from", from);
            queryParams.put("to", to);
            queryParams.put("operationId", operationId);
            queryParams.put("appId", appId);
            queryParams.put("userId", userId);
            queryParams.put("ip", ip);
            queryParams.put("userAgent", userAgent);
            queryParams.put("method", method);
            queryParams.put("path", path);
            queryParams.put("header", header);
            queryParams.put("body", body);

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/statistic/issued_tokens", pathParams));
            this.parser.query(builder, queryParams);

            HttpGet request = new HttpGet(builder.build());

            final Parser.HttpReturn resp = this.httpClient.execute(request, response -> {
                return this.parser.handle(response.getCode(), EntityUtils.toString(response.getEntity()));
            });

            if (resp.code >= 200 && resp.code < 300) {
                return this.parser.parse(resp.payload, BackendStatisticChart.class);
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

    public BackendStatisticChart getIncomingTransactions(int startIndex, int count, String search, String from, String to, int operationId, int appId, int userId, String ip, String userAgent, String method, String path, String header, String body) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();

            Map<String, Object> queryParams = new HashMap<>();
            queryParams.put("startIndex", startIndex);
            queryParams.put("count", count);
            queryParams.put("search", search);
            queryParams.put("from", from);
            queryParams.put("to", to);
            queryParams.put("operationId", operationId);
            queryParams.put("appId", appId);
            queryParams.put("userId", userId);
            queryParams.put("ip", ip);
            queryParams.put("userAgent", userAgent);
            queryParams.put("method", method);
            queryParams.put("path", path);
            queryParams.put("header", header);
            queryParams.put("body", body);

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/statistic/incoming_transactions", pathParams));
            this.parser.query(builder, queryParams);

            HttpGet request = new HttpGet(builder.build());

            final Parser.HttpReturn resp = this.httpClient.execute(request, response -> {
                return this.parser.handle(response.getCode(), EntityUtils.toString(response.getEntity()));
            });

            if (resp.code >= 200 && resp.code < 300) {
                return this.parser.parse(resp.payload, BackendStatisticChart.class);
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

    public BackendStatisticChart getIncomingRequests(int startIndex, int count, String search, String from, String to, int operationId, int appId, int userId, String ip, String userAgent, String method, String path, String header, String body) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();

            Map<String, Object> queryParams = new HashMap<>();
            queryParams.put("startIndex", startIndex);
            queryParams.put("count", count);
            queryParams.put("search", search);
            queryParams.put("from", from);
            queryParams.put("to", to);
            queryParams.put("operationId", operationId);
            queryParams.put("appId", appId);
            queryParams.put("userId", userId);
            queryParams.put("ip", ip);
            queryParams.put("userAgent", userAgent);
            queryParams.put("method", method);
            queryParams.put("path", path);
            queryParams.put("header", header);
            queryParams.put("body", body);

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/statistic/incoming_requests", pathParams));
            this.parser.query(builder, queryParams);

            HttpGet request = new HttpGet(builder.build());

            final Parser.HttpReturn resp = this.httpClient.execute(request, response -> {
                return this.parser.handle(response.getCode(), EntityUtils.toString(response.getEntity()));
            });

            if (resp.code >= 200 && resp.code < 300) {
                return this.parser.parse(resp.payload, BackendStatisticChart.class);
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

    public BackendStatisticChart getErrorsPerOperation(int startIndex, int count, String search, String from, String to, int operationId, int appId, int userId, String ip, String userAgent, String method, String path, String header, String body) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();

            Map<String, Object> queryParams = new HashMap<>();
            queryParams.put("startIndex", startIndex);
            queryParams.put("count", count);
            queryParams.put("search", search);
            queryParams.put("from", from);
            queryParams.put("to", to);
            queryParams.put("operationId", operationId);
            queryParams.put("appId", appId);
            queryParams.put("userId", userId);
            queryParams.put("ip", ip);
            queryParams.put("userAgent", userAgent);
            queryParams.put("method", method);
            queryParams.put("path", path);
            queryParams.put("header", header);
            queryParams.put("body", body);

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/statistic/errors_per_operation", pathParams));
            this.parser.query(builder, queryParams);

            HttpGet request = new HttpGet(builder.build());

            final Parser.HttpReturn resp = this.httpClient.execute(request, response -> {
                return this.parser.handle(response.getCode(), EntityUtils.toString(response.getEntity()));
            });

            if (resp.code >= 200 && resp.code < 300) {
                return this.parser.parse(resp.payload, BackendStatisticChart.class);
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

    public BackendStatisticCount getCountRequests(int startIndex, int count, String search, String from, String to, int operationId, int appId, int userId, String ip, String userAgent, String method, String path, String header, String body) throws ClientException {
        try {
            Map<String, Object> pathParams = new HashMap<>();

            Map<String, Object> queryParams = new HashMap<>();
            queryParams.put("startIndex", startIndex);
            queryParams.put("count", count);
            queryParams.put("search", search);
            queryParams.put("from", from);
            queryParams.put("to", to);
            queryParams.put("operationId", operationId);
            queryParams.put("appId", appId);
            queryParams.put("userId", userId);
            queryParams.put("ip", ip);
            queryParams.put("userAgent", userAgent);
            queryParams.put("method", method);
            queryParams.put("path", path);
            queryParams.put("header", header);
            queryParams.put("body", body);

            URIBuilder builder = new URIBuilder(this.parser.url("/backend/statistic/count_requests", pathParams));
            this.parser.query(builder, queryParams);

            HttpGet request = new HttpGet(builder.build());

            final Parser.HttpReturn resp = this.httpClient.execute(request, response -> {
                return this.parser.handle(response.getCode(), EntityUtils.toString(response.getEntity()));
            });

            if (resp.code >= 200 && resp.code < 300) {
                return this.parser.parse(resp.payload, BackendStatisticCount.class);
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

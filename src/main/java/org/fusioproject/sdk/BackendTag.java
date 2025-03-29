/**
 * BackendTag automatically generated by SDKgen please do not edit this file manually
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

public class BackendTag extends TagAbstract {
    public BackendTag(HttpClient httpClient, ObjectMapper objectMapper, Parser parser) {
        super(httpClient, objectMapper, parser);
    }

    public BackendAccountTag account()
    {
        return new BackendAccountTag(
            this.httpClient,
            this.objectMapper,
            this.parser
        );
    }

    public BackendActionTag action()
    {
        return new BackendActionTag(
            this.httpClient,
            this.objectMapper,
            this.parser
        );
    }

    public BackendAppTag app()
    {
        return new BackendAppTag(
            this.httpClient,
            this.objectMapper,
            this.parser
        );
    }

    public BackendAuditTag audit()
    {
        return new BackendAuditTag(
            this.httpClient,
            this.objectMapper,
            this.parser
        );
    }

    public BackendBackupTag backup()
    {
        return new BackendBackupTag(
            this.httpClient,
            this.objectMapper,
            this.parser
        );
    }

    public BackendCategoryTag category()
    {
        return new BackendCategoryTag(
            this.httpClient,
            this.objectMapper,
            this.parser
        );
    }

    public BackendConfigTag config()
    {
        return new BackendConfigTag(
            this.httpClient,
            this.objectMapper,
            this.parser
        );
    }

    public BackendConnectionTag connection()
    {
        return new BackendConnectionTag(
            this.httpClient,
            this.objectMapper,
            this.parser
        );
    }

    public BackendCronjobTag cronjob()
    {
        return new BackendCronjobTag(
            this.httpClient,
            this.objectMapper,
            this.parser
        );
    }

    public BackendDashboardTag dashboard()
    {
        return new BackendDashboardTag(
            this.httpClient,
            this.objectMapper,
            this.parser
        );
    }

    public BackendDatabaseTag database()
    {
        return new BackendDatabaseTag(
            this.httpClient,
            this.objectMapper,
            this.parser
        );
    }

    public BackendEventTag event()
    {
        return new BackendEventTag(
            this.httpClient,
            this.objectMapper,
            this.parser
        );
    }

    public BackendFormTag form()
    {
        return new BackendFormTag(
            this.httpClient,
            this.objectMapper,
            this.parser
        );
    }

    public BackendGeneratorTag generator()
    {
        return new BackendGeneratorTag(
            this.httpClient,
            this.objectMapper,
            this.parser
        );
    }

    public BackendIdentityTag identity()
    {
        return new BackendIdentityTag(
            this.httpClient,
            this.objectMapper,
            this.parser
        );
    }

    public BackendLogTag log()
    {
        return new BackendLogTag(
            this.httpClient,
            this.objectMapper,
            this.parser
        );
    }

    public BackendMarketplaceTag marketplace()
    {
        return new BackendMarketplaceTag(
            this.httpClient,
            this.objectMapper,
            this.parser
        );
    }

    public BackendOperationTag operation()
    {
        return new BackendOperationTag(
            this.httpClient,
            this.objectMapper,
            this.parser
        );
    }

    public BackendPageTag page()
    {
        return new BackendPageTag(
            this.httpClient,
            this.objectMapper,
            this.parser
        );
    }

    public BackendPlanTag plan()
    {
        return new BackendPlanTag(
            this.httpClient,
            this.objectMapper,
            this.parser
        );
    }

    public BackendRateTag rate()
    {
        return new BackendRateTag(
            this.httpClient,
            this.objectMapper,
            this.parser
        );
    }

    public BackendRoleTag role()
    {
        return new BackendRoleTag(
            this.httpClient,
            this.objectMapper,
            this.parser
        );
    }

    public BackendSchemaTag schema()
    {
        return new BackendSchemaTag(
            this.httpClient,
            this.objectMapper,
            this.parser
        );
    }

    public BackendScopeTag scope()
    {
        return new BackendScopeTag(
            this.httpClient,
            this.objectMapper,
            this.parser
        );
    }

    public BackendSdkTag sdk()
    {
        return new BackendSdkTag(
            this.httpClient,
            this.objectMapper,
            this.parser
        );
    }

    public BackendStatisticTag statistic()
    {
        return new BackendStatisticTag(
            this.httpClient,
            this.objectMapper,
            this.parser
        );
    }

    public BackendTenantTag tenant()
    {
        return new BackendTenantTag(
            this.httpClient,
            this.objectMapper,
            this.parser
        );
    }

    public BackendTestTag test()
    {
        return new BackendTestTag(
            this.httpClient,
            this.objectMapper,
            this.parser
        );
    }

    public BackendTokenTag token()
    {
        return new BackendTokenTag(
            this.httpClient,
            this.objectMapper,
            this.parser
        );
    }

    public BackendTransactionTag transaction()
    {
        return new BackendTransactionTag(
            this.httpClient,
            this.objectMapper,
            this.parser
        );
    }

    public BackendTrashTag trash()
    {
        return new BackendTrashTag(
            this.httpClient,
            this.objectMapper,
            this.parser
        );
    }

    public BackendUserTag user()
    {
        return new BackendUserTag(
            this.httpClient,
            this.objectMapper,
            this.parser
        );
    }

    public BackendWebhookTag webhook()
    {
        return new BackendWebhookTag(
            this.httpClient,
            this.objectMapper,
            this.parser
        );
    }


}

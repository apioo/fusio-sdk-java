/**
 * Client automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import app.sdkgen.client.ClientAbstract;
import app.sdkgen.client.Credentials.*;
import app.sdkgen.client.CredentialsInterface;
import app.sdkgen.client.TokenStoreInterface;
import java.util.List;

public class Client extends ClientAbstract {
    public Client(String baseUrl, CredentialsInterface credentials, TokenStoreInterface tokenStore, List<String> scopes) {
        super(baseUrl, credentials, tokenStore, scopes);
    }

    /**
     * Tag: backend.user
     */
    public BackendUserGroup backendUser() {
        return new BackendUserGroup(
            this.baseUrl,
            this.newHttpClient(),
            this.objectMapper
        );
    }

    /**
     * Tag: backend.trash
     */
    public BackendTrashGroup backendTrash() {
        return new BackendTrashGroup(
            this.baseUrl,
            this.newHttpClient(),
            this.objectMapper
        );
    }

    /**
     * Tag: backend.transaction
     */
    public BackendTransactionGroup backendTransaction() {
        return new BackendTransactionGroup(
            this.baseUrl,
            this.newHttpClient(),
            this.objectMapper
        );
    }

    /**
     * Tag: backend.statistic
     */
    public BackendStatisticGroup backendStatistic() {
        return new BackendStatisticGroup(
            this.baseUrl,
            this.newHttpClient(),
            this.objectMapper
        );
    }

    /**
     * Tag: backend.sdk
     */
    public BackendSdkGroup backendSdk() {
        return new BackendSdkGroup(
            this.baseUrl,
            this.newHttpClient(),
            this.objectMapper
        );
    }

    /**
     * Tag: backend.scope
     */
    public BackendScopeGroup backendScope() {
        return new BackendScopeGroup(
            this.baseUrl,
            this.newHttpClient(),
            this.objectMapper
        );
    }

    /**
     * Tag: backend.schema
     */
    public BackendSchemaGroup backendSchema() {
        return new BackendSchemaGroup(
            this.baseUrl,
            this.newHttpClient(),
            this.objectMapper
        );
    }

    /**
     * Tag: backend.route
     */
    public BackendRouteGroup backendRoute() {
        return new BackendRouteGroup(
            this.baseUrl,
            this.newHttpClient(),
            this.objectMapper
        );
    }

    /**
     * Tag: backend.role
     */
    public BackendRoleGroup backendRole() {
        return new BackendRoleGroup(
            this.baseUrl,
            this.newHttpClient(),
            this.objectMapper
        );
    }

    /**
     * Tag: backend.rate
     */
    public BackendRateGroup backendRate() {
        return new BackendRateGroup(
            this.baseUrl,
            this.newHttpClient(),
            this.objectMapper
        );
    }

    /**
     * Tag: backend.plan
     */
    public BackendPlanGroup backendPlan() {
        return new BackendPlanGroup(
            this.baseUrl,
            this.newHttpClient(),
            this.objectMapper
        );
    }

    /**
     * Tag: backend.page
     */
    public BackendPageGroup backendPage() {
        return new BackendPageGroup(
            this.baseUrl,
            this.newHttpClient(),
            this.objectMapper
        );
    }

    /**
     * Tag: backend.marketplace
     */
    public BackendMarketplaceGroup backendMarketplace() {
        return new BackendMarketplaceGroup(
            this.baseUrl,
            this.newHttpClient(),
            this.objectMapper
        );
    }

    /**
     * Tag: backend.log
     */
    public BackendLogGroup backendLog() {
        return new BackendLogGroup(
            this.baseUrl,
            this.newHttpClient(),
            this.objectMapper
        );
    }

    /**
     * Tag: backend.generator
     */
    public BackendGeneratorGroup backendGenerator() {
        return new BackendGeneratorGroup(
            this.baseUrl,
            this.newHttpClient(),
            this.objectMapper
        );
    }

    /**
     * Tag: backend.event
     */
    public BackendEventGroup backendEvent() {
        return new BackendEventGroup(
            this.baseUrl,
            this.newHttpClient(),
            this.objectMapper
        );
    }

    /**
     * Tag: backend.dashboard
     */
    public BackendDashboardGroup backendDashboard() {
        return new BackendDashboardGroup(
            this.baseUrl,
            this.newHttpClient(),
            this.objectMapper
        );
    }

    /**
     * Tag: backend.cronjob
     */
    public BackendCronjobGroup backendCronjob() {
        return new BackendCronjobGroup(
            this.baseUrl,
            this.newHttpClient(),
            this.objectMapper
        );
    }

    /**
     * Tag: backend.connection
     */
    public BackendConnectionGroup backendConnection() {
        return new BackendConnectionGroup(
            this.baseUrl,
            this.newHttpClient(),
            this.objectMapper
        );
    }

    /**
     * Tag: backend.config
     */
    public BackendConfigGroup backendConfig() {
        return new BackendConfigGroup(
            this.baseUrl,
            this.newHttpClient(),
            this.objectMapper
        );
    }

    /**
     * Tag: backend.category
     */
    public BackendCategoryGroup backendCategory() {
        return new BackendCategoryGroup(
            this.baseUrl,
            this.newHttpClient(),
            this.objectMapper
        );
    }

    /**
     * Tag: backend.audit
     */
    public BackendAuditGroup backendAudit() {
        return new BackendAuditGroup(
            this.baseUrl,
            this.newHttpClient(),
            this.objectMapper
        );
    }

    /**
     * Tag: backend.app
     */
    public BackendAppGroup backendApp() {
        return new BackendAppGroup(
            this.baseUrl,
            this.newHttpClient(),
            this.objectMapper
        );
    }

    /**
     * Tag: backend.action
     */
    public BackendActionGroup backendAction() {
        return new BackendActionGroup(
            this.baseUrl,
            this.newHttpClient(),
            this.objectMapper
        );
    }

    /**
     * Tag: backend.account
     */
    public BackendAccountGroup backendAccount() {
        return new BackendAccountGroup(
            this.baseUrl,
            this.newHttpClient(),
            this.objectMapper
        );
    }

}


# fusio-sdk-java

This [SDK](https://github.com/apioo/fusio-sdk-java) is managed by the [SDK Fabric](https://sdk-fabric.org/) project, a global infrastructure to
automatically generate SDKs for every API.

You can find more information about this SDK at [TypeHub](https://typehub.cloud/):
https://app.typehub.cloud/d/fusio/sdk

## Usage

```java
import org.fusioproject.sdk.Client;

Client client = Client::build("[access_token]");

// Returns user data of the current authenticated user.
BackendUser response = client.authorization().getwhoami();

// Revoke the access token of the current authenticated user.
CommonMessage response = client.authorization().revoke();

// Changes the password of the authenticated user.
CommonMessage response = client.backend().accountChangepassword(new BackendAccountchangepassword());

// Returns user data of the authenticated user.
BackendUser response = client.backend().accountGet();

// Updates user data of the authenticated user.
CommonMessage response = client.backend().accountUpdate(new BackendUserupdate());

// Creates a new action.
CommonMessage response = client.backend().actionCreate(new BackendActioncreate());

// Deletes an existing action.
CommonMessage response = client.backend().actionDelete("action_id");

// Executes a specific action.
BackendActionexecuteresponse response = client.backend().actionExecute("action_id", new BackendActionexecuterequest());

// Returns a specific action.
BackendAction response = client.backend().actionGet("action_id");

// Returns a paginated list of actions.
BackendActioncollection response = client.backend().actionGetall(1, 1, "search");

// Returns all available action classes.
BackendActionindex response = client.backend().actionGetclasses();

// Returns a paginated list of action commits.
BackendActioncommitcollection response = client.backend().actionGetcommits("action_id", 1, 1, "search");

// Returns the action config form.
CommonFormcontainer response = client.backend().actionGetform("class");

// Updates an existing action.
CommonMessage response = client.backend().actionUpdate("action_id", new BackendActionupdate());

// Creates a new agent.
CommonMessage response = client.backend().agentCreate(new BackendAgentcreate());

// Deletes an existing agent.
CommonMessage response = client.backend().agentDelete("agent_id");

// Returns a specific agent.
BackendAgent response = client.backend().agentGet("agent_id");

// Returns a paginated list of agents.
BackendAgentcollection response = client.backend().agentGetall(1, 1, "search");

// Returns available tools for an agent.
BackendAgenttools response = client.backend().agentGettools();

// Returns a paginated list of agent messages.
BackendAgentmessagecollection response = client.backend().agentMessageGetall("agent_id", "chat_id");

// Submits a new agent message.
AgentOutput response = client.backend().agentMessageSubmit("agent_id", new AgentInput());

// Updates an existing agent.
CommonMessage response = client.backend().agentUpdate("agent_id", new BackendAgentupdate());

// Creates a new app.
CommonMessage response = client.backend().appCreate(new BackendAppcreate());

// Deletes an existing app.
CommonMessage response = client.backend().appDelete("app_id");

// Deletes an existing token from an app.
CommonMessage response = client.backend().appDeletetoken("app_id", "token_id");

// Returns a specific app.
BackendApp response = client.backend().appGet("app_id");

// Returns a paginated list of apps.
BackendAppcollection response = client.backend().appGetall(1, 1, "search");

// Updates an existing app.
CommonMessage response = client.backend().appUpdate("app_id", new BackendAppupdate());

// Returns a specific audit.
BackendAudit response = client.backend().auditGet("audit_id");

// Returns a paginated list of audits.
BackendAuditcollection response = client.backend().auditGetall(1, 1, "search", "from", "to", 1, 1, "event", "ip", "message");

// Generates an backup of the current system.
BackendBackupexport response = client.backend().backupExport();

// Imports an backup to the current system.
BackendBackupimportresult response = client.backend().backupImport(new BackendBackupimport());

// Creates a new bundle.
CommonMessage response = client.backend().bundleCreate(new BackendBundlecreate());

// Deletes an existing bundle.
CommonMessage response = client.backend().bundleDelete("bundle_id");

// Returns a specific bundle.
BackendBundle response = client.backend().bundleGet("bundle_id");

// Returns a paginated list of bundles.
BackendBundlecollection response = client.backend().bundleGetall(1, 1, "search");

// Publish an existing bundle to the marketplace.
CommonMessage response = client.backend().bundlePublish("bundle_id");

// Updates an existing bundle.
CommonMessage response = client.backend().bundleUpdate("bundle_id", new BackendBundleupdate());

// Creates a new category.
CommonMessage response = client.backend().categoryCreate(new BackendCategorycreate());

// Deletes an existing category.
CommonMessage response = client.backend().categoryDelete("category_id");

// Returns a specific category.
BackendCategory response = client.backend().categoryGet("category_id");

// Returns a paginated list of categories.
BackendCategorycollection response = client.backend().categoryGetall(1, 1, "search");

// Updates an existing category.
CommonMessage response = client.backend().categoryUpdate("category_id", new BackendCategoryupdate());

// Returns a specific config.
BackendConfig response = client.backend().configGet("config_id");

// Returns a paginated list of configuration values.
BackendConfigcollection response = client.backend().configGetall(1, 1, "search");

// Updates an existing config value.
CommonMessage response = client.backend().configUpdate("config_id", new BackendConfigupdate());

// Sends a message to an agent.
AgentOutput response = client.backend().connectionAgentSend("connection_id", new AgentInput());

// Creates a new connection.
CommonMessage response = client.backend().connectionCreate(new BackendConnectioncreate());

// Creates a new row at a table on a database.
CommonMessage response = client.backend().connectionDatabaseCreaterow("connection_id", "table_name", new BackendDatabaserow());

// Creates a new table on a database.
CommonMessage response = client.backend().connectionDatabaseCreatetable("connection_id", new BackendDatabasetable());

// Deletes an existing row at a table on a database.
CommonMessage response = client.backend().connectionDatabaseDeleterow("connection_id", "table_name", "id");

// Deletes an existing table on a database.
CommonMessage response = client.backend().connectionDatabaseDeletetable("connection_id", "table_name");

// Returns a specific row at a table on a database.
BackendDatabaserow response = client.backend().connectionDatabaseGetrow("connection_id", "table_name", "id");

// Returns paginated rows at a table on a database.
BackendDatabaserowcollection response = client.backend().connectionDatabaseGetrows("connection_id", "table_name", 1, 1, "filterBy", "filterOp", "filterValue", "sortBy", "sortOrder", "columns");

// Returns the schema of a specific table on a database.
BackendDatabasetable response = client.backend().connectionDatabaseGettable("connection_id", "table_name");

// Returns all available tables on a database.
BackendDatabasetablecollection response = client.backend().connectionDatabaseGettables("connection_id", 1, 1);

// Updates an existing row at a table on a database.
CommonMessage response = client.backend().connectionDatabaseUpdaterow("connection_id", "table_name", "id", new BackendDatabaserow());

// Updates an existing table on a database.
CommonMessage response = client.backend().connectionDatabaseUpdatetable("connection_id", "table_name", new BackendDatabasetable());

// Deletes an existing connection.
CommonMessage response = client.backend().connectionDelete("connection_id");

// Uploads one or more files on the filesystem connection.
CommonMessage response = client.backend().connectionFilesystemCreate("connection_id", new Object());

// Deletes an existing file on the filesystem connection.
CommonMessage response = client.backend().connectionFilesystemDelete("connection_id", "file_id");

// Returns the content of the provided file id on the filesystem connection.
client.backend().connectionFilesystemGet("connection_id", "file_id");

// Returns all available files on the filesystem connection.
BackendFilecollection response = client.backend().connectionFilesystemGetall("connection_id", 1, 1);

// Updates an existing file on the filesystem connection.
CommonMessage response = client.backend().connectionFilesystemUpdate("connection_id", "file_id", new Object());

// Returns a specific connection.
BackendConnection response = client.backend().connectionGet("connection_id");

// Returns a paginated list of connections.
BackendConnectioncollection response = client.backend().connectionGetall(1, 1, "search", "class");

// Returns all available connection classes.
BackendConnectionindex response = client.backend().connectionGetclasses();

// Returns the connection config form.
CommonFormcontainer response = client.backend().connectionGetform("class");

// Returns a redirect url to start the OAuth2 authorization flow for the given connection.
BackendConnectionredirectresponse response = client.backend().connectionGetredirect("connection_id");

// Sends an arbitrary HTTP request to the connection.
BackendHttpresponse response = client.backend().connectionHttpExecute("connection_id", new BackendHttprequest());

// Returns the SDK specification.
Passthru response = client.backend().connectionSdkGet("connection_id");

// Updates an existing connection.
CommonMessage response = client.backend().connectionUpdate("connection_id", new BackendConnectionupdate());

// Creates a new cronjob.
CommonMessage response = client.backend().cronjobCreate(new BackendCronjobcreate());

// Deletes an existing cronjob.
CommonMessage response = client.backend().cronjobDelete("cronjob_id");

// Returns a specific cronjob.
BackendCronjob response = client.backend().cronjobGet("cronjob_id");

// Returns a paginated list of cronjobs.
BackendCronjobcollection response = client.backend().cronjobGetall(1, 1, "search", 1);

// Updates an existing cronjob.
CommonMessage response = client.backend().cronjobUpdate("cronjob_id", new BackendCronjobupdate());

// Returns all available dashboard widgets.
BackendDashboard response = client.backend().dashboardGetall();

// Creates a new event.
CommonMessage response = client.backend().eventCreate(new BackendEventcreate());

// Deletes an existing event.
CommonMessage response = client.backend().eventDelete("event_id");

// Returns a specific event.
BackendEvent response = client.backend().eventGet("event_id");

// Returns a paginated list of events.
BackendEventcollection response = client.backend().eventGetall(1, 1, "search", 1);

// Updates an existing event.
CommonMessage response = client.backend().eventUpdate("event_id", new BackendEventupdate());

// Creates a new firewall rule.
CommonMessage response = client.backend().firewallCreate(new BackendFirewallcreate());

// Deletes an existing firewall rule.
CommonMessage response = client.backend().firewallDelete("firewall_id");

// Returns a specific firewall rule.
BackendFirewall response = client.backend().firewallGet("firewall_id");

// Returns a paginated list of firewall rules.
BackendFirewallcollection response = client.backend().firewallGetall(1, 1, "search");

// Updates an existing firewall rule.
CommonMessage response = client.backend().firewallUpdate("firewall_id", new BackendFirewallupdate());

// Creates a new form.
CommonMessage response = client.backend().formCreate(new BackendFormcreate());

// Deletes an existing form.
CommonMessage response = client.backend().formDelete("form_id");

// Returns a specific form.
BackendForm response = client.backend().formGet("form_id");

// Returns a paginated list of forms.
BackendFormcollection response = client.backend().formGetall(1, 1, "search");

// Updates an existing form.
CommonMessage response = client.backend().formUpdate("form_id", new BackendFormupdate());

// Executes a generator with the provided config.
CommonMessage response = client.backend().generatorExecuteprovider("provider", new BackendGeneratorprovider());

// Generates a changelog of all potential changes if you execute this generator with the provided config.
BackendGeneratorproviderchangelog response = client.backend().generatorGetchangelog("provider", new BackendGeneratorproviderconfig());

// Returns all available generator classes.
BackendGeneratorindexproviders response = client.backend().generatorGetclasses();

// Returns the generator config form.
CommonFormcontainer response = client.backend().generatorGetform("provider");

// Creates a new identity.
CommonMessage response = client.backend().identityCreate(new BackendIdentitycreate());

// Deletes an existing identity.
CommonMessage response = client.backend().identityDelete("identity_id");

// Returns a specific identity.
BackendIdentity response = client.backend().identityGet("identity_id");

// Returns a paginated list of identities.
BackendIdentitycollection response = client.backend().identityGetall(1, 1, "search");

// Returns all available identity classes.
BackendIdentityindex response = client.backend().identityGetclasses();

// Returns the identity config form.
CommonFormcontainer response = client.backend().identityGetform("class");

// Updates an existing identity.
CommonMessage response = client.backend().identityUpdate("identity_id", new BackendIdentityupdate());

// Returns a specific log.
BackendLog response = client.backend().logGet("log_id");

// Returns a paginated list of logs.
BackendLogcollection response = client.backend().logGetall(1, 1, "search", "from", "to", 1, 1, 1, "ip", "userAgent", "method", "path", "header", "body");

// Returns a paginated list of log errors.
BackendLogerrorcollection response = client.backend().logGetallerrors(1, 1, "search");

// Returns a specific error.
BackendLogerror response = client.backend().logGeterror("error_id");

// Returns a specific marketplace action.
Marketplaceaction response = client.backend().marketplaceActionGet("user", "name");

// Returns a paginated list of marketplace actions.
Marketplaceactioncollection response = client.backend().marketplaceActionGetall(1, "query");

// Installs an action from the marketplace.
Marketplacemessage response = client.backend().marketplaceActionInstall(new Marketplaceinstall());

// Upgrades an action from the marketplace.
CommonMessage response = client.backend().marketplaceActionUpgrade("user", "name");

// Returns a specific marketplace app.
Marketplaceapp response = client.backend().marketplaceAppGet("user", "name");

// Returns a paginated list of marketplace apps.
Marketplaceappcollection response = client.backend().marketplaceAppGetall(1, "query");

// Installs an app from the marketplace.
Marketplacemessage response = client.backend().marketplaceAppInstall(new Marketplaceinstall());

// Upgrades an app from the marketplace.
Marketplacemessage response = client.backend().marketplaceAppUpgrade("user", "name");

// Returns a specific marketplace bundle.
Marketplacebundle response = client.backend().marketplaceBundleGet("user", "name");

// Returns a paginated list of marketplace bundles.
Marketplacebundlecollection response = client.backend().marketplaceBundleGetall(1, "query");

// Installs an bundle from the marketplace.
Marketplacemessage response = client.backend().marketplaceBundleInstall(new Marketplaceinstall());

// Upgrades an bundle from the marketplace.
Marketplacemessage response = client.backend().marketplaceBundleUpgrade("user", "name");

// Creates a new operation.
CommonMessage response = client.backend().operationCreate(new BackendOperationcreate());

// Deletes an existing operation.
CommonMessage response = client.backend().operationDelete("operation_id");

// Returns a specific operation.
BackendOperation response = client.backend().operationGet("operation_id");

// Returns a paginated list of operations.
BackendOperationcollection response = client.backend().operationGetall(1, 1, "search", 1);

// Updates an existing operation.
CommonMessage response = client.backend().operationUpdate("operation_id", new BackendOperationupdate());

// Creates a new page.
CommonMessage response = client.backend().pageCreate(new BackendPagecreate());

// Deletes an existing page.
CommonMessage response = client.backend().pageDelete("page_id");

// Returns a specific page.
BackendPage response = client.backend().pageGet("page_id");

// Returns a paginated list of pages.
BackendPagecollection response = client.backend().pageGetall(1, 1, "search");

// Updates an existing page.
CommonMessage response = client.backend().pageUpdate("page_id", new BackendPageupdate());

// Creates a new plan.
CommonMessage response = client.backend().planCreate(new BackendPlancreate());

// Deletes an existing plan.
CommonMessage response = client.backend().planDelete("plan_id");

// Returns a specific plan.
BackendPlan response = client.backend().planGet("plan_id");

// Returns a paginated list of plans.
BackendPlancollection response = client.backend().planGetall(1, 1, "search");

// Updates an existing plan.
CommonMessage response = client.backend().planUpdate("plan_id", new BackendPlanupdate());

// Creates a new rate limitation.
CommonMessage response = client.backend().rateCreate(new BackendRatecreate());

// Deletes an existing rate.
CommonMessage response = client.backend().rateDelete("rate_id");

// Returns a specific rate.
BackendRate response = client.backend().rateGet("rate_id");

// Returns a paginated list of rate limitations.
BackendRatecollection response = client.backend().rateGetall(1, 1, "search");

// Updates an existing rate.
CommonMessage response = client.backend().rateUpdate("rate_id", new BackendRateupdate());

// Creates a new role.
CommonMessage response = client.backend().roleCreate(new BackendRolecreate());

// Deletes an existing role.
CommonMessage response = client.backend().roleDelete("role_id");

// Returns a specific role.
BackendRole response = client.backend().roleGet("role_id");

// Returns a paginated list of roles.
BackendRolecollection response = client.backend().roleGetall(1, 1, "search");

// Updates an existing role.
CommonMessage response = client.backend().roleUpdate("role_id", new BackendRoleupdate());

// Creates a new schema.
CommonMessage response = client.backend().schemaCreate(new BackendSchemacreate());

// Deletes an existing schema.
CommonMessage response = client.backend().schemaDelete("schema_id");

// Returns a specific schema.
BackendSchema response = client.backend().schemaGet("schema_id");

// Returns a paginated list of schemas.
BackendSchemacollection response = client.backend().schemaGetall(1, 1, "search", 1);

// Returns a paginated list of schema commits.
BackendSchemacommitcollection response = client.backend().schemaGetcommits("schema_id", 1, 1, "search");

// Returns a HTML preview of the provided schema.
BackendSchemapreviewresponse response = client.backend().schemaGetpreview("schema_id");

// Updates an existing schema.
CommonMessage response = client.backend().schemaUpdate("schema_id", new BackendSchemaupdate());

// Creates a new scope.
CommonMessage response = client.backend().scopeCreate(new BackendScopecreate());

// Deletes an existing scope.
CommonMessage response = client.backend().scopeDelete("scope_id");

// Returns a specific scope.
BackendScope response = client.backend().scopeGet("scope_id");

// Returns a paginated list of scopes.
BackendScopecollection response = client.backend().scopeGetall(1, 1, "search");

// Returns all available scopes grouped by category.
BackendScopecategories response = client.backend().scopeGetcategories();

// Updates an existing scope.
CommonMessage response = client.backend().scopeUpdate("scope_id", new BackendScopeupdate());

// Generates a specific SDK.
BackendSdkmessage response = client.backend().sdkGenerate(new BackendSdkgenerate());

// Returns a paginated list of SDKs.
BackendSdkresponse response = client.backend().sdkGetall();

// Returns the TypeHub specification.
BackendSpecificationget response = client.backend().specificationGet();

// Returns the changelog between your current specification and the last tag.
BackendSpecificationchangelog response = client.backend().specificationGetchangelog();

// Publish the specification.
CommonMessage response = client.backend().specificationPublish(new BackendSpecificationpublish());

// Creates a new tag of your specification.
CommonMessage response = client.backend().specificationTag(new Passthru());

// Returns a statistic containing the activities per user.
BackendStatisticchart response = client.backend().statisticGetactivitiesperuser(1, 1, "search", "from", "to", 1, 1, 1, "ip", "userAgent", "method", "path", "header", "body");

// Returns a statistic containing the request count.
BackendStatisticcount response = client.backend().statisticGetcountrequests(1, 1, "search", "from", "to", 1, 1, 1, "ip", "userAgent", "method", "path", "header", "body");

// Returns a statistic containing the errors per operation.
BackendStatisticchart response = client.backend().statisticGeterrorsperoperation(1, 1, "search", "from", "to", 1, 1, 1, "ip", "userAgent", "method", "path", "header", "body");

// Returns a statistic containing the incoming requests.
BackendStatisticchart response = client.backend().statisticGetincomingrequests(1, 1, "search", "from", "to", 1, 1, 1, "ip", "userAgent", "method", "path", "header", "body");

// Returns a statistic containing the incoming transactions.
BackendStatisticchart response = client.backend().statisticGetincomingtransactions(1, 1, "search", "from", "to", 1, 1, 1, "ip", "userAgent", "method", "path", "header", "body");

// Returns a statistic containing the issues tokens.
BackendStatisticchart response = client.backend().statisticGetissuedtokens(1, 1, "search", "from", "to", 1, 1, 1, "ip", "userAgent", "method", "path", "header", "body");

// Returns a statistic containing the most used activities.
BackendStatisticchart response = client.backend().statisticGetmostusedactivities(1, 1, "search", "from", "to", 1, 1, 1, "ip", "userAgent", "method", "path", "header", "body");

// Returns a statistic containing the most used apps.
BackendStatisticchart response = client.backend().statisticGetmostusedapps(1, 1, "search", "from", "to", 1, 1, 1, "ip", "userAgent", "method", "path", "header", "body");

// Returns a statistic containing the most used operations.
BackendStatisticchart response = client.backend().statisticGetmostusedoperations(1, 1, "search", "from", "to", 1, 1, 1, "ip", "userAgent", "method", "path", "header", "body");

// Returns a statistic containing the requests per ip.
BackendStatisticchart response = client.backend().statisticGetrequestsperip(1, 1, "search", "from", "to", 1, 1, 1, "ip", "userAgent", "method", "path", "header", "body");

// Returns a statistic containing the requests per operation.
BackendStatisticchart response = client.backend().statisticGetrequestsperoperation(1, 1, "search", "from", "to", 1, 1, 1, "ip", "userAgent", "method", "path", "header", "body");

// Returns a statistic containing the requests per user.
BackendStatisticchart response = client.backend().statisticGetrequestsperuser(1, 1, "search", "from", "to", 1, 1, 1, "ip", "userAgent", "method", "path", "header", "body");

// Returns a statistic containing the test coverage.
BackendStatisticchart response = client.backend().statisticGettestcoverage();

// Returns a statistic containing the time average.
BackendStatisticchart response = client.backend().statisticGettimeaverage(1, 1, "search", "from", "to", 1, 1, 1, "ip", "userAgent", "method", "path", "header", "body");

// Returns a statistic containing the time per operation.
BackendStatisticchart response = client.backend().statisticGettimeperoperation(1, 1, "search", "from", "to", 1, 1, 1, "ip", "userAgent", "method", "path", "header", "body");

// Returns a statistic containing the used points.
BackendStatisticchart response = client.backend().statisticGetusedpoints(1, 1, "search", "from", "to", 1, 1, 1, "ip", "userAgent", "method", "path", "header", "body");

// Returns a statistic containing the user registrations.
BackendStatisticchart response = client.backend().statisticGetuserregistrations(1, 1, "search", "from", "to", 1, 1, 1, "ip", "userAgent", "method", "path", "header", "body");

// Creates a new taxonomy.
CommonMessage response = client.backend().taxonomyCreate(new BackendTaxonomycreate());

// Deletes an existing taxonomy.
CommonMessage response = client.backend().taxonomyDelete("taxonomy_id");

// Returns a specific taxonomy.
BackendTaxonomy response = client.backend().taxonomyGet("taxonomy_id");

// Returns a paginated list of taxonomies.
BackendTaxonomycollection response = client.backend().taxonomyGetall(1, 1, "search");

// Moves the provided ids to the taxonomy.
CommonMessage response = client.backend().taxonomyMove("taxonomy_id", new BackendTaxonomymove());

// Updates an existing taxonomy.
CommonMessage response = client.backend().taxonomyUpdate("taxonomy_id", new BackendTaxonomyupdate());

// Removes an existing tenant.
CommonMessage response = client.backend().tenantRemove("tenant_id");

// Setup a new tenant.
CommonMessage response = client.backend().tenantSetup("tenant_id");

// Returns a specific test.
BackendTest response = client.backend().testGet("test_id");

// Returns a paginated list of tests.
BackendTestcollection response = client.backend().testGetall(1, 1, "search");

// Refresh all tests.
CommonMessage response = client.backend().testRefresh();

// Run all tests.
CommonMessage response = client.backend().testRun();

// Updates an existing test.
CommonMessage response = client.backend().testUpdate("test_id", new BackendTest());

// Returns a specific token.
BackendToken response = client.backend().tokenGet("token_id");

// Returns a paginated list of tokens.
BackendTokencollection response = client.backend().tokenGetall(1, 1, "search", "from", "to", 1, 1, 1, "scope", "ip");

// Returns a specific transaction.
BackendTransaction response = client.backend().transactionGet("transaction_id");

// Returns a paginated list of transactions.
BackendTransactioncollection response = client.backend().transactionGetall(1, 1, "search", "from", "to", 1, 1, 1, "status", "provider", 1);

// Returns all deleted records by trash type.
BackendTrashdatacollection response = client.backend().trashGetallbytype("type", 1, 1, "search");

// Returns all trash types.
BackendTrashtypes response = client.backend().trashGettypes();

// Restores a previously deleted record.
CommonMessage response = client.backend().trashRestore("type", new BackendTrashrestore());

// Creates a new trigger.
CommonMessage response = client.backend().triggerCreate(new BackendTriggercreate());

// Deletes an existing trigger.
CommonMessage response = client.backend().triggerDelete("trigger_id");

// Returns a specific trigger.
BackendTrigger response = client.backend().triggerGet("trigger_id");

// Returns a paginated list of triggers.
BackendTriggercollection response = client.backend().triggerGetall(1, 1, "search", 1);

// Updates an existing trigger.
CommonMessage response = client.backend().triggerUpdate("trigger_id", new BackendTriggerupdate());

// Creates a new user.
CommonMessage response = client.backend().userCreate(new BackendUsercreate());

// Deletes an existing user.
CommonMessage response = client.backend().userDelete("user_id");

// Returns a specific user.
BackendUser response = client.backend().userGet("user_id");

// Returns a paginated list of users.
BackendUsercollection response = client.backend().userGetall(1, 1, "search");

// Resend the activation mail to the provided user.
CommonMessage response = client.backend().userResend("user_id", new Passthru());

// Updates an existing user.
CommonMessage response = client.backend().userUpdate("user_id", new BackendUserupdate());

// Creates a new webhook.
CommonMessage response = client.backend().webhookCreate(new BackendWebhookcreate());

// Deletes an existing webhook.
CommonMessage response = client.backend().webhookDelete("webhook_id");

// Returns a specific webhook.
BackendWebhook response = client.backend().webhookGet("webhook_id");

// Returns a paginated list of webhooks.
BackendWebhookcollection response = client.backend().webhookGetall(1, 1, "search");

// Updates an existing webhook.
CommonMessage response = client.backend().webhookUpdate("webhook_id", new BackendWebhookupdate());

// Activates an previously registered account through a token which was provided to the user via email.
CommonMessage response = client.consumer().accountActivate(new ConsumerUseractivate());

// Authorizes the access of a specific app for the authenticated user.
ConsumerAuthorizeresponse response = client.consumer().accountAuthorize(new ConsumerAuthorizerequest());

// Change the password for the authenticated user.
CommonMessage response = client.consumer().accountChangepassword(new BackendAccountchangepassword());

// Change the password after the password reset flow was started.
CommonMessage response = client.consumer().accountExecutepasswordreset(new ConsumerUserpasswordreset());

// Returns a user data for the authenticated user.
ConsumerUseraccount response = client.consumer().accountGet();

// Returns information about a specific app to start the OAuth2 authorization code flow.
ConsumerAuthorizemeta response = client.consumer().accountGetapp("client_id", "scope");

// User login by providing a username and password.
ConsumerUserjwt response = client.consumer().accountLogin(new ConsumerUserlogin());

// Refresh a previously obtained access token.
ConsumerUserjwt response = client.consumer().accountRefresh(new ConsumerUserrefresh());

// Register a new user account.
CommonMessage response = client.consumer().accountRegister(new ConsumerUserregister());

// Start the password reset flow.
CommonMessage response = client.consumer().accountRequestpasswordreset(new ConsumerUseremail());

// Updates user data for the authenticated user.
CommonMessage response = client.consumer().accountUpdate(new ConsumerUseraccount());

// Returns a specific agent.
ConsumerAgent response = client.consumer().agentGet("agent_id");

// Returns a paginated list of agents.
ConsumerAgentcollection response = client.consumer().agentGetall(1, 1, "search");

// Returns a paginated list of agent messages.
ConsumerAgentmessagecollection response = client.consumer().agentMessageGetall("agent_id", "chat_id");

// Submits a new agent message.
AgentOutput response = client.consumer().agentMessageSubmit("agent_id", new AgentInput());

// Creates a new app for the authenticated user.
CommonMessage response = client.consumer().appCreate(new ConsumerAppcreate());

// Deletes an existing app for the authenticated user.
CommonMessage response = client.consumer().appDelete("app_id");

// Returns a specific app for the authenticated user.
ConsumerApp response = client.consumer().appGet("app_id");

// Returns a paginated list of apps which are assigned to the authenticated user.
ConsumerAppcollection response = client.consumer().appGetall(1, 1, "search");

// Updates an existing app for the authenticated user.
CommonMessage response = client.consumer().appUpdate("app_id", new ConsumerAppupdate());

// Returns a specific event for the authenticated user.
ConsumerEvent response = client.consumer().eventGet("event_id");

// Returns a paginated list of apps which are assigned to the authenticated user.
ConsumerEventcollection response = client.consumer().eventGetall(1, 1, "search");

// Returns a specific form for the authenticated user.
ConsumerForm response = client.consumer().formGet("form_id");

// Returns a paginated list of forms which are relevant to the authenticated user.
ConsumerFormcollection response = client.consumer().formGetall(1, 1, "search");

// Deletes an existing grant for an app which was created by the authenticated user.
CommonMessage response = client.consumer().grantDelete("grant_id");

// Returns a paginated list of grants which are assigned to the authenticated user.
ConsumerGrantcollection response = client.consumer().grantGetall(1, 1, "search");

// Identity callback endpoint to exchange an access token.
Passthru response = client.consumer().identityExchange("identity");

// Returns a paginated list of identities which are relevant to the authenticated user.
ConsumerIdentitycollection response = client.consumer().identityGetall(1, "appKey");

// Redirect the user to the configured identity provider.
Passthru response = client.consumer().identityRedirect("identity");

// Returns a specific log for the authenticated user.
ConsumerLog response = client.consumer().logGet("log_id");

// Returns a paginated list of logs which are assigned to the authenticated user.
ConsumerLogcollection response = client.consumer().logGetall(1, 1, "search");

// Returns a specific page for the authenticated user.
ConsumerPage response = client.consumer().pageGet("page_id");

// Returns a paginated list of pages which are relevant to the authenticated user.
ConsumerPagecollection response = client.consumer().pageGetall(1, 1, "search");

// Start the checkout process for a specific plan.
ConsumerPaymentcheckoutresponse response = client.consumer().paymentCheckout("provider", new ConsumerPaymentcheckoutrequest());

// Generates a payment portal link for the authenticated user.
ConsumerPaymentportalresponse response = client.consumer().paymentPortal("provider", new ConsumerPaymentportalrequest());

// Returns a specific plan for the authenticated user.
ConsumerPlan response = client.consumer().planGet("plan_id");

// Returns a paginated list of plans which are relevant to the authenticated user.
ConsumerPlancollection response = client.consumer().planGetall(1, 1, "search");

// Returns a paginated list of scopes which are assigned to the authenticated user.
ConsumerScopecollection response = client.consumer().scopeGetall(1, 1, "search");

// Returns all scopes by category.
ConsumerScopecategories response = client.consumer().scopeGetcategories();

// Creates a new token for the authenticated user.
ConsumerTokenaccesstoken response = client.consumer().tokenCreate(new ConsumerTokencreate());

// Deletes an existing token for the authenticated user.
CommonMessage response = client.consumer().tokenDelete("token_id");

// Returns a specific token for the authenticated user.
ConsumerToken response = client.consumer().tokenGet("token_id");

// Returns a paginated list of tokens which are assigned to the authenticated user.
ConsumerTokencollection response = client.consumer().tokenGetall(1, 1, "search");

// Updates an existing token for the authenticated user.
ConsumerTokenaccesstoken response = client.consumer().tokenUpdate("token_id", new ConsumerTokenupdate());

// Returns a specific transaction for the authenticated user.
ConsumerTransaction response = client.consumer().transactionGet("transaction_id");

// Returns a paginated list of transactions which are assigned to the authenticated user.
ConsumerTransactioncollection response = client.consumer().transactionGetall(1, 1, "search");

// Creates a new webhook for the authenticated user.
CommonMessage response = client.consumer().webhookCreate(new ConsumerWebhookcreate());

// Deletes an existing webhook for the authenticated user.
CommonMessage response = client.consumer().webhookDelete("webhook_id");

// Returns a specific webhook for the authenticated user.
ConsumerWebhook response = client.consumer().webhookGet("webhook_id");

// Returns a paginated list of webhooks which are assigned to the authenticated user.
ConsumerWebhookcollection response = client.consumer().webhookGetall(1, 1, "search");

// Updates an existing webhook for the authenticated user.
CommonMessage response = client.consumer().webhookUpdate("webhook_id", new ConsumerWebhookupdate());

// Connection OAuth2 callback to authorize a connection.
CommonMessage response = client.system().connectionCallback("name");

// Returns meta information and links about the current installed Fusio version.
SystemAbout response = client.system().metaGetabout();

// Debug endpoint which returns the provided data.
Passthru response = client.system().metaGetdebug(new Passthru());

// Health check endpoint which returns information about the health status of the system.
SystemHealthcheck response = client.system().metaGethealth();

// Returns all available routes.
SystemRoute response = client.system().metaGetroutes();

// Returns details of a specific schema.
SystemSchema response = client.system().metaGetschema("name");

// Payment webhook endpoint after successful purchase of a plan.
CommonMessage response = client.system().paymentWebhook("provider");
```

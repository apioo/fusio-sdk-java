
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
Backend_User response = client.authorization().getWhoami();

// Revoke the access token of the current authenticated user.
Common_Message response = client.authorization().revoke();

// Changes the password of the authenticated user.
Common_Message response = client.backend().account().changePassword(new Backend_AccountChangePassword());

// Returns user data of the authenticated user.
Backend_User response = client.backend().account().get();

// Updates user data of the authenticated user.
Common_Message response = client.backend().account().update(new Backend_UserUpdate());

// Creates a new action.
Common_Message response = client.backend().action().create(new Backend_ActionCreate());

// Deletes an existing action.
Common_Message response = client.backend().action().delete("action_id");

// Executes a specific action.
Backend_ActionExecuteResponse response = client.backend().action().execute("action_id", new Backend_ActionExecuteRequest());

// Returns a specific action.
Backend_Action response = client.backend().action().get("action_id");

// Returns a paginated list of actions.
Backend_ActionCollection response = client.backend().action().getAll(1, 1, "search");

// Returns all available action classes.
Backend_ActionIndex response = client.backend().action().getClasses();

// Returns a paginated list of action commits.
Backend_ActionCommitCollection response = client.backend().action().getCommits("action_id", 1, 1, "search");

// Returns the action config form.
Common_FormContainer response = client.backend().action().getForm("class");

// Updates an existing action.
Common_Message response = client.backend().action().update("action_id", new Backend_ActionUpdate());

// Creates a new agent.
Common_Message response = client.backend().agent().create(new Backend_AgentCreate());

// Deletes an existing agent.
Common_Message response = client.backend().agent().delete("agent_id");

// Returns a specific agent.
Backend_Agent response = client.backend().agent().get("agent_id");

// Returns a paginated list of agents.
Backend_AgentCollection response = client.backend().agent().getAll(1, 1, "search");

// Returns available tools for an agent.
Backend_AgentTools response = client.backend().agent().getTools();

// Returns a paginated list of agent messages.
Backend_AgentMessageCollection response = client.backend().agent().message().getAll("agent_id", "chat_id");

// Submits a new agent message.
Agent_Output response = client.backend().agent().message().submit("agent_id", new Agent_Input());

// Updates an existing agent.
Common_Message response = client.backend().agent().update("agent_id", new Backend_AgentUpdate());

// Creates a new app.
Common_Message response = client.backend().app().create(new Backend_AppCreate());

// Deletes an existing app.
Common_Message response = client.backend().app().delete("app_id");

// Deletes an existing token from an app.
Common_Message response = client.backend().app().deleteToken("app_id", "token_id");

// Returns a specific app.
Backend_App response = client.backend().app().get("app_id");

// Returns a paginated list of apps.
Backend_AppCollection response = client.backend().app().getAll(1, 1, "search");

// Updates an existing app.
Common_Message response = client.backend().app().update("app_id", new Backend_AppUpdate());

// Returns a specific audit.
Backend_Audit response = client.backend().audit().get("audit_id");

// Returns a paginated list of audits.
Backend_AuditCollection response = client.backend().audit().getAll(1, 1, "search", "from", "to", 1, 1, "event", "ip", "message");

// Generates an backup of the current system.
Backend_BackupExport response = client.backend().backup().export();

// Imports an backup to the current system.
Backend_BackupImportResult response = client.backend().backup().import(new Backend_BackupImport());

// Creates a new bundle.
Common_Message response = client.backend().bundle().create(new Backend_BundleCreate());

// Deletes an existing bundle.
Common_Message response = client.backend().bundle().delete("bundle_id");

// Returns a specific bundle.
Backend_Bundle response = client.backend().bundle().get("bundle_id");

// Returns a paginated list of bundles.
Backend_BundleCollection response = client.backend().bundle().getAll(1, 1, "search");

// Publish an existing bundle to the marketplace.
Common_Message response = client.backend().bundle().publish("bundle_id");

// Updates an existing bundle.
Common_Message response = client.backend().bundle().update("bundle_id", new Backend_BundleUpdate());

// Creates a new category.
Common_Message response = client.backend().category().create(new Backend_CategoryCreate());

// Deletes an existing category.
Common_Message response = client.backend().category().delete("category_id");

// Returns a specific category.
Backend_Category response = client.backend().category().get("category_id");

// Returns a paginated list of categories.
Backend_CategoryCollection response = client.backend().category().getAll(1, 1, "search");

// Updates an existing category.
Common_Message response = client.backend().category().update("category_id", new Backend_CategoryUpdate());

// Returns a specific config.
Backend_Config response = client.backend().config().get("config_id");

// Returns a paginated list of configuration values.
Backend_ConfigCollection response = client.backend().config().getAll(1, 1, "search");

// Updates an existing config value.
Common_Message response = client.backend().config().update("config_id", new Backend_ConfigUpdate());

// Sends a message to an agent.
Agent_Output response = client.backend().connection().agent().send("connection_id", new Agent_Input());

// Creates a new connection.
Common_Message response = client.backend().connection().create(new Backend_ConnectionCreate());

// Creates a new row at a table on a database.
Common_Message response = client.backend().connection().database().createRow("connection_id", "table_name", new Backend_DatabaseRow());

// Creates a new table on a database.
Common_Message response = client.backend().connection().database().createTable("connection_id", new Backend_DatabaseTable());

// Deletes an existing row at a table on a database.
Common_Message response = client.backend().connection().database().deleteRow("connection_id", "table_name", "id");

// Deletes an existing table on a database.
Common_Message response = client.backend().connection().database().deleteTable("connection_id", "table_name");

// Returns a specific row at a table on a database.
Backend_DatabaseRow response = client.backend().connection().database().getRow("connection_id", "table_name", "id");

// Returns paginated rows at a table on a database.
Backend_DatabaseRowCollection response = client.backend().connection().database().getRows("connection_id", "table_name", 1, 1, "filterBy", "filterOp", "filterValue", "sortBy", "sortOrder", "columns");

// Returns the schema of a specific table on a database.
Backend_DatabaseTable response = client.backend().connection().database().getTable("connection_id", "table_name");

// Returns all available tables on a database.
Backend_DatabaseTableCollection response = client.backend().connection().database().getTables("connection_id", 1, 1);

// Updates an existing row at a table on a database.
Common_Message response = client.backend().connection().database().updateRow("connection_id", "table_name", "id", new Backend_DatabaseRow());

// Updates an existing table on a database.
Common_Message response = client.backend().connection().database().updateTable("connection_id", "table_name", new Backend_DatabaseTable());

// Deletes an existing connection.
Common_Message response = client.backend().connection().delete("connection_id");

// Uploads one or more files on the filesystem connection.
Common_Message response = client.backend().connection().filesystem().create("connection_id", new Object());

// Deletes an existing file on the filesystem connection.
Common_Message response = client.backend().connection().filesystem().delete("connection_id", "file_id");

// Returns the content of the provided file id on the filesystem connection.
client.backend().connection().filesystem().get("connection_id", "file_id");

// Returns all available files on the filesystem connection.
Backend_FileCollection response = client.backend().connection().filesystem().getAll("connection_id", 1, 1);

// Updates an existing file on the filesystem connection.
Common_Message response = client.backend().connection().filesystem().update("connection_id", "file_id", new Object());

// Returns a specific connection.
Backend_Connection response = client.backend().connection().get("connection_id");

// Returns a paginated list of connections.
Backend_ConnectionCollection response = client.backend().connection().getAll(1, 1, "search", "class");

// Returns all available connection classes.
Backend_ConnectionIndex response = client.backend().connection().getClasses();

// Returns the connection config form.
Common_FormContainer response = client.backend().connection().getForm("class");

// Returns a redirect url to start the OAuth2 authorization flow for the given connection.
Backend_ConnectionRedirectResponse response = client.backend().connection().getRedirect("connection_id");

// Sends an arbitrary HTTP request to the connection.
Backend_HttpResponse response = client.backend().connection().http().execute("connection_id", new Backend_HttpRequest());

// Returns the SDK specification.
Passthru response = client.backend().connection().sdk().get("connection_id");

// Updates an existing connection.
Common_Message response = client.backend().connection().update("connection_id", new Backend_ConnectionUpdate());

// Creates a new cronjob.
Common_Message response = client.backend().cronjob().create(new Backend_CronjobCreate());

// Deletes an existing cronjob.
Common_Message response = client.backend().cronjob().delete("cronjob_id");

// Returns a specific cronjob.
Backend_Cronjob response = client.backend().cronjob().get("cronjob_id");

// Returns a paginated list of cronjobs.
Backend_CronjobCollection response = client.backend().cronjob().getAll(1, 1, "search", 1);

// Updates an existing cronjob.
Common_Message response = client.backend().cronjob().update("cronjob_id", new Backend_CronjobUpdate());

// Returns all available dashboard widgets.
Backend_Dashboard response = client.backend().dashboard().getAll();

// Creates a new event.
Common_Message response = client.backend().event().create(new Backend_EventCreate());

// Deletes an existing event.
Common_Message response = client.backend().event().delete("event_id");

// Returns a specific event.
Backend_Event response = client.backend().event().get("event_id");

// Returns a paginated list of events.
Backend_EventCollection response = client.backend().event().getAll(1, 1, "search", 1);

// Updates an existing event.
Common_Message response = client.backend().event().update("event_id", new Backend_EventUpdate());

// Creates a new firewall rule.
Common_Message response = client.backend().firewall().create(new Backend_FirewallCreate());

// Deletes an existing firewall rule.
Common_Message response = client.backend().firewall().delete("firewall_id");

// Returns a specific firewall rule.
Backend_Firewall response = client.backend().firewall().get("firewall_id");

// Returns a paginated list of firewall rules.
Backend_FirewallCollection response = client.backend().firewall().getAll(1, 1, "search");

// Updates an existing firewall rule.
Common_Message response = client.backend().firewall().update("firewall_id", new Backend_FirewallUpdate());

// Creates a new form.
Common_Message response = client.backend().form().create(new Backend_FormCreate());

// Deletes an existing form.
Common_Message response = client.backend().form().delete("form_id");

// Returns a specific form.
Backend_Form response = client.backend().form().get("form_id");

// Returns a paginated list of forms.
Backend_FormCollection response = client.backend().form().getAll(1, 1, "search");

// Updates an existing form.
Common_Message response = client.backend().form().update("form_id", new Backend_FormUpdate());

// Executes a generator with the provided config.
Common_Message response = client.backend().generator().executeProvider("provider", new Backend_GeneratorProvider());

// Generates a changelog of all potential changes if you execute this generator with the provided config.
Backend_GeneratorProviderChangelog response = client.backend().generator().getChangelog("provider", new Backend_GeneratorProviderConfig());

// Returns all available generator classes.
Backend_GeneratorIndexProviders response = client.backend().generator().getClasses();

// Returns the generator config form.
Common_FormContainer response = client.backend().generator().getForm("provider");

// Creates a new identity.
Common_Message response = client.backend().identity().create(new Backend_IdentityCreate());

// Deletes an existing identity.
Common_Message response = client.backend().identity().delete("identity_id");

// Returns a specific identity.
Backend_Identity response = client.backend().identity().get("identity_id");

// Returns a paginated list of identities.
Backend_IdentityCollection response = client.backend().identity().getAll(1, 1, "search");

// Returns all available identity classes.
Backend_IdentityIndex response = client.backend().identity().getClasses();

// Returns the identity config form.
Common_FormContainer response = client.backend().identity().getForm("class");

// Updates an existing identity.
Common_Message response = client.backend().identity().update("identity_id", new Backend_IdentityUpdate());

// Returns a specific log.
Backend_Log response = client.backend().log().get("log_id");

// Returns a paginated list of logs.
Backend_LogCollection response = client.backend().log().getAll(1, 1, "search", "from", "to", 1, 1, 1, "ip", "userAgent", "method", "path", "header", "body");

// Returns a paginated list of log errors.
Backend_LogErrorCollection response = client.backend().log().getAllErrors(1, 1, "search");

// Returns a specific error.
Backend_LogError response = client.backend().log().getError("error_id");

// Returns a specific marketplace action.
MarketplaceAction response = client.backend().marketplace().action().get("user", "name");

// Returns a paginated list of marketplace actions.
MarketplaceActionCollection response = client.backend().marketplace().action().getAll(1, "query");

// Installs an action from the marketplace.
MarketplaceMessage response = client.backend().marketplace().action().install(new MarketplaceInstall());

// Upgrades an action from the marketplace.
Common_Message response = client.backend().marketplace().action().upgrade("user", "name");

// Returns a specific marketplace app.
MarketplaceApp response = client.backend().marketplace().app().get("user", "name");

// Returns a paginated list of marketplace apps.
MarketplaceAppCollection response = client.backend().marketplace().app().getAll(1, "query");

// Installs an app from the marketplace.
MarketplaceMessage response = client.backend().marketplace().app().install(new MarketplaceInstall());

// Upgrades an app from the marketplace.
MarketplaceMessage response = client.backend().marketplace().app().upgrade("user", "name");

// Returns a specific marketplace bundle.
MarketplaceBundle response = client.backend().marketplace().bundle().get("user", "name");

// Returns a paginated list of marketplace bundles.
MarketplaceBundleCollection response = client.backend().marketplace().bundle().getAll(1, "query");

// Installs an bundle from the marketplace.
MarketplaceMessage response = client.backend().marketplace().bundle().install(new MarketplaceInstall());

// Upgrades an bundle from the marketplace.
MarketplaceMessage response = client.backend().marketplace().bundle().upgrade("user", "name");

// Creates a new operation.
Common_Message response = client.backend().operation().create(new Backend_OperationCreate());

// Deletes an existing operation.
Common_Message response = client.backend().operation().delete("operation_id");

// Returns a specific operation.
Backend_Operation response = client.backend().operation().get("operation_id");

// Returns a paginated list of operations.
Backend_OperationCollection response = client.backend().operation().getAll(1, 1, "search", 1);

// Updates an existing operation.
Common_Message response = client.backend().operation().update("operation_id", new Backend_OperationUpdate());

// Creates a new page.
Common_Message response = client.backend().page().create(new Backend_PageCreate());

// Deletes an existing page.
Common_Message response = client.backend().page().delete("page_id");

// Returns a specific page.
Backend_Page response = client.backend().page().get("page_id");

// Returns a paginated list of pages.
Backend_PageCollection response = client.backend().page().getAll(1, 1, "search");

// Updates an existing page.
Common_Message response = client.backend().page().update("page_id", new Backend_PageUpdate());

// Creates a new plan.
Common_Message response = client.backend().plan().create(new Backend_PlanCreate());

// Deletes an existing plan.
Common_Message response = client.backend().plan().delete("plan_id");

// Returns a specific plan.
Backend_Plan response = client.backend().plan().get("plan_id");

// Returns a paginated list of plans.
Backend_PlanCollection response = client.backend().plan().getAll(1, 1, "search");

// Updates an existing plan.
Common_Message response = client.backend().plan().update("plan_id", new Backend_PlanUpdate());

// Creates a new rate limitation.
Common_Message response = client.backend().rate().create(new Backend_RateCreate());

// Deletes an existing rate.
Common_Message response = client.backend().rate().delete("rate_id");

// Returns a specific rate.
Backend_Rate response = client.backend().rate().get("rate_id");

// Returns a paginated list of rate limitations.
Backend_RateCollection response = client.backend().rate().getAll(1, 1, "search");

// Updates an existing rate.
Common_Message response = client.backend().rate().update("rate_id", new Backend_RateUpdate());

// Creates a new role.
Common_Message response = client.backend().role().create(new Backend_RoleCreate());

// Deletes an existing role.
Common_Message response = client.backend().role().delete("role_id");

// Returns a specific role.
Backend_Role response = client.backend().role().get("role_id");

// Returns a paginated list of roles.
Backend_RoleCollection response = client.backend().role().getAll(1, 1, "search");

// Updates an existing role.
Common_Message response = client.backend().role().update("role_id", new Backend_RoleUpdate());

// Creates a new schema.
Common_Message response = client.backend().schema().create(new Backend_SchemaCreate());

// Deletes an existing schema.
Common_Message response = client.backend().schema().delete("schema_id");

// Returns a specific schema.
Backend_Schema response = client.backend().schema().get("schema_id");

// Returns a paginated list of schemas.
Backend_SchemaCollection response = client.backend().schema().getAll(1, 1, "search", 1);

// Returns a paginated list of schema commits.
Backend_SchemaCommitCollection response = client.backend().schema().getCommits("schema_id", 1, 1, "search");

// Returns a HTML preview of the provided schema.
Backend_SchemaPreviewResponse response = client.backend().schema().getPreview("schema_id");

// Updates an existing schema.
Common_Message response = client.backend().schema().update("schema_id", new Backend_SchemaUpdate());

// Creates a new scope.
Common_Message response = client.backend().scope().create(new Backend_ScopeCreate());

// Deletes an existing scope.
Common_Message response = client.backend().scope().delete("scope_id");

// Returns a specific scope.
Backend_Scope response = client.backend().scope().get("scope_id");

// Returns a paginated list of scopes.
Backend_ScopeCollection response = client.backend().scope().getAll(1, 1, "search");

// Returns all available scopes grouped by category.
Backend_ScopeCategories response = client.backend().scope().getCategories();

// Updates an existing scope.
Common_Message response = client.backend().scope().update("scope_id", new Backend_ScopeUpdate());

// Generates a specific SDK.
Backend_SdkMessage response = client.backend().sdk().generate(new Backend_SdkGenerate());

// Returns a paginated list of SDKs.
Backend_SdkResponse response = client.backend().sdk().getAll();

// Returns the TypeHub specification.
Backend_SpecificationGet response = client.backend().specification().get();

// Returns the changelog between your current specification and the last tag.
Backend_SpecificationChangelog response = client.backend().specification().getChangelog();

// Publish the specification.
Common_Message response = client.backend().specification().publish(new Backend_SpecificationPublish());

// Creates a new tag of your specification.
Common_Message response = client.backend().specification().tag(new Passthru());

// Returns a statistic containing the activities per user.
Backend_StatisticChart response = client.backend().statistic().getActivitiesPerUser(1, 1, "search", "from", "to", 1, 1, 1, "ip", "userAgent", "method", "path", "header", "body");

// Returns a statistic containing the request count.
Backend_StatisticCount response = client.backend().statistic().getCountRequests(1, 1, "search", "from", "to", 1, 1, 1, "ip", "userAgent", "method", "path", "header", "body");

// Returns a statistic containing the errors per operation.
Backend_StatisticChart response = client.backend().statistic().getErrorsPerOperation(1, 1, "search", "from", "to", 1, 1, 1, "ip", "userAgent", "method", "path", "header", "body");

// Returns a statistic containing the incoming requests.
Backend_StatisticChart response = client.backend().statistic().getIncomingRequests(1, 1, "search", "from", "to", 1, 1, 1, "ip", "userAgent", "method", "path", "header", "body");

// Returns a statistic containing the incoming transactions.
Backend_StatisticChart response = client.backend().statistic().getIncomingTransactions(1, 1, "search", "from", "to", 1, 1, 1, "ip", "userAgent", "method", "path", "header", "body");

// Returns a statistic containing the issues tokens.
Backend_StatisticChart response = client.backend().statistic().getIssuedTokens(1, 1, "search", "from", "to", 1, 1, 1, "ip", "userAgent", "method", "path", "header", "body");

// Returns a statistic containing the most used activities.
Backend_StatisticChart response = client.backend().statistic().getMostUsedActivities(1, 1, "search", "from", "to", 1, 1, 1, "ip", "userAgent", "method", "path", "header", "body");

// Returns a statistic containing the most used apps.
Backend_StatisticChart response = client.backend().statistic().getMostUsedApps(1, 1, "search", "from", "to", 1, 1, 1, "ip", "userAgent", "method", "path", "header", "body");

// Returns a statistic containing the most used operations.
Backend_StatisticChart response = client.backend().statistic().getMostUsedOperations(1, 1, "search", "from", "to", 1, 1, 1, "ip", "userAgent", "method", "path", "header", "body");

// Returns a statistic containing the requests per ip.
Backend_StatisticChart response = client.backend().statistic().getRequestsPerIP(1, 1, "search", "from", "to", 1, 1, 1, "ip", "userAgent", "method", "path", "header", "body");

// Returns a statistic containing the requests per operation.
Backend_StatisticChart response = client.backend().statistic().getRequestsPerOperation(1, 1, "search", "from", "to", 1, 1, 1, "ip", "userAgent", "method", "path", "header", "body");

// Returns a statistic containing the requests per user.
Backend_StatisticChart response = client.backend().statistic().getRequestsPerUser(1, 1, "search", "from", "to", 1, 1, 1, "ip", "userAgent", "method", "path", "header", "body");

// Returns a statistic containing the test coverage.
Backend_StatisticChart response = client.backend().statistic().getTestCoverage();

// Returns a statistic containing the time average.
Backend_StatisticChart response = client.backend().statistic().getTimeAverage(1, 1, "search", "from", "to", 1, 1, 1, "ip", "userAgent", "method", "path", "header", "body");

// Returns a statistic containing the time per operation.
Backend_StatisticChart response = client.backend().statistic().getTimePerOperation(1, 1, "search", "from", "to", 1, 1, 1, "ip", "userAgent", "method", "path", "header", "body");

// Returns a statistic containing the used points.
Backend_StatisticChart response = client.backend().statistic().getUsedPoints(1, 1, "search", "from", "to", 1, 1, 1, "ip", "userAgent", "method", "path", "header", "body");

// Returns a statistic containing the user registrations.
Backend_StatisticChart response = client.backend().statistic().getUserRegistrations(1, 1, "search", "from", "to", 1, 1, 1, "ip", "userAgent", "method", "path", "header", "body");

// Creates a new taxonomy.
Common_Message response = client.backend().taxonomy().create(new Backend_TaxonomyCreate());

// Deletes an existing taxonomy.
Common_Message response = client.backend().taxonomy().delete("taxonomy_id");

// Returns a specific taxonomy.
Backend_Taxonomy response = client.backend().taxonomy().get("taxonomy_id");

// Returns a paginated list of taxonomies.
Backend_TaxonomyCollection response = client.backend().taxonomy().getAll(1, 1, "search");

// Moves the provided ids to the taxonomy.
Common_Message response = client.backend().taxonomy().move("taxonomy_id", new Backend_TaxonomyMove());

// Updates an existing taxonomy.
Common_Message response = client.backend().taxonomy().update("taxonomy_id", new Backend_TaxonomyUpdate());

// Removes an existing tenant.
Common_Message response = client.backend().tenant().remove("tenant_id");

// Setup a new tenant.
Common_Message response = client.backend().tenant().setup("tenant_id");

// Returns a specific test.
Backend_Test response = client.backend().test().get("test_id");

// Returns a paginated list of tests.
Backend_TestCollection response = client.backend().test().getAll(1, 1, "search");

// Refresh all tests.
Common_Message response = client.backend().test().refresh();

// Run all tests.
Common_Message response = client.backend().test().run();

// Updates an existing test.
Common_Message response = client.backend().test().update("test_id", new Backend_Test());

// Returns a specific token.
Backend_Token response = client.backend().token().get("token_id");

// Returns a paginated list of tokens.
Backend_TokenCollection response = client.backend().token().getAll(1, 1, "search", "from", "to", 1, 1, 1, "scope", "ip");

// Returns a specific transaction.
Backend_Transaction response = client.backend().transaction().get("transaction_id");

// Returns a paginated list of transactions.
Backend_TransactionCollection response = client.backend().transaction().getAll(1, 1, "search", "from", "to", 1, 1, 1, "status", "provider", 1);

// Returns all deleted records by trash type.
Backend_TrashDataCollection response = client.backend().trash().getAllByType("type", 1, 1, "search");

// Returns all trash types.
Backend_TrashTypes response = client.backend().trash().getTypes();

// Restores a previously deleted record.
Common_Message response = client.backend().trash().restore("type", new Backend_TrashRestore());

// Creates a new trigger.
Common_Message response = client.backend().trigger().create(new Backend_TriggerCreate());

// Deletes an existing trigger.
Common_Message response = client.backend().trigger().delete("trigger_id");

// Returns a specific trigger.
Backend_Trigger response = client.backend().trigger().get("trigger_id");

// Returns a paginated list of triggers.
Backend_TriggerCollection response = client.backend().trigger().getAll(1, 1, "search", 1);

// Updates an existing trigger.
Common_Message response = client.backend().trigger().update("trigger_id", new Backend_TriggerUpdate());

// Creates a new user.
Common_Message response = client.backend().user().create(new Backend_UserCreate());

// Deletes an existing user.
Common_Message response = client.backend().user().delete("user_id");

// Returns a specific user.
Backend_User response = client.backend().user().get("user_id");

// Returns a paginated list of users.
Backend_UserCollection response = client.backend().user().getAll(1, 1, "search");

// Resend the activation mail to the provided user.
Common_Message response = client.backend().user().resend("user_id", new Passthru());

// Updates an existing user.
Common_Message response = client.backend().user().update("user_id", new Backend_UserUpdate());

// Creates a new webhook.
Common_Message response = client.backend().webhook().create(new Backend_WebhookCreate());

// Deletes an existing webhook.
Common_Message response = client.backend().webhook().delete("webhook_id");

// Returns a specific webhook.
Backend_Webhook response = client.backend().webhook().get("webhook_id");

// Returns a paginated list of webhooks.
Backend_WebhookCollection response = client.backend().webhook().getAll(1, 1, "search");

// Updates an existing webhook.
Common_Message response = client.backend().webhook().update("webhook_id", new Backend_WebhookUpdate());

// Activates an previously registered account through a token which was provided to the user via email.
Common_Message response = client.consumer().account().activate(new Consumer_UserActivate());

// Authorizes the access of a specific app for the authenticated user.
Consumer_AuthorizeResponse response = client.consumer().account().authorize(new Consumer_AuthorizeRequest());

// Change the password for the authenticated user.
Common_Message response = client.consumer().account().changePassword(new Backend_AccountChangePassword());

// Change the password after the password reset flow was started.
Common_Message response = client.consumer().account().executePasswordReset(new Consumer_UserPasswordReset());

// Returns a user data for the authenticated user.
Consumer_UserAccount response = client.consumer().account().get();

// Returns information about a specific app to start the OAuth2 authorization code flow.
Consumer_AuthorizeMeta response = client.consumer().account().getApp("client_id", "scope");

// User login by providing a username and password.
Consumer_UserJWT response = client.consumer().account().login(new Consumer_UserLogin());

// Refresh a previously obtained access token.
Consumer_UserJWT response = client.consumer().account().refresh(new Consumer_UserRefresh());

// Register a new user account.
Common_Message response = client.consumer().account().register(new Consumer_UserRegister());

// Start the password reset flow.
Common_Message response = client.consumer().account().requestPasswordReset(new Consumer_UserEmail());

// Updates user data for the authenticated user.
Common_Message response = client.consumer().account().update(new Consumer_UserAccount());

// Returns a specific agent.
Consumer_Agent response = client.consumer().agent().get("agent_id");

// Returns a paginated list of agents.
Consumer_AgentCollection response = client.consumer().agent().getAll(1, 1, "search");

// Returns a paginated list of agent messages.
Consumer_AgentMessageCollection response = client.consumer().agent().message().getAll("agent_id", "chat_id");

// Submits a new agent message.
Agent_Output response = client.consumer().agent().message().submit("agent_id", new Agent_Input());

// Creates a new app for the authenticated user.
Common_Message response = client.consumer().app().create(new Consumer_AppCreate());

// Deletes an existing app for the authenticated user.
Common_Message response = client.consumer().app().delete("app_id");

// Returns a specific app for the authenticated user.
Consumer_App response = client.consumer().app().get("app_id");

// Returns a paginated list of apps which are assigned to the authenticated user.
Consumer_AppCollection response = client.consumer().app().getAll(1, 1, "search");

// Updates an existing app for the authenticated user.
Common_Message response = client.consumer().app().update("app_id", new Consumer_AppUpdate());

// Returns a specific event for the authenticated user.
Consumer_Event response = client.consumer().event().get("event_id");

// Returns a paginated list of apps which are assigned to the authenticated user.
Consumer_EventCollection response = client.consumer().event().getAll(1, 1, "search");

// Returns a specific form for the authenticated user.
Consumer_Form response = client.consumer().form().get("form_id");

// Returns a paginated list of forms which are relevant to the authenticated user.
Consumer_FormCollection response = client.consumer().form().getAll(1, 1, "search");

// Deletes an existing grant for an app which was created by the authenticated user.
Common_Message response = client.consumer().grant().delete("grant_id");

// Returns a paginated list of grants which are assigned to the authenticated user.
Consumer_GrantCollection response = client.consumer().grant().getAll(1, 1, "search");

// Identity callback endpoint to exchange an access token.
Passthru response = client.consumer().identity().exchange("identity");

// Returns a paginated list of identities which are relevant to the authenticated user.
Consumer_IdentityCollection response = client.consumer().identity().getAll(1, "appKey");

// Redirect the user to the configured identity provider.
Passthru response = client.consumer().identity().redirect("identity");

// Returns a specific log for the authenticated user.
Consumer_Log response = client.consumer().log().get("log_id");

// Returns a paginated list of logs which are assigned to the authenticated user.
Consumer_LogCollection response = client.consumer().log().getAll(1, 1, "search");

// Returns a specific page for the authenticated user.
Consumer_Page response = client.consumer().page().get("page_id");

// Returns a paginated list of pages which are relevant to the authenticated user.
Consumer_PageCollection response = client.consumer().page().getAll(1, 1, "search");

// Start the checkout process for a specific plan.
Consumer_PaymentCheckoutResponse response = client.consumer().payment().checkout("provider", new Consumer_PaymentCheckoutRequest());

// Generates a payment portal link for the authenticated user.
Consumer_PaymentPortalResponse response = client.consumer().payment().portal("provider", new Consumer_PaymentPortalRequest());

// Returns a specific plan for the authenticated user.
Consumer_Plan response = client.consumer().plan().get("plan_id");

// Returns a paginated list of plans which are relevant to the authenticated user.
Consumer_PlanCollection response = client.consumer().plan().getAll(1, 1, "search");

// Returns a paginated list of scopes which are assigned to the authenticated user.
Consumer_ScopeCollection response = client.consumer().scope().getAll(1, 1, "search");

// Returns all scopes by category.
Consumer_ScopeCategories response = client.consumer().scope().getCategories();

// Creates a new token for the authenticated user.
Consumer_TokenAccessToken response = client.consumer().token().create(new Consumer_TokenCreate());

// Deletes an existing token for the authenticated user.
Common_Message response = client.consumer().token().delete("token_id");

// Returns a specific token for the authenticated user.
Consumer_Token response = client.consumer().token().get("token_id");

// Returns a paginated list of tokens which are assigned to the authenticated user.
Consumer_TokenCollection response = client.consumer().token().getAll(1, 1, "search");

// Updates an existing token for the authenticated user.
Consumer_TokenAccessToken response = client.consumer().token().update("token_id", new Consumer_TokenUpdate());

// Returns a specific transaction for the authenticated user.
Consumer_Transaction response = client.consumer().transaction().get("transaction_id");

// Returns a paginated list of transactions which are assigned to the authenticated user.
Consumer_TransactionCollection response = client.consumer().transaction().getAll(1, 1, "search");

// Creates a new webhook for the authenticated user.
Common_Message response = client.consumer().webhook().create(new Consumer_WebhookCreate());

// Deletes an existing webhook for the authenticated user.
Common_Message response = client.consumer().webhook().delete("webhook_id");

// Returns a specific webhook for the authenticated user.
Consumer_Webhook response = client.consumer().webhook().get("webhook_id");

// Returns a paginated list of webhooks which are assigned to the authenticated user.
Consumer_WebhookCollection response = client.consumer().webhook().getAll(1, 1, "search");

// Updates an existing webhook for the authenticated user.
Common_Message response = client.consumer().webhook().update("webhook_id", new Consumer_WebhookUpdate());

// Endpoint to generate a captcha challenge.
System_CaptchaChallenge response = client.system().captcha().challenge();

// Connection OAuth2 callback to authorize a connection.
Common_Message response = client.system().connection().callback("name");

// Returns meta information and links about the current installed Fusio version.
System_About response = client.system().meta().getAbout();

// Debug endpoint which returns the provided data.
Passthru response = client.system().meta().getDebug(new Passthru());

// Health check endpoint which returns information about the health status of the system.
System_HealthCheck response = client.system().meta().getHealth();

// Returns all available routes.
System_Route response = client.system().meta().getRoutes();

// Returns details of a specific schema.
System_Schema response = client.system().meta().getSchema("name");

// Payment webhook endpoint after successful purchase of a plan.
Common_Message response = client.system().payment().webhook("provider");
```

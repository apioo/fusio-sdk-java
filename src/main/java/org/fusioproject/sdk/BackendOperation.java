/**
 * BackendOperation automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.*;

@JsonClassDescription("This object represents an operation, an operation invokes an action in case a specific HTTP method and path was requested. It defines also schema information about the request and response payload")
public class BackendOperation {
    @JsonPropertyDescription("Unique identifier for the object")
    private Integer id;
    @JsonPropertyDescription("Status of the object either 1 = active or 0 = deleted")
    private Integer status;
    @JsonPropertyDescription("Indicates whether the operation is active")
    private Boolean active;
    @JsonPropertyDescription("Indicates whether the operation is public, if false a user must provide an Authorization header with an Bearer access token")
    private Boolean _public;
    @JsonPropertyDescription("Describes the stability of this operation 0 = deprecated, 1 = experimental, 2 = stable and 3 = legacy")
    private Integer stability;
    @JsonPropertyDescription("A short description of this operation, it should explain the operation in a simple and precise way")
    private String description;
    @JsonPropertyDescription("The target HTTP method i.e. GET or POST")
    private String httpMethod;
    @JsonPropertyDescription("The target HTTP path i.e. /foo or /product/:product_id")
    private String httpPath;
    @JsonPropertyDescription("The success HTTP code i.e. 200 or 201")
    private Integer httpCode;
    @JsonPropertyDescription("Unique name of the object. It is recommended to group your operations into logical units by using a dot i.e. product.getAll and product.insert which has also an effect on the automatically generated SDK")
    private String name;
    @JsonPropertyDescription("Describes available query parameters")
    private BackendOperationParameters parameters;
    @JsonPropertyDescription("Describes the incoming request payload, this must contain a schema name")
    private String incoming;
    @JsonPropertyDescription("Describes the outgoing response payload, this must contain a schema name")
    private String outgoing;
    @JsonPropertyDescription("Describes error responses for i.e. client or server errors")
    private BackendOperationThrows _throws;
    @JsonPropertyDescription("The target action to invoke, this must contain an action name")
    private String action;
    @JsonPropertyDescription("Costs to invoke this operation. A user can only invoke this operation in case he has enough points")
    private Integer costs;
    @JsonPropertyDescription("Scopes which are required to invoke this operation")
    private java.util.List<String> scopes;
    @JsonPropertyDescription("Use this parameter to attach key-value data")
    private CommonMetadata metadata;

    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonGetter("id")
    public Integer getId() {
        return this.id;
    }

    @JsonSetter("status")
    public void setStatus(Integer status) {
        this.status = status;
    }

    @JsonGetter("status")
    public Integer getStatus() {
        return this.status;
    }

    @JsonSetter("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    @JsonGetter("active")
    public Boolean getActive() {
        return this.active;
    }

    @JsonSetter("public")
    public void setPublic(Boolean _public) {
        this._public = _public;
    }

    @JsonGetter("public")
    public Boolean getPublic() {
        return this._public;
    }

    @JsonSetter("stability")
    public void setStability(Integer stability) {
        this.stability = stability;
    }

    @JsonGetter("stability")
    public Integer getStability() {
        return this.stability;
    }

    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonGetter("description")
    public String getDescription() {
        return this.description;
    }

    @JsonSetter("httpMethod")
    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    @JsonGetter("httpMethod")
    public String getHttpMethod() {
        return this.httpMethod;
    }

    @JsonSetter("httpPath")
    public void setHttpPath(String httpPath) {
        this.httpPath = httpPath;
    }

    @JsonGetter("httpPath")
    public String getHttpPath() {
        return this.httpPath;
    }

    @JsonSetter("httpCode")
    public void setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
    }

    @JsonGetter("httpCode")
    public Integer getHttpCode() {
        return this.httpCode;
    }

    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonGetter("name")
    public String getName() {
        return this.name;
    }

    @JsonSetter("parameters")
    public void setParameters(BackendOperationParameters parameters) {
        this.parameters = parameters;
    }

    @JsonGetter("parameters")
    public BackendOperationParameters getParameters() {
        return this.parameters;
    }

    @JsonSetter("incoming")
    public void setIncoming(String incoming) {
        this.incoming = incoming;
    }

    @JsonGetter("incoming")
    public String getIncoming() {
        return this.incoming;
    }

    @JsonSetter("outgoing")
    public void setOutgoing(String outgoing) {
        this.outgoing = outgoing;
    }

    @JsonGetter("outgoing")
    public String getOutgoing() {
        return this.outgoing;
    }

    @JsonSetter("throws")
    public void setThrows(BackendOperationThrows _throws) {
        this._throws = _throws;
    }

    @JsonGetter("throws")
    public BackendOperationThrows getThrows() {
        return this._throws;
    }

    @JsonSetter("action")
    public void setAction(String action) {
        this.action = action;
    }

    @JsonGetter("action")
    public String getAction() {
        return this.action;
    }

    @JsonSetter("costs")
    public void setCosts(Integer costs) {
        this.costs = costs;
    }

    @JsonGetter("costs")
    public Integer getCosts() {
        return this.costs;
    }

    @JsonSetter("scopes")
    public void setScopes(java.util.List<String> scopes) {
        this.scopes = scopes;
    }

    @JsonGetter("scopes")
    public java.util.List<String> getScopes() {
        return this.scopes;
    }

    @JsonSetter("metadata")
    public void setMetadata(CommonMetadata metadata) {
        this.metadata = metadata;
    }

    @JsonGetter("metadata")
    public CommonMetadata getMetadata() {
        return this.metadata;
    }
}


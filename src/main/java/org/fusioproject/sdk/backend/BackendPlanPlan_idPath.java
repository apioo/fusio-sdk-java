/**
 * BackendPlanPlan_idPath automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class BackendPlanPlan_idPath {
    private String plan_id;
    @JsonSetter("plan_id")
    public void setPlan_id(String plan_id) {
        this.plan_id = plan_id;
    }
    @JsonGetter("plan_id")
    public String getPlan_id() {
        return this.plan_id;
    }
}

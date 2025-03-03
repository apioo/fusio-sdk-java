/**
 * CommonFormElement automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.*;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = CommonFormElementInput.class, name = "http://fusio-project.org/ns/2015/form/input"),
    @JsonSubTypes.Type(value = CommonFormElementSelect.class, name = "http://fusio-project.org/ns/2015/form/select"),
    @JsonSubTypes.Type(value = CommonFormElementTag.class, name = "http://fusio-project.org/ns/2015/form/tag"),
    @JsonSubTypes.Type(value = CommonFormElementTextArea.class, name = "http://fusio-project.org/ns/2015/form/textarea"),
})
public abstract class CommonFormElement {
    private String type;
    private String element;
    private String name;
    private String title;
    private String help;

    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonGetter("type")
    public String getType() {
        return this.type;
    }

    @JsonSetter("element")
    public void setElement(String element) {
        this.element = element;
    }

    @JsonGetter("element")
    public String getElement() {
        return this.element;
    }

    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonGetter("name")
    public String getName() {
        return this.name;
    }

    @JsonSetter("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonGetter("title")
    public String getTitle() {
        return this.title;
    }

    @JsonSetter("help")
    public void setHelp(String help) {
        this.help = help;
    }

    @JsonGetter("help")
    public String getHelp() {
        return this.help;
    }
}


/**
 * BackendLogError automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;
public class BackendLogError {
    private Integer id;
    private Integer message;
    private String trace;
    private String file;
    private Integer line;
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }
    @JsonGetter("id")
    public Integer getId() {
        return this.id;
    }
    @JsonSetter("message")
    public void setMessage(Integer message) {
        this.message = message;
    }
    @JsonGetter("message")
    public Integer getMessage() {
        return this.message;
    }
    @JsonSetter("trace")
    public void setTrace(String trace) {
        this.trace = trace;
    }
    @JsonGetter("trace")
    public String getTrace() {
        return this.trace;
    }
    @JsonSetter("file")
    public void setFile(String file) {
        this.file = file;
    }
    @JsonGetter("file")
    public String getFile() {
        return this.file;
    }
    @JsonSetter("line")
    public void setLine(Integer line) {
        this.line = line;
    }
    @JsonGetter("line")
    public Integer getLine() {
        return this.line;
    }
}

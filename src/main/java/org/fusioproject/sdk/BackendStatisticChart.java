/**
 * BackendStatisticChart automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.*;

public class BackendStatisticChart {
    private java.util.List<String> labels;
    private java.util.List<BackendStatisticChartData> data;
    private java.util.List<String> series;

    @JsonSetter("labels")
    public void setLabels(java.util.List<String> labels) {
        this.labels = labels;
    }

    @JsonGetter("labels")
    public java.util.List<String> getLabels() {
        return this.labels;
    }

    @JsonSetter("data")
    public void setData(java.util.List<BackendStatisticChartData> data) {
        this.data = data;
    }

    @JsonGetter("data")
    public java.util.List<BackendStatisticChartData> getData() {
        return this.data;
    }

    @JsonSetter("series")
    public void setSeries(java.util.List<String> series) {
        this.series = series;
    }

    @JsonGetter("series")
    public java.util.List<String> getSeries() {
        return this.series;
    }
}


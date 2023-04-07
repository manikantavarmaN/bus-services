package com.bus.busservices.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ResultLine{
    @JsonProperty("LineNumber")
    public String lineNumber;
    @JsonProperty("LineDesignation")
    public String lineDesignation;
    @JsonProperty("DefaultTransportMode")
    public String defaultTransportMode;
    @JsonProperty("DefaultTransportModeCode")
    public String defaultTransportModeCode;
    @JsonProperty("LastModifiedUtcDateTime")
    public String lastModifiedUtcDateTime;
    @JsonProperty("ExistsFromDate")
    public String existsFromDate;
}

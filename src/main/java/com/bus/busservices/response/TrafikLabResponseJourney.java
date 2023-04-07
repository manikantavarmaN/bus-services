package com.bus.busservices.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TrafikLabResponseJourney extends ApiRootResponse{

    @JsonProperty("StatusCode")
    public int statusCode;
    @JsonProperty("Message")
    public Object message;
    @JsonProperty("ExecutionTime")
    public int executionTime;
    @JsonProperty("ResponseData")
    public ResponseDataJourney responseData;
}
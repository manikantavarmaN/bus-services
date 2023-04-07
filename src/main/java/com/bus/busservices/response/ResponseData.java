package com.bus.busservices.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class ResponseData {
    @JsonProperty("Version")
    public String version;
    @JsonProperty("Type")
    public String type;
    @JsonProperty("Result")
    public List<Result> result;

}

package com.bus.busservices.response;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Result{
    @JsonProperty("StopPointNumber")
    public String stopPointNumber;
    @JsonProperty("StopPointName")
    public String stopPointName;
    @JsonProperty("StopAreaNumber")
    public String stopAreaNumber;
    @JsonProperty("LocationNorthingCoordinate")
    public String locationNorthingCoordinate;
    @JsonProperty("LocationEastingCoordinate")
    public String locationEastingCoordinate;
    @JsonProperty("ZoneShortName")
    public String zoneShortName;
    @JsonProperty("StopAreaTypeCode")
    public String stopAreaTypeCode;
    @JsonProperty("LastModifiedUtcDateTime")
    public String lastModifiedUtcDateTime;
    @JsonProperty("ExistsFromDate")
    public String existsFromDate;





}

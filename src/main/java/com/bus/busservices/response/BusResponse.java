package com.bus.busservices.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BusResponse {
    private String busLineName;
    private Collection<String> busStopNames;
}

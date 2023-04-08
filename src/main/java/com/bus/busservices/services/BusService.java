package com.bus.busservices.services;

import com.bus.busservices.response.BusResponse;
import com.bus.busservices.response.TrafikLabResponse;

import java.util.List;

public interface BusService {
    TrafikLabResponse getBusService(String modelType);

    List<BusResponse> getBusService();
}

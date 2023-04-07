package com.bus.busservices.services;

import com.bus.busservices.response.TrafikLabResponse;

public interface BusService {
    TrafikLabResponse getBusService(String modelType);

    String getBusService();
}

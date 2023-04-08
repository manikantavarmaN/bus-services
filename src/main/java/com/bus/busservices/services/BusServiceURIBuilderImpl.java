package com.bus.busservices.services;

import com.bus.busservices.exception.InvalidBusTypeException;
import com.bus.busservices.utils.BusModelType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import static com.bus.busservices.utils.BusModelType.*;

@Service
@Slf4j
public class BusServiceURIBuilderImpl implements BusServiceURIBuilder {
    @Override
    public UriComponents buildUri(String baseUrl, String key, BusModelType busModelType, String busMode) {
        log.info("key = {}",key);
        if (LINE.getModel().equals(busModelType.getModel())) {
            return UriComponentsBuilder.fromHttpUrl(baseUrl)
                    .queryParam("model", busModelType.getModel())
                    .queryParam("key", key)
                    .queryParam("DefaultTransportModeCode", busMode)
                    .build();
        }else if (STOP_POINT.getModel().equals(busModelType.getModel())) {
            return UriComponentsBuilder.fromHttpUrl(baseUrl)
                    .queryParam("model", busModelType.getModel())
                    .queryParam("key", key)
                    .queryParam("DefaultTransportModeCode", busMode)
                    .build();
        }
        else if (JOURNEY_PATTERN_POINT_ONLINE.getModel().equals(busModelType.getModel())) {
            return UriComponentsBuilder.fromHttpUrl(baseUrl)
                    .queryParam("model", busModelType.getModel())
                    .queryParam("key", key)
                    .build();
        } else {
            return UriComponentsBuilder.fromHttpUrl(baseUrl)
                    .queryParam("model",busModelType.getModel())
                    .queryParam("key",key)
                    .build();
        }
    }

    @Override
    public UriComponents buildUri(String baseUrl, String key, String busMode) {
        return null;
    }
}

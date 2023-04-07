package com.bus.busservices.services;

import com.bus.busservices.utils.BusModelType;
import org.springframework.web.util.UriComponents;

public interface BusServiceURIBuilder {
	UriComponents buildUri(String baseUrl, String key, BusModelType busModelType, String busMode);
	UriComponents buildUri(String baseUrl, String key, String busMode);

}
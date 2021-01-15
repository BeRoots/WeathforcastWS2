package com.sebastien_deschamps.WeatherforcastWS2.entities;

import java.util.Date;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface Weather {
	@WebMethod
	public String endpointName();

	@WebMethod
	public String getWeatherRecords(String location);

	@WebMethod
	public String getDailyWeatherRecord(String location, Date date);
}

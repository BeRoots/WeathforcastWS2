package com.sebastien_deschamps.WeatherforcastWS2;

import java.util.Date;

import jakarta.jws.WebMethod;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.ParameterStyle;
import jakarta.jws.soap.SOAPBinding.Style;
import jakarta.jws.soap.SOAPBinding.Use;

@WebService(serviceName="weather", endpointInterface="com.sebastien_deschamps.WeatherforcastWS.Weather")
@SOAPBinding(style=Style.DOCUMENT, use=Use.LITERAL, parameterStyle=ParameterStyle.BARE)
public class WeatherImpl implements Weather
{
	@WebMethod(operationName="endpointName")
	@WebResult(name="epName")
    public String endpointName()
    {
        return "DailyMeteo";
    }

	@Override
	public String getWeatherRecords(String location) {
		return "null";
	}

	@Override
	public String getDailyWeatherRecord(String location, Date date) {
		return "null";
	}
}

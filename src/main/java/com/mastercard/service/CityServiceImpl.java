package com.mastercard.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mastercard.model.City;

/**
 * @author JAI MATA DI
 *
 */
@Service
public class CityServiceImpl implements ICityService {
	private static final Logger logger = LoggerFactory.getLogger(CityServiceImpl.class);
	public boolean connectedCityFlag = false;
	private static List<City> cities;
	static {
		cities = dummyCities();
	}

	private static List<City> dummyCities() {
		List<City> cities = new ArrayList<City>();
		cities.add(new City(14221, "Boston", "US"));
		cities.add(new City(14222, "Newark", "US"));
		cities.add(new City(14223, "Philadelphia", "US"));
		cities.add(new City(14224, "Albany", "US"));
		cities.add(new City(14224, "NewYork", "US"));
		return cities;
	}

	public boolean getConnectedCity(String origin, String destination) {
		if (("Boston".equals(origin) && "Newark".equals(destination))
				|| ("Boston".equals(origin) && "Philadelphia".equals(destination))
				|| ("NewYork".equals(origin) && "Newark".equals(destination))) {
			connectedCityFlag = true;
		} else if ("Philadelphia".equals(origin) && "Albany".equals(destination)) {
			connectedCityFlag = false;
		}
		return connectedCityFlag;
	}
}

package com.mastercard.endpoint;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mastercard.service.ICityService;

/**
 * @author JAI MATA DI
 *
 */
@Component
@Path("/connected")
public class CityEndpoint {
	private static final Logger logger = LoggerFactory.getLogger(CityEndpoint.class);
	@Autowired
	private ICityService articleService;

	@GET
	@Produces("text/html")
	public Response getResultByPassingValue(@QueryParam("origin") String originVal,
			@QueryParam("destination") String destinationVal) {
		boolean connectedcity = articleService.getConnectedCity(originVal, destinationVal);
		logger.info("called the service");
		String output;
		if (connectedcity) {
			output = "Yes";
		} else {
			output = "No";
		}
		return Response.status(200).entity(output).build();
	}
}
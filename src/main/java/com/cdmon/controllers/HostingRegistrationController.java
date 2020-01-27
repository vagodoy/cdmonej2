/**
 * 
 */
package com.cdmon.controllers;

/**
 * @author Alex
 *
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cdmon.beans.Hosting;
import com.cdmon.beans.HostingRegistration;

@Controller
public class HostingRegistrationController {

	@RequestMapping(method = RequestMethod.POST, value = "/register/hosting")
	@ResponseBody
	public Hosting registerHosting(@RequestBody Hosting hosting) {
		System.out.println("In registerHosting");
		Hosting hostingr = new Hosting();
		HostingRegistration.getInstance().add(hosting);
		// We are setting the below value just to reply a message back to the caller
		
		hostingr.setId(hosting.getId());
		hostingr.setCores(hosting.getCores());
		hostingr.setDisco(hosting.getDisco());
		hostingr.setMemoria(hosting.getMemoria());
		hostingr.setNombre(hosting.getNombre());
		
		return hostingr;
	}
}

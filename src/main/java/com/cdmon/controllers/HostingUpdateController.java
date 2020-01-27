/**
 * 
 */
package com.cdmon.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cdmon.beans.Hosting;
import com.cdmon.beans.HostingRegistration;


/**
 * @author Alex
 *
 */
@Controller
public class HostingUpdateController {
	@RequestMapping(method = RequestMethod.PUT, value = "/update/hosting")
	@ResponseBody
	public String updateStudentRecord(@RequestBody Hosting hosting) {
		System.out.println("In updateHostingRecord");
		return HostingRegistration.getInstance().upDateHosting(hosting);
	}
}

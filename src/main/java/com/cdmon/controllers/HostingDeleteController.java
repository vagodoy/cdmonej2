/**
 * 
 */
package com.cdmon.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.cdmon.beans.HostingRegistration;

import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Alex
 *
 */
@Controller
public class HostingDeleteController {
	@RequestMapping(method = RequestMethod.DELETE, value = "/delete/hosting/{id}")
	@ResponseBody
	public String deleteStudentRecord(@PathVariable("id") Long id) {
		System.out.println("In deleteHostingRecord");
		return HostingRegistration.getInstance().deleteHosting(id);
	}
}

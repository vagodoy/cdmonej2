/**
 * 
 */
package com.cdmon.controllers;

import java.util.List;
import org.springframework.stereotype.Controller;
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
public class HostingRetrieveController {
	@RequestMapping(method = RequestMethod.GET, value = "/hosting/allhostings")
	@ResponseBody
	public List<Hosting> getAllHostings() {
		return HostingRegistration.getInstance().getHostingRecords();
	}
}

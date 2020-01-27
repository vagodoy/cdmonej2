/**
 * 
 */
package com.cdmon.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alex
 *
 *         Data repository sigleton
 * 
 */
public class HostingRegistration {

	private List<Hosting> hostingRecords;
	private static HostingRegistration hstngregd = null;

	/**
	 * Constructor
	 */
	private HostingRegistration() {
		// Initialize data respository
		hostingRecords = new ArrayList<Hosting>();
	}

	/**
	 * Get instance of singleton
	 */
	public static HostingRegistration getInstance() {
		if (hstngregd == null) {
			hstngregd = new HostingRegistration();
			return hstngregd;
		} else {
			return hstngregd;
		}
	}

	/**
	 * Add hosting received to list of hostings
	 * 
	 * @param hosting
	 */
	public void add(Hosting hosting) {
		hostingRecords.add(hosting);
	}

	/**
	 * UpDate data of hosting received searching by hosting ID
	 * 
	 * @param hosting
	 * 
	 * @return success of operation in string format
	 */
	public String upDateHosting(Hosting hosting) {
		for (int i = 0; i < hostingRecords.size(); i++) {
			Hosting hostingn = hostingRecords.get(i);
			if (hostingn.getId().equals(hosting.getId())) {
				hostingRecords.set(i, hosting);// update the new record
				return "Update successful";
			}
		}
		return "Update un-successful";
	}

	/**
	 * Delete hosting received with hosting ID
	 * 
	 * @param id
	 * 
	 * @return success of operation in string format
	 * 
	 */
	public String deleteHosting(Long id) {
		for (int i = 0; i < hostingRecords.size(); i++) {
			Hosting hosting = hostingRecords.get(i);
			if (hosting.getId().equals(id)) {
				hostingRecords.remove(i);// update the new record
				return "Delete successful";
			}
		}
		return "Delete un-successful";
	}

	/**
	 * 
	 * @return list of hostings
	 * 
	 */
	public List<Hosting> getHostingRecords() {
		return hostingRecords;
	}
}

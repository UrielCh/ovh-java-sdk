package net.minidev.ovh.core;

import java.util.HashMap;
import java.util.Map;

public class OvhEntryPoint {
	private final static Map<String, String> endpoints;

	static {
		endpoints = new HashMap<String, String>();
		endpoints.put("ovh-eu", "https://eu.api.ovh.com/1.0");
		endpoints.put("ovh-ca", "https://ca.api.ovh.com/1.0");
		endpoints.put("kimsufi-eu", "https://eu.api.kimsufi.com/1.0");
		endpoints.put("kimsufi-ca", "https://ca.api.kimsufi.com/1.0");
		endpoints.put("soyoustart-eu", "https://eu.api.soyoustart.com/1.0");
		endpoints.put("soyoustart-ca", "https://ca.api.soyoustart.com/1.0");
		endpoints.put("runabove", "https://api.runabove.com/1.0");
		endpoints.put("runabove-ca", "https://api.runabove.com/1.0");
	}
}
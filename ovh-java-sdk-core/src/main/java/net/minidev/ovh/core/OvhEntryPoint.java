package net.minidev.ovh.core;

import java.util.HashMap;
import java.util.Map;

public class OvhEntryPoint {
	private final static Map<String, String> endpoints;
	public final static String OVH_EU = "https://eu.api.ovh.com/1.0";
	public final static String OVH_CA = "https://ca.api.ovh.com/1.0";
	public final static String KS_EU = "https://eu.api.kimsufi.com/1.0";
	public final static String KS_CA = "https://ca.api.kimsufi.com/1.0";
	public final static String SO_EU = "https://eu.api.soyoustart.com/1.0";
	public final static String SO_CA = "https://ca.api.soyoustart.com/1.0";
	public final static String RA_EU = "https://api.runabove.com/1.0";
	public final static String RA_CA = "https://api.runabove.com/1.0";

	static {
		endpoints = new HashMap<String, String>();
		endpoints.put("ovh-eu", OVH_EU);
		endpoints.put("ovh-ca", OVH_CA);
		endpoints.put("kimsufi-eu", KS_EU);
		endpoints.put("kimsufi-ca", KS_CA);
		endpoints.put("soyoustart-eu", SO_EU);
		endpoints.put("soyoustart-ca", SO_CA);
		endpoints.put("runabove", RA_EU);
		endpoints.put("runabove-ca", RA_CA);
	}
}
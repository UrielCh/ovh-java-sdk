package net.minidev.ovh.core;

import java.io.IOException;

public class OvhServiceException extends IOException {
	private static final long serialVersionUID = 1L;
	public final String service;
	public final String message;
	
	public OvhServiceException(String service, String message) {
		super("Service " + service + ": This service is expired");
		this.service = service;
		this.message = message;
	}
	
	public boolean isExpired() {
		return "This service is expired".equalsIgnoreCase(message);
	}
	
	public boolean isNonExists() {
		if ("This service does not exist".equals(message))
			return true;
		if (message.startsWith("The requested object"))
			return true;
		return false;
	}	
}
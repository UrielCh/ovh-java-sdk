package net.minidev.ovh.api.auth;

/**
 * All HTTP methods available
 */
public enum OvhMethodEnum {
	DELETE("DELETE"),
	GET("GET"),
	POST("POST"),
	PUT("PUT");

	final String value;

	OvhMethodEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

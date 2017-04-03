package net.minidev.ovh.api.hosting.web.ovhconfig;

/**
 * Hosting configuration engine
 */
public enum OvhEngineNameEnum {
	php("php"),
	phpcgi("phpcgi");

	final String value;

	OvhEngineNameEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

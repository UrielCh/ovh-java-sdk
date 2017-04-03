package net.minidev.ovh.api.dbaaslogs;

/**
 * Possible values for EngineName
 */
public enum OvhEngineName {
	FLOWGGER("FLOWGGER"),
	LOGSTASH("LOGSTASH");

	final String value;

	OvhEngineName(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

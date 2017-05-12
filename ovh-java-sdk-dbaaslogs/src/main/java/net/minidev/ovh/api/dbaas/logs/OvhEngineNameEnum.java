package net.minidev.ovh.api.dbaas.logs;

/**
 * Possible values for EngineNameEnum
 */
public enum OvhEngineNameEnum {
	FLOWGGER("FLOWGGER"),
	LOGSTASH("LOGSTASH"),
	TEST("TEST");

	final String value;

	OvhEngineNameEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

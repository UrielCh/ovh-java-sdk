package net.minidev.ovh.api.kube;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Description not available
 */
public enum OvhVersion {
	@JsonProperty("1.11")
	_1_11("1.11"),
	@JsonProperty("1.12")
	_1_12("1.12");

	final String value;

	OvhVersion(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

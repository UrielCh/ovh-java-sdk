package net.minidev.ovh.api.hosting.web.backup;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * List of backup types
 */
public enum OvhTypeEnum {
	@JsonProperty("daily.1")
	daily_1("daily.1"),
	@JsonProperty("daily.2")
	daily_2("daily.2"),
	@JsonProperty("daily.3")
	daily_3("daily.3"),
	@JsonProperty("weekly.1")
	weekly_1("weekly.1"),
	@JsonProperty("weekly.2")
	weekly_2("weekly.2");

	final String value;

	OvhTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

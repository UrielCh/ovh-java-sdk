package net.minidev.ovh.api.hosting.web.database.dump;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * List of dump types
 */
public enum OvhDateEnum {
	@JsonProperty("daily.1")
	daily_1("daily.1"),
	now("now"),
	@JsonProperty("weekly.1")
	weekly_1("weekly.1");

	final String value;

	OvhDateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

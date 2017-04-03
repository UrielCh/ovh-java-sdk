package net.minidev.ovh.api.dedicated.storage;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Partition snapshot allowed 
 */
public enum OvhSnapshotEnum {
	@JsonProperty("day-1")
	day_1("day-1"),
	@JsonProperty("day-2")
	day_2("day-2"),
	@JsonProperty("day-3")
	day_3("day-3"),
	@JsonProperty("day-7")
	day_7("day-7"),
	@JsonProperty("hour-1")
	hour_1("hour-1"),
	@JsonProperty("hour-6")
	hour_6("hour-6");

	final String value;

	OvhSnapshotEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

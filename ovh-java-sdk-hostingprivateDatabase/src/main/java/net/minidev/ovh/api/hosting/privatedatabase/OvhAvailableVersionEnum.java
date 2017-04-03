package net.minidev.ovh.api.hosting.privatedatabase;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Private database available versions
 */
public enum OvhAvailableVersionEnum {
	@JsonProperty("mysql_4.1")
	mysql_4_1("mysql_4.1"),
	@JsonProperty("mysql_5.0")
	mysql_5_0("mysql_5.0"),
	@JsonProperty("mysql_5.1")
	mysql_5_1("mysql_5.1"),
	@JsonProperty("mysql_5.5")
	mysql_5_5("mysql_5.5"),
	@JsonProperty("mysql_5.6")
	mysql_5_6("mysql_5.6"),
	@JsonProperty("mysql_5.7")
	mysql_5_7("mysql_5.7"),
	@JsonProperty("postgresql_9.4")
	postgresql_9_4("postgresql_9.4"),
	@JsonProperty("postgresql_9.5")
	postgresql_9_5("postgresql_9.5"),
	@JsonProperty("postgresql_9.6")
	postgresql_9_6("postgresql_9.6");

	final String value;

	OvhAvailableVersionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

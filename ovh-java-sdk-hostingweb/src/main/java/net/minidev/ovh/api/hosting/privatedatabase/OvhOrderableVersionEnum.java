package net.minidev.ovh.api.hosting.privatedatabase;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Private database orderable versions
 */
public enum OvhOrderableVersionEnum {
	@JsonProperty("mariadb_10.1")
	mariadb_10_1("mariadb_10.1"),
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
	postgresql_9_6("postgresql_9.6"),
	@JsonProperty("redis_3.2")
	redis_3_2("redis_3.2");

	final String value;

	OvhOrderableVersionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

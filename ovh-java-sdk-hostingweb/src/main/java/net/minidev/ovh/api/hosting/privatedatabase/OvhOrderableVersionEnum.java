package net.minidev.ovh.api.hosting.privatedatabase;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Private database orderable versions
 */
public enum OvhOrderableVersionEnum {
	@JsonProperty("mariadb_10.1")
	mariadb_10_1("mariadb_10.1"),
	@JsonProperty("mariadb_10.2")
	mariadb_10_2("mariadb_10.2"),
	@JsonProperty("mongodb_3.4")
	mongodb_3_4("mongodb_3.4"),
	@JsonProperty("mongodb_4.0")
	mongodb_4_0("mongodb_4.0"),
	@JsonProperty("mysql_5.5")
	mysql_5_5("mysql_5.5"),
	@JsonProperty("mysql_5.6")
	mysql_5_6("mysql_5.6"),
	@JsonProperty("mysql_5.7")
	mysql_5_7("mysql_5.7"),
	postgresql_10("postgresql_10"),
	@JsonProperty("postgresql_9.4")
	postgresql_9_4("postgresql_9.4"),
	@JsonProperty("postgresql_9.5")
	postgresql_9_5("postgresql_9.5"),
	@JsonProperty("postgresql_9.6")
	postgresql_9_6("postgresql_9.6"),
	@JsonProperty("redis_3.2")
	redis_3_2("redis_3.2"),
	@JsonProperty("redis_4.0")
	redis_4_0("redis_4.0");

	final String value;

	OvhOrderableVersionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

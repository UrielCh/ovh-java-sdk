package net.minidev.ovh.api.price.hosting;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Enum of PrivateDatabases
 */
public enum OvhPrivateDatabaseEnum {
	@JsonProperty("mysql_4.1_1024")
	mysql_4_1_1024("mysql_4.1_1024"),
	@JsonProperty("mysql_4.1_128")
	mysql_4_1_128("mysql_4.1_128"),
	@JsonProperty("mysql_4.1_256")
	mysql_4_1_256("mysql_4.1_256"),
	@JsonProperty("mysql_4.1_512")
	mysql_4_1_512("mysql_4.1_512"),
	@JsonProperty("mysql_5.0_1024")
	mysql_5_0_1024("mysql_5.0_1024"),
	@JsonProperty("mysql_5.0_128")
	mysql_5_0_128("mysql_5.0_128"),
	@JsonProperty("mysql_5.0_256")
	mysql_5_0_256("mysql_5.0_256"),
	@JsonProperty("mysql_5.0_512")
	mysql_5_0_512("mysql_5.0_512"),
	@JsonProperty("mysql_5.1_1024")
	mysql_5_1_1024("mysql_5.1_1024"),
	@JsonProperty("mysql_5.1_128")
	mysql_5_1_128("mysql_5.1_128"),
	@JsonProperty("mysql_5.1_256")
	mysql_5_1_256("mysql_5.1_256"),
	@JsonProperty("mysql_5.1_512")
	mysql_5_1_512("mysql_5.1_512"),
	@JsonProperty("mysql_5.5_1024")
	mysql_5_5_1024("mysql_5.5_1024"),
	@JsonProperty("mysql_5.5_128")
	mysql_5_5_128("mysql_5.5_128"),
	@JsonProperty("mysql_5.5_256")
	mysql_5_5_256("mysql_5.5_256"),
	@JsonProperty("mysql_5.5_512")
	mysql_5_5_512("mysql_5.5_512");

	final String value;

	OvhPrivateDatabaseEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

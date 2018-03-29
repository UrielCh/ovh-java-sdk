package net.minidev.ovh.api.xdsl.antispam;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AntiSpam status
 */
public enum OvhAntiSpamStatusEnum {
	block("block"),
	done("done"),
	@JsonProperty("new")
	_new("new"),
	unblock("unblock"),
	warn("warn");

	final String value;

	OvhAntiSpamStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

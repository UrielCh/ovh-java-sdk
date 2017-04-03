package net.minidev.ovh.api.hosting.web.ovhconfig;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Hosting configuration image to run website
 */
public enum OvhContainerEnum {
	@JsonProperty("jessie.i386")
	jessie_i386("jessie.i386"),
	legacy("legacy"),
	stable("stable"),
	testing("testing");

	final String value;

	OvhContainerEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

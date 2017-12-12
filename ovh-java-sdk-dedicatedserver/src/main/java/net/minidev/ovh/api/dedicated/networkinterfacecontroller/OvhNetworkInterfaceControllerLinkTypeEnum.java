package net.minidev.ovh.api.dedicated.networkinterfacecontroller;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * List NetworkInterfaceController linktype
 */
public enum OvhNetworkInterfaceControllerLinkTypeEnum {
	@JsonProperty("private")
	_private("private"),
	@JsonProperty("public")
	_public("public");

	final String value;

	OvhNetworkInterfaceControllerLinkTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

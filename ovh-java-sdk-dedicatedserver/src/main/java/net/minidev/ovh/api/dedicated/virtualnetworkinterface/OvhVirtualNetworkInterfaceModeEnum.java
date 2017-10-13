package net.minidev.ovh.api.dedicated.virtualnetworkinterface;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Available VirtualNetworkInterface modes
 */
public enum OvhVirtualNetworkInterfaceModeEnum {
	@JsonProperty("public")
	_public("public"),
	vrack("vrack");

	final String value;

	OvhVirtualNetworkInterfaceModeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

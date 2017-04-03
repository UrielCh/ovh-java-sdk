package net.minidev.ovh.api.xdsl.xdslmodemconfig;

/**
 * How the WiFi channel is selected
 */
public enum OvhChannelModeEnum {
	Auto("Auto"),
	Manual("Manual");

	final String value;

	OvhChannelModeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

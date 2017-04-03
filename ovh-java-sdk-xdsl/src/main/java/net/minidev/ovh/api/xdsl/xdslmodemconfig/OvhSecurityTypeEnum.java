package net.minidev.ovh.api.xdsl.xdslmodemconfig;

/**
 * Type of WLAN security protection
 */
public enum OvhSecurityTypeEnum {
	None("None"),
	WEP("WEP"),
	WPA("WPA"),
	WPA2("WPA2"),
	WPAandWPA2("WPAandWPA2");

	final String value;

	OvhSecurityTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

package net.minidev.ovh.api.email.exchange;

/**
 * Outlook version
 */
public enum OvhOutlookVersionEnum {
	mac_x86_2011("mac_x86_2011"),
	mac_x86_2016("mac_x86_2016"),
	windows_x64_2013("windows_x64_2013"),
	windows_x64_2016("windows_x64_2016"),
	windows_x86_2013("windows_x86_2013"),
	windows_x86_2016("windows_x86_2016");

	final String value;

	OvhOutlookVersionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

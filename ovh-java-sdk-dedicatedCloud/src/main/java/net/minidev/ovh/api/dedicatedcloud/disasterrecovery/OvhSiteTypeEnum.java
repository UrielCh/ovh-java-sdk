package net.minidev.ovh.api.dedicatedcloud.disasterrecovery;

/**
 * Site manager hosting type
 */
public enum OvhSiteTypeEnum {
	onPremise("onPremise"),
	ovhPrivateCloud("ovhPrivateCloud");

	final String value;

	OvhSiteTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

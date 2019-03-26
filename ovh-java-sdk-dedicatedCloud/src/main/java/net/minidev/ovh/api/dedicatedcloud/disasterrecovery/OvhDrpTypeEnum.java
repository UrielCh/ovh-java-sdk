package net.minidev.ovh.api.dedicatedcloud.disasterrecovery;

/**
 * Disaster Recovery Plan Types
 */
public enum OvhDrpTypeEnum {
	onPremise("onPremise"),
	ovh("ovh");

	final String value;

	OvhDrpTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

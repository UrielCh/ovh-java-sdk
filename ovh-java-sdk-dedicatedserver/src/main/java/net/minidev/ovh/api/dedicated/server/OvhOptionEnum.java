package net.minidev.ovh.api.dedicated.server;

/**
 * All options a dedicated server can have and release
 */
public enum OvhOptionEnum {
	BACKUPPROTOCOL("BACKUPPROTOCOL"),
	BANDWIDTH("BANDWIDTH"),
	BANDWIDTH_VRACK("BANDWIDTH_VRACK"),
	TUNING("TUNING"),
	TUNING_FIREWALL("TUNING_FIREWALL"),
	TUNING_KVM("TUNING_KVM"),
	USB_KVM_IP("USB_KVM_IP");

	final String value;

	OvhOptionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

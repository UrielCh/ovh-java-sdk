package net.minidev.ovh.api.email.exchange;

/**
 * Device ActiveSync state
 */
public enum OvhDeviceActiveSyncStateEnum {
	allowed("allowed"),
	blocked("blocked"),
	deviceDiscovery("deviceDiscovery"),
	quarantined("quarantined");

	final String value;

	OvhDeviceActiveSyncStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

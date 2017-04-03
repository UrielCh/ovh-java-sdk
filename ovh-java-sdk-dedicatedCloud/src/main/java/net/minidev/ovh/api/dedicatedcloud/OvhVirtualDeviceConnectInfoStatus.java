package net.minidev.ovh.api.dedicatedcloud;

/**
 * The connectable virtual device status
 */
public enum OvhVirtualDeviceConnectInfoStatus {
	ok("ok"),
	recoverableError("recoverableError"),
	unrecoverableError("unrecoverableError"),
	untried("untried");

	final String value;

	OvhVirtualDeviceConnectInfoStatus(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

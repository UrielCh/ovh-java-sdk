package net.minidev.ovh.api.iploadbalancing;

/**
 * Possible values for load balancing vRack state
 */
public enum OvhVrackStateEnum {
	activating("activating"),
	active("active"),
	deactivating("deactivating"),
	inactive("inactive");

	final String value;

	OvhVrackStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

package net.minidev.ovh.api.dedicatedcloud;

/**
 * The power state of the virtual machine
 */
public enum OvhVirtualMachinePowerState {
	deleted("deleted"),
	poweredOff("poweredOff"),
	poweredOn("poweredOn"),
	suspended("suspended");

	final String value;

	OvhVirtualMachinePowerState(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

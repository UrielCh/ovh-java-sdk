package net.minidev.ovh.api.dedicatedcloud;

/**
 * The fault tolerance state of the virtual machine
 */
public enum OvhVirtualMachineFaultToleranceState {
	disabled("disabled"),
	enabled("enabled"),
	needSecondary("needSecondary"),
	notConfigured("notConfigured"),
	running("running"),
	starting("starting");

	final String value;

	OvhVirtualMachineFaultToleranceState(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

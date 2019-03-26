package net.minidev.ovh.api.dedicatedcloud;

/**
 * All states a Dedicated Cloud can be in
 */
public enum OvhStateEnum {
	available("available"),
	delivered("delivered"),
	disabled("disabled"),
	disabling("disabling"),
	error("error"),
	migrating("migrating"),
	provisionning("provisionning"),
	recycling("recycling"),
	reserved("reserved"),
	toDisable("toDisable"),
	toProvision("toProvision"),
	toRecycle("toRecycle"),
	toUnprovision("toUnprovision"),
	unprovisionning("unprovisionning");

	final String value;

	OvhStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

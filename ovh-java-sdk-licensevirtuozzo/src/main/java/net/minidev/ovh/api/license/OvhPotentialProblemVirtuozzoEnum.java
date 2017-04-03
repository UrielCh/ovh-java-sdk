package net.minidev.ovh.api.license;

/**
 * Tests that have failed for Virtuozzo products
 */
public enum OvhPotentialProblemVirtuozzoEnum {
	isLinuxOs("isLinuxOs"),
	isOsVirtuozzo4Like("isOsVirtuozzo4Like"),
	isWindowsOs("isWindowsOs");

	final String value;

	OvhPotentialProblemVirtuozzoEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

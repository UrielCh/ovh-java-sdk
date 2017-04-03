package net.minidev.ovh.api.dedicatedcloud.ressources;

/**
 * The available billing type upgrade for Dedicated Cloud ressource
 */
public enum OvhUpgradeTypeEnum {
	demoToMonthly("demoToMonthly"),
	freeSpareToHourly("freeSpareToHourly"),
	hourlyToMonthly("hourlyToMonthly");

	final String value;

	OvhUpgradeTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

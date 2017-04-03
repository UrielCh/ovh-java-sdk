package net.minidev.ovh.api.dedicatedcloud.ressources;

/**
 * The billing type of this Dedicated Cloud ressource
 */
public enum OvhBillingTypeEnum {
	freeSpare("freeSpare"),
	hourly("hourly"),
	monthly("monthly"),
	undefined("undefined");

	final String value;

	OvhBillingTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

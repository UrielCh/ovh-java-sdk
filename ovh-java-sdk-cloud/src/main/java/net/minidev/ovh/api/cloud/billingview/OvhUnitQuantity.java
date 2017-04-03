package net.minidev.ovh.api.cloud.billingview;

/**
 * UnitQuantity
 */
public enum OvhUnitQuantity {
	GiB("GiB"),
	GiBh("GiBh"),
	Hour("Hour");

	final String value;

	OvhUnitQuantity(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

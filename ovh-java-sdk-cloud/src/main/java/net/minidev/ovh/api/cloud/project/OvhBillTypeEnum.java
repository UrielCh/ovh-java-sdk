package net.minidev.ovh.api.cloud.project;

/**
 * Possible values for bill type
 */
public enum OvhBillTypeEnum {
	creditPurchased("creditPurchased"),
	monthlyConsumption("monthlyConsumption"),
	monthlyInstanceActivation("monthlyInstanceActivation");

	final String value;

	OvhBillTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

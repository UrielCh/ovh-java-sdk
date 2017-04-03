package net.minidev.ovh.api.price.vps.lowlat;

/**
 * Enum of Models
 */
public enum OvhModelEnum {
	model1("model1"),
	model2("model2"),
	model3("model3");

	final String value;

	OvhModelEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

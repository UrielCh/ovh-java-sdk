package net.minidev.ovh.api.price.vps._2017v1.ssd;

/**
 * Enum of Models
 */
public enum OvhModelEnum {
	model1("model1"),
	model2("model2"),
	model3("model3"),
	model4("model4");

	final String value;

	OvhModelEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

package net.minidev.ovh.api.cloud.order;

/**
 * StatusEnum
 */
public enum OvhStatusEnum {
	unpaid("unpaid"),
	delivering("delivering"),
	delivered("delivered"),
	unknown("unknown");

	final String value;

	OvhStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

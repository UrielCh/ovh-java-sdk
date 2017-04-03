package net.minidev.ovh.api.billing.order;

/**
 * All possible order status
 */
public enum OvhOrderStatusEnum {
	cancelled("cancelled"),
	cancelling("cancelling"),
	checking("checking"),
	delivered("delivered"),
	delivering("delivering"),
	documentsRequested("documentsRequested"),
	notPaid("notPaid"),
	unknown("unknown");

	final String value;

	OvhOrderStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

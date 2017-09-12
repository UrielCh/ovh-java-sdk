package net.minidev.ovh.api.billing.order;

/**
 * Retraction reason type
 */
public enum OvhRetractionReasonEnum {
	competitor("competitor"),
	difficulty("difficulty"),
	expensive("expensive"),
	other("other"),
	performance("performance"),
	reliability("reliability"),
	unused("unused");

	final String value;

	OvhRetractionReasonEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

package net.minidev.ovh.api.service.renew;

/**
 * Interval enum information
 */
public enum OvhInterval {
	P1M("P1M"),
	P1Y("P1Y"),
	P2Y("P2Y"),
	P3M("P3M"),
	P3Y("P3Y"),
	P6M("P6M");

	final String value;

	OvhInterval(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

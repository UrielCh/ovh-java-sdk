package net.minidev.ovh.api.email.exchange;

/**
 * Renew period
 */
public enum OvhRenewPeriodEnum {
	monthly("monthly"),
	yearly("yearly");

	final String value;

	OvhRenewPeriodEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

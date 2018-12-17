package net.minidev.ovh.api.connectivity.eligibility;

/**
 * Portability type
 */
public enum OvhPortabilityTypeEnum {
	portin("portin"),
	portinback("portinback"),
	portout("portout"),
	subsequent("subsequent"),
	subsquentportin("subsquentportin");

	final String value;

	OvhPortabilityTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

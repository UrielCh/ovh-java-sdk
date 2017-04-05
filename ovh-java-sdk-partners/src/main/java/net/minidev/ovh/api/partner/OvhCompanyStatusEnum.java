package net.minidev.ovh.api.partner;

/**
 * Possible choices for companyStatusEnum
 */
public enum OvhCompanyStatusEnum {
	draft("draft"),
	submitted("submitted"),
	validated("validated"),
	rejected("rejected");

	final String value;

	OvhCompanyStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

package net.minidev.ovh.api.hosting.web.localseo;

/**
 * Sync status of a listing
 */
public enum OvhListingStatusEnum {
	IN_SYNC("IN_SYNC"),
	NOT_FOUND("NOT_FOUND"),
	NOT_IN_SYNC("NOT_IN_SYNC"),
	NOT_SUPPORTED("NOT_SUPPORTED"),
	NO_ONLINE_LISTING("NO_ONLINE_LISTING"),
	TECHNICAL_PROBLEMS("TECHNICAL_PROBLEMS");

	final String value;

	OvhListingStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

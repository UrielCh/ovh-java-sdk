package net.minidev.ovh.api.billing.itemdetail;

/**
 * List of order actions
 */
public enum OvhOrderActionEnum {
	consumption("consumption"),
	installation("installation"),
	renew("renew"),
	upgrade("upgrade");

	final String value;

	OvhOrderActionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

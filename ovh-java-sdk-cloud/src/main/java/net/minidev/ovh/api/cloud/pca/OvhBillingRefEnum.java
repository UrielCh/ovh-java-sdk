package net.minidev.ovh.api.cloud.pca;

/**
 * Task type available for cloud archives
 */
public enum OvhBillingRefEnum {
	backup("backup"),
	delete("delete"),
	restore("restore");

	final String value;

	OvhBillingRefEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

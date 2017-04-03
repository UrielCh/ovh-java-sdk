package net.minidev.ovh.api.cloud.billingview;

/**
 * StorageTypeEnum
 */
public enum OvhStorageTypeEnum {
	pcs("pcs"),
	pca("pca");

	final String value;

	OvhStorageTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

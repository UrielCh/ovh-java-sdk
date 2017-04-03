package net.minidev.ovh.api.cloud.pca;

/**
 * Task type available for cloud archives
 */
public enum OvhTaskTypeEnum {
	delete("delete"),
	restore("restore");

	final String value;

	OvhTaskTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

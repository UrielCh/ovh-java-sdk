package net.minidev.ovh.api.cloud.instance;

/**
 * RebootTypeEnum
 */
public enum OvhRebootTypeEnum {
	soft("soft"),
	hard("hard");

	final String value;

	OvhRebootTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

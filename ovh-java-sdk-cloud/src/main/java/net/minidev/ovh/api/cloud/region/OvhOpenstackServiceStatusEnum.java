package net.minidev.ovh.api.cloud.region;

/**
 * OpenstackServiceStatusEnum
 */
public enum OvhOpenstackServiceStatusEnum {
	UP("UP"),
	DOWN("DOWN");

	final String value;

	OvhOpenstackServiceStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

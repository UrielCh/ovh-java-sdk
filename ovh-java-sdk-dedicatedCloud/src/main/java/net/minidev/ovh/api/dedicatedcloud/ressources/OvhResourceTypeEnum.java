package net.minidev.ovh.api.dedicatedcloud.ressources;

/**
 * The resource type of this Dedicated Cloud ressource
 */
public enum OvhResourceTypeEnum {
	host("host"),
	storage("storage");

	final String value;

	OvhResourceTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

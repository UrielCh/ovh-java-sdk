package net.minidev.ovh.api.cloud.storage;

/**
 * RetrievalStateEnum
 */
public enum OvhRetrievalStateEnum {
	sealed("sealed"),
	unsealing("unsealing"),
	unsealed("unsealed");

	final String value;

	OvhRetrievalStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

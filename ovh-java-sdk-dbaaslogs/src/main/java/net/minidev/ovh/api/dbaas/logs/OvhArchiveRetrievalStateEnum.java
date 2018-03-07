package net.minidev.ovh.api.dbaas.logs;

/**
 * Possible values for ArchiveRetrievalStateEnum
 */
public enum OvhArchiveRetrievalStateEnum {
	sealed("sealed"),
	unsealing("unsealing"),
	unsealed("unsealed");

	final String value;

	OvhArchiveRetrievalStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

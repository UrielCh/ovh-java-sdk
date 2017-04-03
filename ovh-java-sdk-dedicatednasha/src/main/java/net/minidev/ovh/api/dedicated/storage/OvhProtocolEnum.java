package net.minidev.ovh.api.dedicated.storage;

/**
 * Partition Protocol
 */
public enum OvhProtocolEnum {
	CIFS("CIFS"),
	NFS("NFS"),
	NFS_CIFS("NFS_CIFS");

	final String value;

	OvhProtocolEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

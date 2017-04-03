package net.minidev.ovh.api.vps.veeam;

/**
 * A structure describing a Veeam backup's export options
 */
public enum OvhExportTypeEnum {
	nfs("nfs"),
	smb("smb");

	final String value;

	OvhExportTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

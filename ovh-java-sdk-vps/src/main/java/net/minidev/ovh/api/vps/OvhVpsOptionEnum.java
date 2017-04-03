package net.minidev.ovh.api.vps;

/**
 * All options a VPS can have
 */
public enum OvhVpsOptionEnum {
	additionalDisk("additionalDisk"),
	automatedBackup("automatedBackup"),
	cpanel("cpanel"),
	ftpbackup("ftpbackup"),
	plesk("plesk"),
	snapshot("snapshot"),
	veeam("veeam"),
	windows("windows");

	final String value;

	OvhVpsOptionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

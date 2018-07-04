package net.minidev.ovh.api.dedicated.server;

/**
 * Application access type
 */
public enum OvhAccessTypeEnum {
	DIRECTADMIN_PANEL("DIRECTADMIN_PANEL"),
	PLESK_PANEL("PLESK_PANEL"),
	PROXMOX_PANEL("PROXMOX_PANEL"),
	RDP("RDP"),
	SQL_SERVER("SQL_SERVER"),
	SSH("SSH"),
	WEB_PANEL("WEB_PANEL");

	final String value;

	OvhAccessTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

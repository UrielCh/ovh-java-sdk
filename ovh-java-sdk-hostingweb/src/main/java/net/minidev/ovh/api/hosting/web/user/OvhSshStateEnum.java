package net.minidev.ovh.api.hosting.web.user;

/**
 * Account's ssh state
 */
public enum OvhSshStateEnum {
	active("active"),
	none("none"),
	sftponly("sftponly");

	final String value;

	OvhSshStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

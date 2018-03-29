package net.minidev.ovh.api.xdsl.antispam;

/**
 * Evidences AsyncTask status
 */
public enum OvhEvidencesInfoStatusEnum {
	error("error"),
	ok("ok"),
	pending("pending");

	final String value;

	OvhEvidencesInfoStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

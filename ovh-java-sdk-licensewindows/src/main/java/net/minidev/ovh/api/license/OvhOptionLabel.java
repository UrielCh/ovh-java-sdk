package net.minidev.ovh.api.license;

/**
 * The name of an option currently enabled on your license
 */
public enum OvhOptionLabel {
	ANTISPAM_SPAMASSASSIN("ANTISPAM_SPAMASSASSIN"),
	ANTIVIRUS_DRWEB("ANTIVIRUS_DRWEB"),
	ANTIVIRUS_KASPERSKY("ANTIVIRUS_KASPERSKY"),
	DOMAINS("DOMAINS"),
	LANGUAGE_PACK("LANGUAGE_PACK"),
	POWERPACK("POWERPACK"),
	SQL_SERVER("SQL_SERVER"),
	VIRTUOZZO_CONTAINERS("VIRTUOZZO_CONTAINERS");

	final String value;

	OvhOptionLabel(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

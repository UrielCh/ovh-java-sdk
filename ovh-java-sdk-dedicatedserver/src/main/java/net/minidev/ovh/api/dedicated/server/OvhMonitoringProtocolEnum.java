package net.minidev.ovh.api.dedicated.server;

/**
 * Monitoring protocol
 */
public enum OvhMonitoringProtocolEnum {
	DNS("DNS"),
	FTP("FTP"),
	HTTP("HTTP"),
	IMAP("IMAP"),
	POP("POP"),
	SMTP("SMTP"),
	SSH("SSH"),
	openTCP("openTCP");

	final String value;

	OvhMonitoringProtocolEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

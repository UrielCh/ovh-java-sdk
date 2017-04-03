package net.minidev.ovh.api.zone;

/**
 * Resource record fieldType
 */
public enum OvhNamedResolutionFieldTypeEnum {
	A("A"),
	AAAA("AAAA"),
	CNAME("CNAME"),
	DKIM("DKIM"),
	LOC("LOC"),
	MX("MX"),
	NAPTR("NAPTR"),
	NS("NS"),
	PTR("PTR"),
	SPF("SPF"),
	SRV("SRV"),
	SSHFP("SSHFP"),
	TLSA("TLSA"),
	TXT("TXT");

	final String value;

	OvhNamedResolutionFieldTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

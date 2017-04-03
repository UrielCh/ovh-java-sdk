package net.minidev.ovh.api.nichandle;

/**
 * OVH subsidiaries
 */
public enum OvhOvhSubsidiaryEnum {
	AU("AU"),
	CA("CA"),
	CZ("CZ"),
	DE("DE"),
	ES("ES"),
	EU("EU"),
	FI("FI"),
	FR("FR"),
	GB("GB"),
	IE("IE"),
	IT("IT"),
	LT("LT"),
	MA("MA"),
	NL("NL"),
	PL("PL"),
	PT("PT"),
	QC("QC"),
	SG("SG"),
	SN("SN"),
	TN("TN"),
	US("US"),
	WE("WE"),
	WS("WS");

	final String value;

	OvhOvhSubsidiaryEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

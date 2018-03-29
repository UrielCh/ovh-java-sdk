package net.minidev.ovh.api.pack.xdsl;

/**
 * Service name
 */
public enum OvhServiceNameEnum {
	domain("domain"),
	emailPro("emailPro"),
	exchangeAccount("exchangeAccount"),
	exchangeIndividual("exchangeIndividual"),
	exchangeLite("exchangeLite"),
	exchangeOrganization("exchangeOrganization"),
	hostedEmail("hostedEmail"),
	hubic("hubic"),
	modem("modem"),
	overTheBoxHardware("overTheBoxHardware"),
	overTheBoxService("overTheBoxService"),
	siteBuilderFull("siteBuilderFull"),
	siteBuilderStart("siteBuilderStart"),
	voipAlias("voipAlias"),
	voipBillingAccount("voipBillingAccount"),
	voipEcoFax("voipEcoFax"),
	voipLine("voipLine"),
	xdslAccess("xdslAccess");

	final String value;

	OvhServiceNameEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

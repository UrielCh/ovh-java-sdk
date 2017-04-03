package net.minidev.ovh.api.domain;

/**
 * Operation functions
 */
public enum OvhNicOperationFunctionEnum {
	ContactControl("ContactControl"),
	DnsAnycastActivate("DnsAnycastActivate"),
	DnsAnycastDeactivate("DnsAnycastDeactivate"),
	DnssecDisable("DnssecDisable"),
	DnssecEnable("DnssecEnable"),
	DnssecResigning("DnssecResigning"),
	DnssecRollKsk("DnssecRollKsk"),
	DnssecRollZsk("DnssecRollZsk"),
	DomainContactControl("DomainContactControl"),
	DomainContactUpdate("DomainContactUpdate"),
	DomainControl("DomainControl"),
	DomainCreate("DomainCreate"),
	DomainDelete("DomainDelete"),
	DomainDnsUpdate("DomainDnsUpdate"),
	DomainDsUpdate("DomainDsUpdate"),
	DomainHold("DomainHold"),
	DomainHostCreate("DomainHostCreate"),
	DomainHostDelete("DomainHostDelete"),
	DomainHostUpdate("DomainHostUpdate"),
	DomainIncomingTransfer("DomainIncomingTransfer"),
	DomainLock("DomainLock"),
	DomainOutgoingTransfer("DomainOutgoingTransfer"),
	DomainRenew("DomainRenew"),
	DomainRestore("DomainRestore"),
	DomainTrade("DomainTrade"),
	ZoneImport("ZoneImport");

	final String value;

	OvhNicOperationFunctionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

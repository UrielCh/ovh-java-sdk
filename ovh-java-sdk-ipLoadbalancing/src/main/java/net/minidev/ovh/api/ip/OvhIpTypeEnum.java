package net.minidev.ovh.api.ip;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Possible values for ip type
 */
public enum OvhIpTypeEnum {
	cdn("cdn"),
	cloud("cloud"),
	dedicated("dedicated"),
	failover("failover"),
	hosted_ssl("hosted_ssl"),
	housing("housing"),
	loadBalancing("loadBalancing"),
	mail("mail"),
	overthebox("overthebox"),
	pcc("pcc"),
	pci("pci"),
	@JsonProperty("private")
	_private("private"),
	vpn("vpn"),
	vps("vps"),
	vrack("vrack"),
	xdsl("xdsl");

	final String value;

	OvhIpTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

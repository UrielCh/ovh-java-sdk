package net.minidev.ovh.api.support;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Ticket product
 */
public enum OvhTicketProductEnum {
	adsl("adsl"),
	cdn("cdn"),
	dedicated("dedicated"),
	@JsonProperty("dedicated-billing")
	dedicated_billing("dedicated-billing"),
	@JsonProperty("dedicated-other")
	dedicated_other("dedicated-other"),
	dedicatedcloud("dedicatedcloud"),
	domain("domain"),
	exchange("exchange"),
	fax("fax"),
	hosting("hosting"),
	housing("housing"),
	iaas("iaas"),
	mail("mail"),
	network("network"),
	publiccloud("publiccloud"),
	sms("sms"),
	ssl("ssl"),
	storage("storage"),
	@JsonProperty("telecom-billing")
	telecom_billing("telecom-billing"),
	@JsonProperty("telecom-other")
	telecom_other("telecom-other"),
	voip("voip"),
	vps("vps"),
	@JsonProperty("web-billing")
	web_billing("web-billing"),
	@JsonProperty("web-other")
	web_other("web-other");

	final String value;

	OvhTicketProductEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

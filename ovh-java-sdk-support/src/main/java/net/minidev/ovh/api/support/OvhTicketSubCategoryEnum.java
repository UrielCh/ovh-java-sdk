package net.minidev.ovh.api.support;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Ticket request subcategory
 */
public enum OvhTicketSubCategoryEnum {
	alerts("alerts"),
	bill("bill"),
	down("down"),
	inProgress("inProgress"),
	@JsonProperty("new")
	_new("new"),
	other("other"),
	perfs("perfs"),
	start("start"),
	usage("usage");

	final String value;

	OvhTicketSubCategoryEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

package net.minidev.ovh.api.telephony;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Document suffix
 */
public enum OvhBillDocument {
	csv("csv"),
	pdf("pdf"),
	@JsonProperty("received.csv")
	received_csv("received.csv"),
	xml("xml");

	final String value;

	OvhBillDocument(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

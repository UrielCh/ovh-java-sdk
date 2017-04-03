package net.minidev.ovh.api.telephony;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Document extension
 */
public enum OvhBillDocumentExtension {
	csv("csv"),
	pdf("pdf"),
	@JsonProperty("received.csv")
	received_csv("received.csv"),
	xml("xml");

	final String value;

	OvhBillDocumentExtension(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

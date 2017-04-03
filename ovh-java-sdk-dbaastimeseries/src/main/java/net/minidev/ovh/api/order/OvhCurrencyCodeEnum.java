package net.minidev.ovh.api.order;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 */
public enum OvhCurrencyCodeEnum {
	AUD("AUD"),
	CAD("CAD"),
	CZK("CZK"),
	EUR("EUR"),
	GBP("GBP"),
	LTL("LTL"),
	MAD("MAD"),
	@JsonProperty("N/A")
	N_A("N/A"),
	PLN("PLN"),
	SGD("SGD"),
	TND("TND"),
	USD("USD"),
	XOF("XOF"),
	points("points");

	final String value;

	OvhCurrencyCodeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

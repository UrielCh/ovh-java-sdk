package net.minidev.ovh.api.price.dedicatedcloud._2018v5.rbx2b.infrastructure.host;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Enum of Monthlys
 */
public enum OvhMonthlyEnum {
	@JsonProperty("SDDC-128")
	SDDC_128("SDDC-128"),
	@JsonProperty("SDDC-16")
	SDDC_16("SDDC-16"),
	@JsonProperty("SDDC-256")
	SDDC_256("SDDC-256"),
	@JsonProperty("SDDC-512")
	SDDC_512("SDDC-512"),
	@JsonProperty("SDDC-64")
	SDDC_64("SDDC-64"),
	@JsonProperty("SDDCVSAN-256")
	SDDCVSAN_256("SDDCVSAN-256"),
	@JsonProperty("SDDCVSAN-512")
	SDDCVSAN_512("SDDCVSAN-512");

	final String value;

	OvhMonthlyEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

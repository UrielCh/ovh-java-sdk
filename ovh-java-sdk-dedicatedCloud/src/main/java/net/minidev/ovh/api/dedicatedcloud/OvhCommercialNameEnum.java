package net.minidev.ovh.api.dedicatedcloud;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The commercial name component
 */
public enum OvhCommercialNameEnum {
	DC("DC"),
	@JsonProperty("DC-HDS")
	DC_HDS("DC-HDS"),
	@JsonProperty("DC-HIPAA")
	DC_HIPAA("DC-HIPAA"),
	@JsonProperty("DC-LEGACY")
	DC_LEGACY("DC-LEGACY"),
	@JsonProperty("DC-LEGACY-HDS")
	DC_LEGACY_HDS("DC-LEGACY-HDS"),
	@JsonProperty("DC-LEGACY-HIPAA")
	DC_LEGACY_HIPAA("DC-LEGACY-HIPAA"),
	@JsonProperty("DC-LEGACY-NSX")
	DC_LEGACY_NSX("DC-LEGACY-NSX"),
	@JsonProperty("DC-LEGACY-NSX-VROPS")
	DC_LEGACY_NSX_VROPS("DC-LEGACY-NSX-VROPS"),
	@JsonProperty("DC-LEGACY-PCIDSS")
	DC_LEGACY_PCIDSS("DC-LEGACY-PCIDSS"),
	@JsonProperty("DC-LEGACY-UNKNOWN")
	DC_LEGACY_UNKNOWN("DC-LEGACY-UNKNOWN"),
	@JsonProperty("DC-LEGACY-VROPS")
	DC_LEGACY_VROPS("DC-LEGACY-VROPS"),
	@JsonProperty("DC-NSX")
	DC_NSX("DC-NSX"),
	@JsonProperty("DC-NSX-VROPS")
	DC_NSX_VROPS("DC-NSX-VROPS"),
	@JsonProperty("DC-PCIDSS")
	DC_PCIDSS("DC-PCIDSS"),
	@JsonProperty("DC-UNKNOWN")
	DC_UNKNOWN("DC-UNKNOWN"),
	@JsonProperty("DC-VROPS")
	DC_VROPS("DC-VROPS"),
	SDDC("SDDC"),
	@JsonProperty("SDDC-HDS")
	SDDC_HDS("SDDC-HDS"),
	@JsonProperty("SDDC-HIPAA")
	SDDC_HIPAA("SDDC-HIPAA"),
	@JsonProperty("SDDC-PCIDSS")
	SDDC_PCIDSS("SDDC-PCIDSS"),
	@JsonProperty("SDDC-UNKNOWN")
	SDDC_UNKNOWN("SDDC-UNKNOWN"),
	@JsonProperty("SDDC-VROPS")
	SDDC_VROPS("SDDC-VROPS"),
	@JsonProperty("SDDC-VROPS-WITHOUT-NSX")
	SDDC_VROPS_WITHOUT_NSX("SDDC-VROPS-WITHOUT-NSX"),
	@JsonProperty("SDDC-WITHOUT-NSX")
	SDDC_WITHOUT_NSX("SDDC-WITHOUT-NSX"),
	UNKNOWN("UNKNOWN"),
	@JsonProperty("UNKNOWN-HDS")
	UNKNOWN_HDS("UNKNOWN-HDS"),
	@JsonProperty("UNKNOWN-HIPAA")
	UNKNOWN_HIPAA("UNKNOWN-HIPAA"),
	@JsonProperty("UNKNOWN-NSX")
	UNKNOWN_NSX("UNKNOWN-NSX"),
	@JsonProperty("UNKNOWN-NSX-VROPS")
	UNKNOWN_NSX_VROPS("UNKNOWN-NSX-VROPS"),
	@JsonProperty("UNKNOWN-PCIDSS")
	UNKNOWN_PCIDSS("UNKNOWN-PCIDSS"),
	@JsonProperty("UNKNOWN-UNKNOWN")
	UNKNOWN_UNKNOWN("UNKNOWN-UNKNOWN"),
	@JsonProperty("UNKNOWN-VROPS")
	UNKNOWN_VROPS("UNKNOWN-VROPS");

	final String value;

	OvhCommercialNameEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

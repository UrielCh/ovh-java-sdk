package net.minidev.ovh.api.xdsl;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Various types of statisctics available for the line.
 */
public enum OvhLineStatisticsTypeEnum {
	@JsonProperty("attenuation:download")
	attenuation_download("attenuation:download"),
	@JsonProperty("attenuation:upload")
	attenuation_upload("attenuation:upload"),
	@JsonProperty("snr:download")
	snr_download("snr:download"),
	@JsonProperty("snr:upload")
	snr_upload("snr:upload"),
	@JsonProperty("synchronization:download")
	synchronization_download("synchronization:download"),
	@JsonProperty("synchronization:upload")
	synchronization_upload("synchronization:upload");

	final String value;

	OvhLineStatisticsTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

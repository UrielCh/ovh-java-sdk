package net.minidev.ovh.api.dedicated.server;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * distincts MRTG type
 */
public enum OvhMrtgTypeEnum {
	@JsonProperty("errors:download")
	errors_download("errors:download"),
	@JsonProperty("errors:upload")
	errors_upload("errors:upload"),
	@JsonProperty("packets:download")
	packets_download("packets:download"),
	@JsonProperty("packets:upload")
	packets_upload("packets:upload"),
	@JsonProperty("traffic:download")
	traffic_download("traffic:download"),
	@JsonProperty("traffic:upload")
	traffic_upload("traffic:upload");

	final String value;

	OvhMrtgTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

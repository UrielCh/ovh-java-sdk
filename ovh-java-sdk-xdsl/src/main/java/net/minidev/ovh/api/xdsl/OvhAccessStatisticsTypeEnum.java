package net.minidev.ovh.api.xdsl;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Various types of statisctics available for the access.
 */
public enum OvhAccessStatisticsTypeEnum {
	ping("ping"),
	@JsonProperty("traffic:download")
	traffic_download("traffic:download"),
	@JsonProperty("traffic:upload")
	traffic_upload("traffic:upload");

	final String value;

	OvhAccessStatisticsTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

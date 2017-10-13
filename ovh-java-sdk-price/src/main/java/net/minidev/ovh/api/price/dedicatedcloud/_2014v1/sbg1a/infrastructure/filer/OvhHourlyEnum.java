package net.minidev.ovh.api.price.dedicatedcloud._2014v1.sbg1a.infrastructure.filer;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Enum of Hourlys
 */
public enum OvhHourlyEnum {
	@JsonProperty("iscsi-1200-GB")
	iscsi_1200_GB("iscsi-1200-GB"),
	@JsonProperty("iscsi-13200g-GB")
	iscsi_13200g_GB("iscsi-13200g-GB"),
	@JsonProperty("iscsi-3300-GB")
	iscsi_3300_GB("iscsi-3300-GB"),
	@JsonProperty("iscsi-6600-GB")
	iscsi_6600_GB("iscsi-6600-GB"),
	@JsonProperty("iscsi-800-GB")
	iscsi_800_GB("iscsi-800-GB"),
	@JsonProperty("nfs-100-GB")
	nfs_100_GB("nfs-100-GB"),
	@JsonProperty("nfs-1200-GB")
	nfs_1200_GB("nfs-1200-GB"),
	@JsonProperty("nfs-13200-GB")
	nfs_13200_GB("nfs-13200-GB"),
	@JsonProperty("nfs-1600-GB")
	nfs_1600_GB("nfs-1600-GB"),
	@JsonProperty("nfs-2400-GB")
	nfs_2400_GB("nfs-2400-GB"),
	@JsonProperty("nfs-3300-GB")
	nfs_3300_GB("nfs-3300-GB"),
	@JsonProperty("nfs-6600-GB")
	nfs_6600_GB("nfs-6600-GB"),
	@JsonProperty("nfs-800-GB")
	nfs_800_GB("nfs-800-GB");

	final String value;

	OvhHourlyEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

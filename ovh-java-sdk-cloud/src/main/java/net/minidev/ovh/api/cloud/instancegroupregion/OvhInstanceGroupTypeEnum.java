package net.minidev.ovh.api.cloud.instancegroupregion;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InstanceGroupTypeEnum
 */
public enum OvhInstanceGroupTypeEnum {
	affinity("affinity"),
	@JsonProperty("anti-affinity")
	anti_affinity("anti-affinity");

	final String value;

	OvhInstanceGroupTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

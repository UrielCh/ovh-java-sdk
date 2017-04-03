package net.minidev.ovh.api.cluster.hadoop;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * All billing profile names
 */
public enum OvhBillingNameEnum {
	@JsonProperty("100-small")
	_100_small("100-small"),
	@JsonProperty("200-cpu-1")
	_200_cpu_1("200-cpu-1"),
	@JsonProperty("220-cpu-3")
	_220_cpu_3("220-cpu-3"),
	@JsonProperty("300-disk-1")
	_300_disk_1("300-disk-1"),
	@JsonProperty("310-disk-3")
	_310_disk_3("310-disk-3"),
	@JsonProperty("900-vm-1")
	_900_vm_1("900-vm-1");

	final String value;

	OvhBillingNameEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

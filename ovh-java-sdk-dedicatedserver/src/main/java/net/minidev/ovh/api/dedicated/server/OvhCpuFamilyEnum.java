package net.minidev.ovh.api.dedicated.server;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * cpu family 
 */
public enum OvhCpuFamilyEnum {
	arm64("arm64"),
	armhf32("armhf32"),
	ppc64("ppc64"),
	x86("x86"),
	@JsonProperty("x86-ht")
	x86_ht("x86-ht"),
	x86_64("x86_64");

	final String value;

	OvhCpuFamilyEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

package net.minidev.ovh.api.dedicated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ovh datacenter
 */
public enum OvhDatacenterEnum {
	bhs1("bhs1"),
	bhs2("bhs2"),
	bhs3("bhs3"),
	bhs4("bhs4"),
	bhs5("bhs5"),
	bhs6("bhs6"),
	dc1("dc1"),
	gra1("gra1"),
	gsw("gsw"),
	p19("p19"),
	@JsonProperty("rbx-hz")
	rbx_hz("rbx-hz"),
	rbx1("rbx1"),
	rbx2("rbx2"),
	rbx3("rbx3"),
	rbx4("rbx4"),
	rbx5("rbx5"),
	rbx6("rbx6"),
	sbg1("sbg1"),
	sbg2("sbg2"),
	sbg3("sbg3"),
	sbg4("sbg4"),
	sgp1("sgp1"),
	syd1("syd1"),
	waw1("waw1");

	final String value;

	OvhDatacenterEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

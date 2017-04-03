package net.minidev.ovh.api.vps;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * All offers a VPS can have
 */
public enum OvhVpsOfferEnum {
	@JsonProperty("beta-classic")
	beta_classic("beta-classic"),
	classic("classic"),
	cloud("cloud"),
	cloudram("cloudram"),
	@JsonProperty("game-classic")
	game_classic("game-classic"),
	lowlat("lowlat"),
	ssd("ssd");

	final String value;

	OvhVpsOfferEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

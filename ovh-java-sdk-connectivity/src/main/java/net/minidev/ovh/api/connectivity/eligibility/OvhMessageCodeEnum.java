package net.minidev.ovh.api.connectivity.eligibility;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Message codes
 */
public enum OvhMessageCodeEnum {
	@JsonProperty("2006")
	_2006("2006"),
	@JsonProperty("2011")
	_2011("2011"),
	@JsonProperty("2102")
	_2102("2102"),
	@JsonProperty("2103")
	_2103("2103"),
	@JsonProperty("2104")
	_2104("2104"),
	@JsonProperty("2105")
	_2105("2105"),
	@JsonProperty("3009")
	_3009("3009"),
	@JsonProperty("3011")
	_3011("3011"),
	@JsonProperty("3012")
	_3012("3012"),
	@JsonProperty("3013")
	_3013("3013"),
	@JsonProperty("3014")
	_3014("3014"),
	@JsonProperty("3031")
	_3031("3031"),
	@JsonProperty("3040")
	_3040("3040"),
	@JsonProperty("3041")
	_3041("3041"),
	@JsonProperty("3043")
	_3043("3043"),
	@JsonProperty("3044")
	_3044("3044"),
	@JsonProperty("3045")
	_3045("3045"),
	@JsonProperty("3046")
	_3046("3046"),
	@JsonProperty("3047")
	_3047("3047"),
	@JsonProperty("3048")
	_3048("3048"),
	@JsonProperty("3049")
	_3049("3049"),
	ATTENUATION_LIMIT("ATTENUATION_LIMIT"),
	COMPATIBILITY_CHECK("COMPATIBILITY_CHECK"),
	COPPER_NOT_AVAILABLE("COPPER_NOT_AVAILABLE"),
	COPPER_NOT_YET_AVAILABLE("COPPER_NOT_YET_AVAILABLE"),
	DELAY_30("DELAY_30"),
	DELAY_7("DELAY_7"),
	EXTERNAL_WS_UNREACHABLE("EXTERNAL_WS_UNREACHABLE"),
	FIBER_NOT_AVAILABLE("FIBER_NOT_AVAILABLE"),
	FIBER_NOT_DEPLOYED_IN_BUILDING("FIBER_NOT_DEPLOYED_IN_BUILDING"),
	FIBER_NOT_YET_AVAILABLE("FIBER_NOT_YET_AVAILABLE"),
	FIBER_NOT_YET_DEPLOYED("FIBER_NOT_YET_DEPLOYED"),
	INCOMPATIBLE_LOCAL_LOOP("INCOMPATIBLE_LOCAL_LOOP"),
	NETWORK_SATURATED("NETWORK_SATURATED"),
	OTP_NOT_CONNECTABLE("OTP_NOT_CONNECTABLE"),
	OTP_NOT_MARKETABLE("OTP_NOT_MARKETABLE"),
	PAIRS_SATURATION("PAIRS_SATURATION"),
	PRODUCT_NOT_YET_AVAILABLE("PRODUCT_NOT_YET_AVAILABLE"),
	TOO_MUCH_ATTENUATION("TOO_MUCH_ATTENUATION"),
	UNCERTAIN_DATA("UNCERTAIN_DATA");

	final String value;

	OvhMessageCodeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

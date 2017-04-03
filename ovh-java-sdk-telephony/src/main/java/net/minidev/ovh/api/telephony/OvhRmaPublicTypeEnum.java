package net.minidev.ovh.api.telephony;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Return merchandise authorisation type
 */
public enum OvhRmaPublicTypeEnum {
	@JsonProperty("change to another phone/equipment (restitution first and shipping then)")
	change_to_another_phone_equipment__restitution_first_and_shipping_then_("change to another phone/equipment (restitution first and shipping then)"),
	@JsonProperty("restitution but keep the service enable")
	restitution_but_keep_the_service_enable("restitution but keep the service enable");

	final String value;

	OvhRmaPublicTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

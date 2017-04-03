package net.minidev.ovh.api.telephony;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Return merchandise authorisation type
 */
public enum OvhRmaTypeEnum {
	@JsonProperty("after sale equipment service exchange")
	after_sale_equipment_service_exchange("after sale equipment service exchange"),
	@JsonProperty("after sale phone service exchange")
	after_sale_phone_service_exchange("after sale phone service exchange"),
	@JsonProperty("equipment restitution")
	equipment_restitution("equipment restitution"),
	@JsonProperty("fast exchange")
	fast_exchange("fast exchange"),
	@JsonProperty("old merchandise reception before exchange")
	old_merchandise_reception_before_exchange("old merchandise reception before exchange"),
	@JsonProperty("phone restitution")
	phone_restitution("phone restitution"),
	@JsonProperty("resends due to shipping lost by the carrier")
	resends_due_to_shipping_lost_by_the_carrier("resends due to shipping lost by the carrier"),
	@JsonProperty("resends due to shipping not withdraw")
	resends_due_to_shipping_not_withdraw("resends due to shipping not withdraw"),
	@JsonProperty("specific return merchandise authorisation")
	specific_return_merchandise_authorisation("specific return merchandise authorisation"),
	termination("termination"),
	unknown("unknown");

	final String value;

	OvhRmaTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

package net.minidev.ovh.api.billing.voucheraccount;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Operations a voucher account movement can represent
 */
public enum OvhOperationEnum {
	@JsonProperty("cancel-credit")
	cancel_credit("cancel-credit"),
	@JsonProperty("cancel-debit")
	cancel_debit("cancel-debit"),
	@JsonProperty("cancel-pre-debit")
	cancel_pre_debit("cancel-pre-debit"),
	credit("credit"),
	debit("debit"),
	@JsonProperty("pre-credit")
	pre_credit("pre-credit"),
	@JsonProperty("pre-debit")
	pre_debit("pre-debit");

	final String value;

	OvhOperationEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

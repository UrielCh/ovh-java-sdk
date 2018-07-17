package net.minidev.ovh.api.billing.credit.balance;

/**
 * Balance type
 */
public enum OvhType {
	PREPAID_ACCOUNT("PREPAID_ACCOUNT"),
	VOUCHER("VOUCHER"),
	DEPOSIT("DEPOSIT"),
	BONUS("BONUS");

	final String value;

	OvhType(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

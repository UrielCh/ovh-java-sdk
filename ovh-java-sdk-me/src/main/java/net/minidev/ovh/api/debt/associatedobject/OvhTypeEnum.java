package net.minidev.ovh.api.debt.associatedobject;

/**
 * Type of objects an order can be linked to
 */
public enum OvhTypeEnum {
	Bill("Bill"),
	DebtOperation("DebtOperation"),
	Deposit("Deposit"),
	Order("Order"),
	OvhAccountMovement("OvhAccountMovement"),
	Refund("Refund"),
	Withdrawal("Withdrawal");

	final String value;

	OvhTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

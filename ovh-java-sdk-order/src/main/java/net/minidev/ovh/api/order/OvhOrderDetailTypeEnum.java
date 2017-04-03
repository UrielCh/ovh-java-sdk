package net.minidev.ovh.api.order;

/**
 * Product type of item in order
 */
public enum OvhOrderDetailTypeEnum {
	ACCESSORY("ACCESSORY"),
	CAUTION("CAUTION"),
	CHOOSED("CHOOSED"),
	CONSUMPTION("CONSUMPTION"),
	CREATION("CREATION"),
	DELIVERY("DELIVERY"),
	DURATION("DURATION"),
	GIFT("GIFT"),
	INSTALLATION("INSTALLATION"),
	LICENSE("LICENSE"),
	MUTE("MUTE"),
	OTHER("OTHER"),
	OUTPLAN("OUTPLAN"),
	QUANTITY("QUANTITY"),
	REFUND("REFUND"),
	RENEW("RENEW"),
	SPECIAL("SPECIAL"),
	SWITCH("SWITCH"),
	TRANSFER("TRANSFER"),
	VOUCHER("VOUCHER");

	final String value;

	OvhOrderDetailTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

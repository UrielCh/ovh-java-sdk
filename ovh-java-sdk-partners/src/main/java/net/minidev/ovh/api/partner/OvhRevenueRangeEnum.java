package net.minidev.ovh.api.partner;

/**
 * Possible ranges for revenue
 */
public enum OvhRevenueRangeEnum {
	lessThan50000Euros("lessThan50000Euros"),
	from50000To500000Euros("from50000To500000Euros"),
	from500000To5000000Euros("from500000To5000000Euros"),
	moreThan5000000Euros("moreThan5000000Euros"),
	IDoNotWishToDiscloseThisInformation("IDoNotWishToDiscloseThisInformation");

	final String value;

	OvhRevenueRangeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

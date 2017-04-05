package net.minidev.ovh.api.partner;

/**
 * Possible ranges for revenue
 */
public enum OvhTechnicalExpertResourcesRangeEnum {
	none("none"),
	from1To3("from1To3"),
	from4To10("from4To10"),
	moreThan10("moreThan10");

	final String value;

	OvhTechnicalExpertResourcesRangeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

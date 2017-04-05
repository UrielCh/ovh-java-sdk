package net.minidev.ovh.api.partner;

/**
 * Possible ranges for AdvancedResources
 */
public enum OvhTechnicalAdvancedResourcesRangeEnum {
	none("none"),
	from1To3("from1To3"),
	from4To10("from4To10"),
	moreThan10("moreThan10");

	final String value;

	OvhTechnicalAdvancedResourcesRangeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

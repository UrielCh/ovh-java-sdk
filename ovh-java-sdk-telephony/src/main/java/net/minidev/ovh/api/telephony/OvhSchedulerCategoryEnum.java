package net.minidev.ovh.api.telephony;

/**
 * Scheculer category
 */
public enum OvhSchedulerCategoryEnum {
	holidays("holidays"),
	scheduler1("scheduler1"),
	scheduler2("scheduler2"),
	scheduler3("scheduler3");

	final String value;

	OvhSchedulerCategoryEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

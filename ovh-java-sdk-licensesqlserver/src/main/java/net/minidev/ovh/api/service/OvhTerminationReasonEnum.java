package net.minidev.ovh.api.service;

/**
 * All reasons you can provide for a service termination
 */
public enum OvhTerminationReasonEnum {
	LACK_OF_PERFORMANCES("LACK_OF_PERFORMANCES"),
	MIGRATED_TO_ANOTHER_OVH_PRODUCT("MIGRATED_TO_ANOTHER_OVH_PRODUCT"),
	MIGRATED_TO_COMPETITOR("MIGRATED_TO_COMPETITOR"),
	NOT_NEEDED_ANYMORE("NOT_NEEDED_ANYMORE"),
	NOT_RELIABLE("NOT_RELIABLE"),
	OTHER("OTHER"),
	TOO_EXPENSIVE("TOO_EXPENSIVE"),
	TOO_HARD_TO_USE("TOO_HARD_TO_USE");

	final String value;

	OvhTerminationReasonEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

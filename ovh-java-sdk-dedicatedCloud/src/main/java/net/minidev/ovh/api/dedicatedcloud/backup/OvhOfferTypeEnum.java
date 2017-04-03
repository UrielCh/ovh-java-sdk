package net.minidev.ovh.api.dedicatedcloud.backup;

/**
 * All the offer type of the backup
 */
public enum OvhOfferTypeEnum {
	advanced("advanced"),
	backup("backup"),
	classic("classic"),
	legacy("legacy");

	final String value;

	OvhOfferTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

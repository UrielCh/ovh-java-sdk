package net.minidev.ovh.api.telephony.portability;

/**
 * Social reason
 */
public enum OvhSocialReason {
	corporation("corporation"),
	individual("individual"),
	professional("professional");

	final String value;

	OvhSocialReason(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

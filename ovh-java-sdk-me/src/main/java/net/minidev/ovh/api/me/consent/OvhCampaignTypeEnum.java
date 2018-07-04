package net.minidev.ovh.api.me.consent;

/**
 * Campaign type
 */
public enum OvhCampaignTypeEnum {
	OPTIN("OPTIN"),
	OPTOUT("OPTOUT");

	final String value;

	OvhCampaignTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

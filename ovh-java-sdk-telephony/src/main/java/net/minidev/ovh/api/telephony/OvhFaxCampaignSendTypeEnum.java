package net.minidev.ovh.api.telephony;

/**
 * Available sending method for fax campaign
 */
public enum OvhFaxCampaignSendTypeEnum {
	automatic("automatic"),
	manual("manual"),
	scheduled("scheduled");

	final String value;

	OvhFaxCampaignSendTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

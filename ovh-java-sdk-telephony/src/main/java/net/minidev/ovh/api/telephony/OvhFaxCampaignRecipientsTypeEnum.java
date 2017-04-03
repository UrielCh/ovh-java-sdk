package net.minidev.ovh.api.telephony;

/**
 * Available recipients method for fax campaign
 */
public enum OvhFaxCampaignRecipientsTypeEnum {
	document("document"),
	list("list");

	final String value;

	OvhFaxCampaignRecipientsTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

package net.minidev.ovh.api.telephony;

/**
 * All existing types of line or alias
 */
public enum OvhTypeEnum {
	cloudHunting("cloudHunting"),
	cloudIvr("cloudIvr"),
	conference("conference"),
	contactCenterSolution("contactCenterSolution"),
	contactCenterSolutionExpert("contactCenterSolutionExpert"),
	ddi("ddi"),
	easyHunting("easyHunting"),
	easyPabx("easyPabx"),
	empty("empty"),
	fax("fax"),
	freefax("freefax"),
	mgcp("mgcp"),
	miniPabx("miniPabx"),
	oldConference("oldConference"),
	plugAndFax("plugAndFax"),
	redirect("redirect"),
	sip("sip"),
	svi("svi"),
	voicefax("voicefax"),
	voicemail("voicemail"),
	vxml("vxml");

	final String value;

	OvhTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

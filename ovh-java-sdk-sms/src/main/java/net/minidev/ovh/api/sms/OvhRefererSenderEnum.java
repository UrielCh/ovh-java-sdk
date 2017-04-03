package net.minidev.ovh.api.sms;

/**
 * All tyoplogy of senders
 */
public enum OvhRefererSenderEnum {
	custom("custom"),
	domain("domain"),
	line("line"),
	nic("nic"),
	owner("owner"),
	virtual("virtual");

	final String value;

	OvhRefererSenderEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

package net.minidev.ovh.api.sms;

/**
 * The task step
 */
public enum OvhTodoGeneralPublicStepsEnum {
	checkOrder("checkOrder"),
	createHlrs("createHlrs"),
	finishing("finishing"),
	sendMailReport("sendMailReport"),
	starting("starting"),
	waitForHlrs("waitForHlrs");

	final String value;

	OvhTodoGeneralPublicStepsEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

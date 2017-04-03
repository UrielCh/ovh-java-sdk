package net.minidev.ovh.api.sms;

/**
 * The task function
 */
public enum OvhTodoGeneralPublicFunctionsEnum {
	cleanSmsReceivers("cleanSmsReceivers");

	final String value;

	OvhTodoGeneralPublicFunctionsEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

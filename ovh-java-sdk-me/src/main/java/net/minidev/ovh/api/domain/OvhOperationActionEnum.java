package net.minidev.ovh.api.domain;

/**
 * operation Action
 */
public enum OvhOperationActionEnum {
	canCancel("canCancel"),
	canCorrect("canCorrect"),
	canRelaunch("canRelaunch"),
	canReset("canReset");

	final String value;

	OvhOperationActionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

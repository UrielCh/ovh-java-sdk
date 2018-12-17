package net.minidev.ovh.api.telephony;

/**
 * Action for list antihack
 */
public enum OvhAntihackActionEnum {
	AUTHORIZE_ALL("AUTHORIZE_ALL"),
	AUTHORIZE_ONE_NUMBER("AUTHORIZE_ONE_NUMBER"),
	BLOCK_ALL("BLOCK_ALL"),
	BLOCK_ONE_NUMBER("BLOCK_ONE_NUMBER");

	final String value;

	OvhAntihackActionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

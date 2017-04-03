package net.minidev.ovh.api.domain.data.claimnotice;

/**
 * Type of claim notice
 */
public enum OvhClaimNoticeTypeEnum {
	UK("UK"),
	TRADEMARK("TRADEMARK");

	final String value;

	OvhClaimNoticeTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

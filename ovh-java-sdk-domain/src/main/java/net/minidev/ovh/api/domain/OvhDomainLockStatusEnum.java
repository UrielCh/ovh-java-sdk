package net.minidev.ovh.api.domain;

/**
 * Domain lock status
 */
public enum OvhDomainLockStatusEnum {
	locked("locked"),
	locking("locking"),
	unavailable("unavailable"),
	unlocked("unlocked"),
	unlocking("unlocking");

	final String value;

	OvhDomainLockStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

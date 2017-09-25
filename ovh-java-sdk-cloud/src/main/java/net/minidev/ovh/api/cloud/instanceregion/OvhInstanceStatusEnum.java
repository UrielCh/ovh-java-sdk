package net.minidev.ovh.api.cloud.instanceregion;

/**
 * InstanceStatusEnum
 */
public enum OvhInstanceStatusEnum {
	ACTIVE("ACTIVE"),
	BUILDING("BUILDING"),
	DELETED("DELETED"),
	ERROR("ERROR"),
	HARD_REBOOT("HARD_REBOOT"),
	PASSWORD("PASSWORD"),
	PAUSED("PAUSED"),
	REBOOT("REBOOT"),
	REBUILD("REBUILD"),
	RESCUED("RESCUED"),
	RESIZED("RESIZED"),
	REVERT_RESIZE("REVERT_RESIZE"),
	SOFT_DELETED("SOFT_DELETED"),
	STOPPED("STOPPED"),
	SUSPENDED("SUSPENDED"),
	UNKNOWN("UNKNOWN"),
	VERIFY_RESIZE("VERIFY_RESIZE"),
	MIGRATING("MIGRATING"),
	RESIZE("RESIZE"),
	BUILD("BUILD"),
	SHUTOFF("SHUTOFF"),
	RESCUE("RESCUE"),
	SHELVED("SHELVED"),
	SHELVED_OFFLOADED("SHELVED_OFFLOADED"),
	RESCUING("RESCUING"),
	UNRESCUING("UNRESCUING"),
	SNAPSHOTTING("SNAPSHOTTING"),
	DELETING("DELETING"),
	RESUMING("RESUMING");

	final String value;

	OvhInstanceStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}
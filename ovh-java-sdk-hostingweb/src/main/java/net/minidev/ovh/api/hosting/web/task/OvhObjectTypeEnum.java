package net.minidev.ovh.api.hosting.web.task;

/**
 * Task object type listing
 */
public enum OvhObjectTypeEnum {
	Abuse("Abuse"),
	AttachedDomain("AttachedDomain"),
	BlockedIp("BlockedIp"),
	Cdn("Cdn"),
	Cron("Cron"),
	Database("Database"),
	Dump("Dump"),
	EnvVar("EnvVar"),
	Filerz("Filerz"),
	Hostedssl("Hostedssl"),
	Hosting("Hosting"),
	Indy("Indy"),
	Infra("Infra"),
	Minor("Minor"),
	Module("Module"),
	Other("Other"),
	OvhConfig("OvhConfig"),
	OvhOrg("OvhOrg"),
	OwnLogs("OwnLogs"),
	Scan("Scan"),
	Sqlperso("Sqlperso"),
	User("User"),
	UserLogs("UserLogs"),
	Web("Web"),
	Webd("Webd");

	final String value;

	OvhObjectTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

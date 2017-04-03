package net.minidev.ovh.api.ip;

/**
 * different task operation
 */
public enum OvhTaskFunctionEnum {
	activateSsl("activateSsl"),
	addBackend("addBackend"),
	announceIpLoadBalancing("announceIpLoadBalancing"),
	backupStateSet("backupStateSet"),
	backupStateUnset("backupStateUnset"),
	changeProbe("changeProbe"),
	changeRipeOrg("changeRipeOrg"),
	checkAndReleaseIp("checkAndReleaseIp"),
	delBackend("delBackend"),
	desactivateSsl("desactivateSsl"),
	genericMoveFloatingIp("genericMoveFloatingIp"),
	moveFloatingIp("moveFloatingIp"),
	reagregateBlock("reagregateBlock"),
	releaseIp("releaseIp"),
	setWeight("setWeight"),
	unannounceIpLoadBalancing("unannounceIpLoadBalancing"),
	updateDescription("updateDescription"),
	updateNetname("updateNetname");

	final String value;

	OvhTaskFunctionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

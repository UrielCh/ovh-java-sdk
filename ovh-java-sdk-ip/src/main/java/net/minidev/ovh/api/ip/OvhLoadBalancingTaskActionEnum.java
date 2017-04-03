package net.minidev.ovh.api.ip;

/**
 * Possible values for load balancing task action
 */
public enum OvhLoadBalancingTaskActionEnum {
	activateSsl("activateSsl"),
	addBackend("addBackend"),
	addIpToBackend("addIpToBackend"),
	announceIpLoadBalancing("announceIpLoadBalancing"),
	backupStateSet("backupStateSet"),
	backupStateUnset("backupStateUnset"),
	changeProbe("changeProbe"),
	delBackend("delBackend"),
	desactivateSsl("desactivateSsl"),
	removeIpFromBackend("removeIpFromBackend"),
	setPortRedirection("setPortRedirection"),
	setStickiness("setStickiness"),
	setWeight("setWeight"),
	unannounceIpLoadBalancing("unannounceIpLoadBalancing"),
	unsetPortRedirection("unsetPortRedirection");

	final String value;

	OvhLoadBalancingTaskActionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

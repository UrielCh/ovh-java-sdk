package net.minidev.ovh.api.router;

/**
 * All executable types of tasks
 */
public enum OvhTaskFunctionEnum {
	addDnat("addDnat"),
	addDnatMaster("addDnatMaster"),
	addNetwork("addNetwork"),
	addNetworkMaster("addNetworkMaster"),
	addPrivateLink("addPrivateLink"),
	addPrivateLinkMaster("addPrivateLinkMaster"),
	addPrivateLinkRoute("addPrivateLinkRoute"),
	addPrivateLinkRouteMaster("addPrivateLinkRouteMaster"),
	addSnat("addSnat"),
	addSnatMaster("addSnatMaster"),
	delDnat("delDnat"),
	delDnatMaster("delDnatMaster"),
	delNetwork("delNetwork"),
	delNetworkMaster("delNetworkMaster"),
	delPrivateLink("delPrivateLink"),
	delPrivateLinkMaster("delPrivateLinkMaster"),
	delPrivateLinkRoute("delPrivateLinkRoute"),
	delPrivateLinkRouteMaster("delPrivateLinkRouteMaster"),
	delSnat("delSnat"),
	delSnatMaster("delSnatMaster"),
	vpnCreation("vpnCreation"),
	vpnDeletion("vpnDeletion"),
	vpnSetConfig("vpnSetConfig"),
	vpnSetConfigMaster("vpnSetConfigMaster"),
	vpnSetSecrets("vpnSetSecrets"),
	vpnSetSecretsMaster("vpnSetSecretsMaster");

	final String value;

	OvhTaskFunctionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

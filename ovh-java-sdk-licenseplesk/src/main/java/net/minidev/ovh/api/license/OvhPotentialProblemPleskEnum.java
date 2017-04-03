package net.minidev.ovh.api.license;

/**
 * Tests that have failed for Plesk products
 */
public enum OvhPotentialProblemPleskEnum {
	isHostOsHyperVLike("isHostOsHyperVLike"),
	isHostOsVMwareLike("isHostOsVMwareLike"),
	isHostOsVirtuozzo4Like("isHostOsVirtuozzo4Like"),
	isHostOsXenLike("isHostOsXenLike"),
	isLinuxOs("isLinuxOs"),
	isOsCloudLinux("isOsCloudLinux"),
	isOsPlesk10andLater("isOsPlesk10andLater"),
	isOsPlesk12("isOsPlesk12"),
	isOsPleskOnyx("isOsPleskOnyx"),
	isWindowsOs("isWindowsOs");

	final String value;

	OvhPotentialProblemPleskEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

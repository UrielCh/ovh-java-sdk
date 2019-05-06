package net.minidev.ovh.api.distribution.image;

/**
 * Description not available
 */
public enum OvhService {
	vps("vps"),
	dedicated("dedicated"),
	cloud("cloud"),
	dedicatedCloud("dedicatedCloud");

	final String value;

	OvhService(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

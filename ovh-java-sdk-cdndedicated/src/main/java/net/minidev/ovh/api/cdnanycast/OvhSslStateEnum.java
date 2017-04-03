package net.minidev.ovh.api.cdnanycast;

/**
 * All states a CDN SSL can be in
 */
public enum OvhSslStateEnum {
	checking("checking"),
	creating("creating"),
	error("error"),
	off("off"),
	on("on"),
	removing("removing"),
	updating("updating"),
	uploading("uploading");

	final String value;

	OvhSslStateEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

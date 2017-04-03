package net.minidev.ovh.api.vps;

/**
 * All supported VNC protocols by VPS
 */
public enum OvhVncProtocolEnum {
	VNC("VNC"),
	VNCOverWebSocket("VNCOverWebSocket");

	final String value;

	OvhVncProtocolEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

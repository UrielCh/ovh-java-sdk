package net.minidev.ovh.api.zone;

/**
 * Redirection type enum : visible -> Redirection by http code 302, visiblePermanent -> Redirection by http code 301, invisible -> Redirection by html frame
 */
public enum OvhRedirectionTypeEnum {
	invisible("invisible"),
	visible("visible"),
	visiblePermanent("visiblePermanent");

	final String value;

	OvhRedirectionTypeEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

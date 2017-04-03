package net.minidev.ovh.api.router;

/**
 * Action to be taken against the Private Link request
 */
public enum OvhPrivLinkReqActionEnum {
	accept("accept"),
	cancel("cancel"),
	reject("reject");

	final String value;

	OvhPrivLinkReqActionEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

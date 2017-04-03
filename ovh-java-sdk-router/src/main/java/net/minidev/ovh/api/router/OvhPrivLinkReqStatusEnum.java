package net.minidev.ovh.api.router;

/**
 * Request status of this private link (all links have to be accepted before being created)
 */
public enum OvhPrivLinkReqStatusEnum {
	accepted("accepted"),
	cancelled("cancelled"),
	error("error"),
	pending("pending"),
	rejected("rejected");

	final String value;

	OvhPrivLinkReqStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

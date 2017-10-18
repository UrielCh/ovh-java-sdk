package net.minidev.ovh.core;

import java.io.IOException;

@SuppressWarnings("serial")
public class OvhException extends IOException {
	private final OvhErrorMessage err;
	private final String method;
	private final String url;
	private final String ovhQueryId;

	public OvhException(String method, String url, OvhErrorMessage err, String ovhQueryId) {
		super(method + " " + url + " " + err.message + "[" + ovhQueryId + "]");
		this.method = method;
		this.url = url;
		this.err = err;
		this.ovhQueryId = ovhQueryId;
	}

	public OvhErrorMessage getOvhError() {
		return err;
	}

	public String getMethod() {
		return method;
	}

	public String getUrl() {
		return url;
	}

	public String getOvhQueryId() {
		return ovhQueryId;
	}
}

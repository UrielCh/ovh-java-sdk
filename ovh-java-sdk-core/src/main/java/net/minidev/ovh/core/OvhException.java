package net.minidev.ovh.core;

import java.io.IOException;

@SuppressWarnings("serial")
public class OvhException extends IOException {
	private final OvhErrorMessage err;
	private final String method;
	private final String url;

	public OvhException(String method, String url, OvhErrorMessage err) {
		super(method + " " + url + " " + err.message);
		this.method = method;
		this.url = url;
		this.err = err;
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

}

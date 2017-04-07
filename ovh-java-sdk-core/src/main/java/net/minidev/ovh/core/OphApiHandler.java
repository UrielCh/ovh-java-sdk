package net.minidev.ovh.core;

@FunctionalInterface
public interface OphApiHandler {
	/**
	 * 
	 * @param method GET / POST / PUT
	 * @param url called uri
	 * @param payload the payload
	 * @param response the response ad String
	 */
	void accept(String method, String url, Object payload, String response);
}

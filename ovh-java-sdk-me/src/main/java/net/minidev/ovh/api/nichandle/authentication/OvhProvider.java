package net.minidev.ovh.api.nichandle.authentication;

import java.util.Date;

/**
 * A SAML 2.0 provider
 */
public class OvhProvider {
	/**
	 * IdP's signing certificate
	 *
	 * canBeNull && readOnly
	 */
	public OvhCertificate idpSigningCertificate;

	/**
	 * Last update of the identity provider
	 *
	 * canBeNull && readOnly
	 */
	public Date lastUpdate;

	/**
	 * SAML Group attribute name
	 *
	 * canBeNull && readOnly
	 */
	public String groupAttributeName;

	/**
	 * Creation date of the identity provider
	 *
	 * canBeNull && readOnly
	 */
	public Date creation;

	/**
	 * IdP's Single Sign On Service Url
	 *
	 * canBeNull && readOnly
	 */
	public String ssoServiceUrl;
}

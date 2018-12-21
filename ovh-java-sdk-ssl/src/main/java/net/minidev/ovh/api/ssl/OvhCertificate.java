package net.minidev.ovh.api.ssl;

import java.util.Date;

/**
 * Certificate of an SSL customer
 */
public class OvhCertificate {
	/**
	 * The CN field in your certificate
	 *
	 * canBeNull && readOnly
	 */
	public String commonName;

	/**
	 * The issuer chain of your certificate
	 *
	 * canBeNull && readOnly
	 */
	public String chain;

	/**
	 * The CSR used to create your certificate
	 *
	 * canBeNull && readOnly
	 */
	public String csr;

	/**
	 * Your certificate is invalid from this date
	 *
	 * canBeNull && readOnly
	 */
	public Date validityEnd;

	/**
	 * The authority your certificate is issued from
	 *
	 * canBeNull && readOnly
	 */
	public OvhCertificateAuthorityEnum authority;

	/**
	 * Your certificate
	 *
	 * canBeNull && readOnly
	 */
	public String certificate;

	/**
	 * Your certificate is valid from this date
	 *
	 * canBeNull && readOnly
	 */
	public Date validityStart;

	/**
	 * The internal name of your certificate offer
	 *
	 * canBeNull && readOnly
	 */
	public String serviceName;

	/**
	 * Type of your certificate
	 *
	 * canBeNull && readOnly
	 */
	public OvhCertificateTypeEnum type;

	/**
	 * The SAN field for multidomain certificate
	 *
	 * canBeNull && readOnly
	 */
	public String[] subjectAltName;

	/**
	 * Current status of your certificate
	 *
	 * canBeNull && readOnly
	 */
	public OvhCertificateStatusEnum status;
}

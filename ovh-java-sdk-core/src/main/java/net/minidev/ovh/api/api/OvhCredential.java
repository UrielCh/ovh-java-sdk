package net.minidev.ovh.api.api;

import java.util.Date;
import net.minidev.ovh.api.auth.OvhAccessRule;
import net.minidev.ovh.api.auth.OvhCredentialStateEnum;

/**
 * API Credential
 */
public class OvhCredential {
	/**
	 * canBeNull && readOnly
	 */
	public Date lastUse;

	/**
	 * States whether this credential has been created by yourself or by the OVH support team
	 *
	 * canBeNull && readOnly
	 */
	public Boolean ovhSupport;

	/**
	 * canBeNull && readOnly
	 */
	public Long credentialId;

	/**
	 * canBeNull && readOnly
	 */
	public OvhAccessRule[] rules;

	/**
	 * canBeNull && readOnly
	 */
	public Date expiration;

	/**
	 * canBeNull && readOnly
	 */
	public Long applicationId;

	/**
	 * canBeNull && readOnly
	 */
	public Date creation;

	/**
	 * canBeNull && readOnly
	 */
	public OvhCredentialStateEnum status;
}

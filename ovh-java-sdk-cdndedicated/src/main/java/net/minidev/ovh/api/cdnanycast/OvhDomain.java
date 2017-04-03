package net.minidev.ovh.api.cdnanycast;

/**
 * Domain on CDN
 */
public class OvhDomain {
	/**
	 * canBeNull && readOnly
	 */
	public Long cacheRuleUse;

	/**
	 * Domain of this object
	 *
	 * canBeNull && readOnly
	 */
	public String domain;

	/**
	 * canBeNull && readOnly
	 */
	public String cname;

	/**
	 * canBeNull && readOnly
	 */
	public OvhDomainTypeEnum type;

	/**
	 * canBeNull && readOnly
	 */
	public OvhDomainStatusEnum status;
}

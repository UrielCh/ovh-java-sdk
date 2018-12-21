package net.minidev.ovh.api.cdnanycast;

/**
 * CacheRules for a domain
 */
public class OvhCacheRule {
	/**
	 * Id for this cache rule
	 *
	 * canBeNull && readOnly
	 */
	public Long cacheRuleId;

	/**
	 * canBeNull && readOnly
	 */
	public String domain;

	/**
	 * canBeNull && readOnly
	 */
	public String fileMatch;

	/**
	 * canBeNull && readOnly
	 */
	public Long ttl;

	/**
	 * canBeNull && readOnly
	 */
	public OvhCacheRuleCacheTypeEnum cacheType;

	/**
	 * canBeNull && readOnly
	 */
	public OvhCacheRuleFileTypeEnum fileType;

	/**
	 * canBeNull && readOnly
	 */
	public OvhCacheRuleStatusEnum status;
}

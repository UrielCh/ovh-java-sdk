package net.minidev.ovh.api.xdsl;

/**
 * XDSL Access
 */
public class OvhAccess {
	/**
	 * canBeNull && readOnly
	 */
	public OvhDslTypeEnum accessType;

	/**
	 * canBeNull && readOnly
	 */
	public Long pairsNumber;

	/**
	 * canBeNull && readOnly
	 */
	public OvhAccessCapabilities capabilities;

	/**
	 * canBeNull && readOnly
	 */
	public OvhAccessRoleEnum role;

	/**
	 * canBeNull && readOnly
	 */
	public OvhAddressDetail address;

	/**
	 * Rate limit on the LNS in kbps - Only available if canApplyLnsRateLimit capability is set to true - Must be a multiple of 64 - Min value 64 / Max value 100032
	 *
	 * canBeNull && readOnly
	 */
	public Long lnsRateLimit;

	/**
	 * canBeNull && readOnly
	 */
	public String accessName;

	/**
	 * canBeNull && readOnly
	 */
	public String description;

	/**
	 * canBeNull && readOnly
	 */
	public Boolean ipv6Enabled;

	/**
	 * Whether or not this access is monitored
	 *
	 * canBeNull && readOnly
	 */
	public Boolean monitoring;

	/**
	 * canBeNull && readOnly
	 */
	public String nra;

	/**
	 * canBeNull && readOnly
	 */
	public OvhAccessStatusEnum status;
}

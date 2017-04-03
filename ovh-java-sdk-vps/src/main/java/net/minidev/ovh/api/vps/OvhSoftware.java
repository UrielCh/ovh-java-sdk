package net.minidev.ovh.api.vps;

/**
 * Available softwares on a Template
 */
public class OvhSoftware {
	/**
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * canBeNull && readOnly
	 */
	public OvhSoftwareTypeEnum type;

	/**
	 * canBeNull && readOnly
	 */
	public OvhSoftwareStatusEnum status;
}

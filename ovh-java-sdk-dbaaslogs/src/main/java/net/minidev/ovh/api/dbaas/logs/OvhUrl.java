package net.minidev.ovh.api.dbaas.logs;

/**
 * Web address
 */
public class OvhUrl {
	/**
	 * Web URI
	 *
	 * canBeNull && readOnly
	 */
	public String address;

	/**
	 * Service type
	 *
	 * canBeNull && readOnly
	 */
	public OvhUrlTypeEnum type;
}

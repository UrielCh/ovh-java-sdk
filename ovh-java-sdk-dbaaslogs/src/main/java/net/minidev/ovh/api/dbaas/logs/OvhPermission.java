package net.minidev.ovh.api.dbaas.logs;

/**
 * Role permission
 */
public class OvhPermission {
	/**
	 * Permission UUID
	 *
	 * canBeNull && readOnly
	 */
	public String permissionId;

	/**
	 * Associated Graylog stream
	 *
	 * canBeNull && readOnly
	 */
	public String streamId;

	/**
	 * Associated Graylog dashboard
	 *
	 * canBeNull && readOnly
	 */
	public String dashboardId;

	/**
	 * Associated Elasticsearch alias
	 *
	 * canBeNull && readOnly
	 */
	public String aliasId;

	/**
	 * Associated Elasticsearch index
	 *
	 * canBeNull && readOnly
	 */
	public String indexId;
}

package net.minidev.ovh.api.hosting.web;

import net.minidev.ovh.api.complextype.OvhUnitAndValue;

/**
 * Sqlperso service
 */
public class OvhExtrasqlperso {
	/**
	 * Number of database allowed by this option
	 *
	 * canBeNull && readOnly
	 */
	public Long database;

	/**
	 * Quota size allowed per each database by this option
	 *
	 * canBeNull && readOnly
	 */
	public OvhUnitAndValue<Double> size;

	/**
	 * The extraSqlPerso option name
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * The task ID working on this extraSqlPerso
	 *
	 * canBeNull && readOnly
	 */
	public Long taskId;

	/**
	 * The extraSqlPerso option status
	 *
	 * canBeNull && readOnly
	 */
	public String status;
}

package net.minidev.ovh.api.telephony;

import java.util.Date;

/**
 * Fax campaigns
 */
public class OvhFaxCampaign {
	/**
	 * The reference of the fax campaign
	 *
	 * canBeNull && readOnly
	 */
	public String reference;

	/**
	 * The count of failed faxes in the campaign
	 *
	 * canBeNull && readOnly
	 */
	public Long countFailed;

	/**
	 * The start date of the fax campaign
	 *
	 * canBeNull && readOnly
	 */
	public Date dateStart;

	/**
	 * The name of the fax campaign
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * The total count of faxes in the campaign
	 *
	 * canBeNull && readOnly
	 */
	public Long countTotal;

	/**
	 * The id of the fax campaign
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * The end date of the fax campaign
	 *
	 * canBeNull && readOnly
	 */
	public Date dateEnd;

	/**
	 * The status of the fax campaign
	 *
	 * canBeNull && readOnly
	 */
	public String status;

	/**
	 * The count of success faxes in the campaign
	 *
	 * canBeNull && readOnly
	 */
	public Long countSuccess;
}

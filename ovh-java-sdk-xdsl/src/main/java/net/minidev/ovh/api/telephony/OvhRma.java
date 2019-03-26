package net.minidev.ovh.api.telephony;

import java.util.Date;

/**
 * Current Return Merchandise Authorisation
 */
public class OvhRma {
	/**
	 * Process determined for merchandise returned
	 *
	 * canBeNull && readOnly
	 */
	public OvhRmaReplaceTypeEnum process;

	/**
	 * Reception datetime of the return merchandise authorisation ticket
	 *
	 * canBeNull && readOnly
	 */
	public Date receptionDatetime;

	/**
	 * Offer type of the new merchandise in case of exchange
	 *
	 * canBeNull && readOnly
	 */
	public OvhRmaOfferTypeEnum offerTypeNew;

	/**
	 * Contact information related to the delivery shipping in case of exchange
	 *
	 * canBeNull && readOnly
	 */
	public OvhContact shippingContact;

	/**
	 * Typology process of merchandise return
	 *
	 * canBeNull && readOnly
	 */
	public OvhRmaTypeEnum type;

	/**
	 * New merchandise brand in case of exchange
	 *
	 * canBeNull && readOnly
	 */
	public String newMerchandise;

	/**
	 * Indicates the current status of the RMA with a list of steps
	 *
	 * canBeNull && readOnly
	 */
	public OvhRmaStep[] steps;

	/**
	 * Is the RMA cancellable?
	 *
	 * canBeNull && readOnly
	 */
	public Boolean cancellable;

	/**
	 * Creation datetime of the return merchandise authorisation ticket
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDatetime;

	/**
	 * Merchandise reference
	 *
	 * canBeNull && readOnly
	 */
	public String equipmentReference;

	/**
	 * Return merchandise authorisation identifier
	 *
	 * canBeNull && readOnly
	 */
	public String id;

	/**
	 * Termination datetime of the return merchandise authorisation ticket
	 *
	 * canBeNull && readOnly
	 */
	public Date terminationDatetime;

	/**
	 * Offer type of the return merchandise
	 *
	 * canBeNull && readOnly
	 */
	public OvhRmaOfferTypeEnum offerTypeOld;

	/**
	 * Return merchandise authorisation step
	 *
	 * canBeNull && readOnly
	 */
	public OvhRmaStatusEnum status;
}

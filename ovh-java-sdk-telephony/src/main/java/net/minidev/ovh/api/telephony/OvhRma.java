package net.minidev.ovh.api.telephony;

import java.util.Date;

/**
 * Current Return Merchandise Authorisation
 */
public class OvhRma {
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
	 * Is the RMA cancellable?
	 *
	 * canBeNull && readOnly
	 */
	public Boolean cancellable;

	/**
	 * Merchandise reference
	 *
	 * canBeNull && readOnly
	 */
	public String equipmentReference;

	/**
	 * Creation datetime of the return merchandise authorisation ticket
	 *
	 * canBeNull && readOnly
	 */
	public Date creationDatetime;

	/**
	 * Return merchandise authorisation step
	 *
	 * canBeNull && readOnly
	 */
	public OvhRmaStatusEnum status;

	/**
	 * Offer type of the return merchandise
	 *
	 * canBeNull && readOnly
	 */
	public OvhRmaOfferTypeEnum offerTypeOld;
}

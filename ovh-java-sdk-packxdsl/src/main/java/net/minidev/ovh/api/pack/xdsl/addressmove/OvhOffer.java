package net.minidev.ovh.api.pack.xdsl.addressmove;

import net.minidev.ovh.api.order.OvhPrice;
import net.minidev.ovh.api.xdsl.OvhDeconsolidationEnum;
import net.minidev.ovh.api.xdsl.OvhDslTypeEnum;
import net.minidev.ovh.api.xdsl.OvhLineSectionLength;
import net.minidev.ovh.api.xdsl.eligibility.OvhAddress;
import net.minidev.ovh.api.xdsl.eligibility.OvhLandlineStatusEnum;
import net.minidev.ovh.api.xdsl.eligibility.OvhMeetingSlots;
import net.minidev.ovh.api.xdsl.eligibility.OvhPortability;
import net.minidev.ovh.api.xdsl.eligibility.OvhProviderEnum;

/**
 * An offer
 */
public class OvhOffer {
	/**
	 * Address of the landline
	 *
	 * canBeNull
	 */
	public OvhAddress address;

	/**
	 * The download synchronisation in kbps
	 *
	 * canBeNull
	 */
	public Long syncDownload;

	/**
	 * Whether this is a reseller offer or not
	 *
	 * canBeNull
	 */
	public Boolean reseller;

	/**
	 * DSL technology
	 *
	 * canBeNull
	 */
	public OvhDslTypeEnum type;

	/**
	 * The estimated upload synchronisation in kbps
	 *
	 * canBeNull
	 */
	public Long estimatedUpload;

	/**
	 * The status of the landline
	 *
	 * canBeNull
	 */
	public OvhLandlineStatusEnum lineStatus;

	/**
	 * Available meeting slots for the creation of this offer.
	 *
	 * canBeNull
	 */
	public OvhMeetingSlots meetingSlots;

	/**
	 * Tells whether the tested number can be ported to OVH or not
	 *
	 * canBeNull
	 */
	public OvhPortability portability;

	/**
	 * The upload synchronisation in kbps
	 *
	 * canBeNull
	 */
	public Long syncUpload;

	/**
	 * The unbundling type
	 *
	 * canBeNull
	 */
	public OvhDeconsolidationEnum unbundling;

	/**
	 * Status of the request
	 *
	 * canBeNull
	 */
	public OvhProviderEnum provider;

	/**
	 * The price of this offer
	 *
	 * canBeNull
	 */
	public OvhPrice price;

	/**
	 * The code of the offer
	 *
	 * canBeNull
	 */
	public String offerCode;

	/**
	 * The estimated download synchronisation in kbps
	 *
	 * canBeNull
	 */
	public Long estimatedDownload;

	/**
	 * Detailed information about the sections between the DSLAM and the telephone jack
	 *
	 * canBeNull
	 */
	public OvhLineSectionLength[] lineSectionsLength;

	/**
	 * The NRA of the landline
	 *
	 * canBeNull
	 */
	public String nra;
}

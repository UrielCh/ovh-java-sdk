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
	 * The download synchronisation in kbps
	 *
	 * canBeNull
	 */
	public Long syncDownload;

	/**
	 * Address of the landline
	 *
	 * canBeNull
	 */
	public OvhAddress address;

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
	 * The status of the landline
	 *
	 * canBeNull
	 */
	public OvhLandlineStatusEnum lineStatus;

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
	 * The upload synchronisation in kbps
	 *
	 * canBeNull
	 */
	public Long syncUpload;

	/**
	 * The code of the offer
	 *
	 * canBeNull
	 */
	public String offerCode;

	/**
	 * The price of this offer
	 *
	 * canBeNull
	 */
	public OvhPrice price;

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

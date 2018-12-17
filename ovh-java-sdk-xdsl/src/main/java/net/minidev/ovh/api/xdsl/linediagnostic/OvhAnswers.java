package net.minidev.ovh.api.xdsl.linediagnostic;

import java.util.Date;

/**
 * Customer answers for line diagnostic
 */
public class OvhAnswers {
	/**
	 * Ovh ticket name or ticket ID, only if a ticket is already opened for this problem
	 *
	 * canBeNull
	 */
	public String ovhTicket;

	/**
	 * indicate if customer wants to be informed by sms
	 *
	 * canBeNull
	 */
	public Boolean followBySms;

	/**
	 * Has customer several internal connections ? (on the same place)
	 *
	 * canBeNull
	 */
	public Boolean severalInternetConnections;

	/**
	 * bandwidth download value on proof.ovh.net test
	 *
	 * canBeNull
	 */
	public Long downloadBandwidthTest;

	/**
	 * approximative datetime of problem happening
	 *
	 * canBeNull
	 */
	public Date datetimeOfAppearance;

	/**
	 * morning closing informations or time for the site
	 *
	 * canBeNull
	 */
	public String endMorningHours;

	/**
	 * Has modem kept his synchronization during line port reset ?
	 *
	 * canBeNull
	 */
	public Boolean hasModemKeptSynchronization;

	/**
	 * is secure site ?
	 *
	 * canBeNull
	 */
	public Boolean secureSite;

	/**
	 * is access problem solved ?
	 *
	 * canBeNull
	 */
	public Boolean resolvedAfterTests;

	/**
	 * modem mac address
	 *
	 * canBeNull
	 */
	public String modemMac;

	/**
	 * Modem still synchronized ? Please check once again.
	 *
	 * canBeNull
	 */
	public Boolean modemStillSynchronized;

	/**
	 * bandwidth unit for proof.ovh.net test values
	 *
	 * canBeNull
	 */
	public OvhBandwidthTestUnitEnum bandwidthTestUnit;

	/**
	 * digicode for site entrance
	 *
	 * canBeNull
	 */
	public String siteDigicode;

	/**
	 * id of appointment chosen ("possibleValues" contains choices list with id)
	 *
	 * canBeNull
	 */
	public Long idAppointment;

	/**
	 * afternoon opening informations or time for the site
	 *
	 * canBeNull
	 */
	public String startAfternoonHours;

	/**
	 * days or period where site access is not possible
	 *
	 * canBeNull
	 */
	public String siteClosedDays;

	/**
	 * is non-professional site ?
	 *
	 * canBeNull
	 */
	public Boolean individualSite;

	/**
	 * modem brand and reference
	 *
	 * canBeNull
	 */
	public String modemType;

	/**
	 * Is modem synchronized ? (whatever internet connection)
	 *
	 * canBeNull
	 */
	public Boolean modemIsSynchronized;

	/**
	 * site opening hours or informations
	 *
	 * canBeNull
	 */
	public String siteOpening;

	/**
	 * morning opening informations or time for the site
	 *
	 * canBeNull
	 */
	public String startMorningHours;

	/**
	 * bandwidth upload value on proof.ovh.net test
	 *
	 * canBeNull
	 */
	public Long uploadBandwidthTest;

	/**
	 * customer knows that he can be charged (150 euros HT) if he is responsible for the problem or if tests have not been done correctly ?
	 *
	 * canBeNull
	 */
	public Boolean conditionsAccepted;

	/**
	 * afternoon closing informations or time for the site
	 *
	 * canBeNull
	 */
	public String endAfternoonHours;

	/**
	 * comment will contains all informations needed for intervention and about your access problem
	 *
	 * canBeNull
	 */
	public String comment;

	/**
	 * customer's phone number
	 *
	 * canBeNull
	 */
	public String contactPhone;

	/**
	 * Problem Type on DSL connection
	 *
	 * canBeNull
	 */
	public OvhProblemTypeEnum problemType;
}

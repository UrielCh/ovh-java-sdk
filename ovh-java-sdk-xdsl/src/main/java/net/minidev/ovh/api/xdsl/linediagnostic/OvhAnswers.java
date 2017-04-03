package net.minidev.ovh.api.xdsl.linediagnostic;

import java.util.Date;

/**
 * Customer answers for line diagnostic
 */
public class OvhAnswers {
	/**
	 * Modem still synchronized ? Please check once again.
	 *
	 * canBeNull
	 */
	public Boolean modemStillSynchronized;

	/**
	 * indicate if customer wants to be informed by sms
	 *
	 * canBeNull
	 */
	public Boolean followBySms;

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
	 * Has customer several internal connections ? (on the same place)
	 *
	 * canBeNull
	 */
	public Boolean severalInternetConnections;

	/**
	 * approximative datetime of problem happening
	 *
	 * canBeNull
	 */
	public Date datetimeOfAppearance;

	/**
	 * is non-professional site ?
	 *
	 * canBeNull
	 */
	public Boolean individualSite;

	/**
	 * days or period where site access is not possible
	 *
	 * canBeNull
	 */
	public String siteClosedDays;

	/**
	 * morning closing informations or time for the site
	 *
	 * canBeNull
	 */
	public String endMorningHours;

	/**
	 * modem brand and reference
	 *
	 * canBeNull
	 */
	public String modemType;

	/**
	 * Has modem kept his synchronization during line port reset ?
	 *
	 * canBeNull
	 */
	public Boolean hasModemKeptSynchronization;

	/**
	 * site opening hours or informations
	 *
	 * canBeNull
	 */
	public String siteOpening;

	/**
	 * Is modem synchronized ? (whatever internet connection)
	 *
	 * canBeNull
	 */
	public Boolean modemIsSynchronized;

	/**
	 * is secure site ?
	 *
	 * canBeNull
	 */
	public Boolean secureSite;

	/**
	 * morning opening informations or time for the site
	 *
	 * canBeNull
	 */
	public String startMorningHours;

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
	 * is access problem solved ?
	 *
	 * canBeNull
	 */
	public Boolean resolvedAfterTests;

	/**
	 * customer's phone number
	 *
	 * canBeNull
	 */
	public String contactPhone;

	/**
	 * modem mac address
	 *
	 * canBeNull
	 */
	public String modemMac;
}

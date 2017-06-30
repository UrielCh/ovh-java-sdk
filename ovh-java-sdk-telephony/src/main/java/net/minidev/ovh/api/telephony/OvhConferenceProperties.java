package net.minidev.ovh.api.telephony;

/**
 * Conference properties
 */
public class OvhConferenceProperties {
	/**
	 * The events channel hash
	 *
	 * canBeNull && readOnly
	 */
	public String eventsChannel;

	/**
	 * Whether or not anonmyous participants are allowed
	 *
	 * canBeNull && readOnly
	 */
	public Boolean anonymousRejection;

	/**
	 * Whether or not announce file is played before entrance
	 *
	 * canBeNull && readOnly
	 */
	public Boolean announceFile;

	/**
	 * Whether or not conference is recorded
	 *
	 * canBeNull && readOnly
	 */
	public Boolean recordStatus;

	/**
	 * The announce file name
	 *
	 * canBeNull && readOnly
	 */
	public String announceFilename;

	/**
	 * The conference pin number
	 *
	 * canBeNull && readOnly
	 */
	public String pin;

	/**
	 * The email address to send conference report to
	 *
	 * canBeNull && readOnly
	 */
	public String reportEmail;

	/**
	 * Whether or not participants enter conference room muted
	 *
	 * canBeNull && readOnly
	 */
	public Boolean enterMuted;

	/**
	 * The status of the reporting
	 *
	 * canBeNull && readOnly
	 */
	public OvhConferenceReportStatusEnum reportStatus;

	/**
	 * The conference sounds language
	 *
	 * canBeNull && readOnly
	 */
	public OvhConferenceLanguageEnum language;

	/**
	 * True if you want to receive a white-labelled mail report of your conference
	 *
	 * canBeNull && readOnly
	 */
	public Boolean whiteLabelReport;
}

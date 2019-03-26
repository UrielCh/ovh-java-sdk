package net.minidev.ovh.api.telephony;

/**
 * Conference properties
 */
public class OvhConferenceProperties {
	/**
	 * Whether or not anonmyous participants are allowed
	 *
	 * canBeNull && readOnly
	 */
	public Boolean anonymousRejection;

	/**
	 * The events channel hash
	 *
	 * canBeNull && readOnly
	 */
	public String eventsChannel;

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
	 * The email address to send conference report to
	 *
	 * canBeNull && readOnly
	 */
	public String reportEmail;

	/**
	 * The conference pin number
	 *
	 * canBeNull && readOnly
	 */
	public String pin;

	/**
	 * Whether or not participants enter conference room muted
	 *
	 * canBeNull && readOnly
	 */
	public Boolean enterMuted;

	/**
	 * The announce sound id
	 *
	 * canBeNull && readOnly
	 */
	public Long announceSoundId;

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

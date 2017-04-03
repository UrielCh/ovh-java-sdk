package net.minidev.ovh.api.telephony;

/**
 * Line options
 */
public class OvhLineOptions {
	/**
	 * Nature of the forward when the line is unavailable
	 *
	 * canBeNull && readOnly
	 */
	public OvhLineOptionForwardNatureTypeEnum forwardBackupNature;

	/**
	 * canBeNull && readOnly
	 */
	public String displayNumber;

	/**
	 * Do not display your number
	 *
	 * canBeNull && readOnly
	 */
	public Boolean identificationRestriction;

	/**
	 * Voicemail number to dial from any other line
	 *
	 * canBeNull && readOnly
	 */
	public String voicemailExternalNumber;

	/**
	 * Whether or not the line has restriction on outgoing calls
	 *
	 * canBeNull && readOnly
	 */
	public Boolean callRestrictionOutgoing;

	/**
	 * Nature of the unconditional forward
	 *
	 * canBeNull && readOnly
	 */
	public OvhLineOptionForwardNatureTypeEnum forwardUnconditionalNature;

	/**
	 * The ip restrictions of your line
	 *
	 * canBeNull && readOnly
	 */
	public String[] ipRestrictions;

	/**
	 * Language of the line
	 *
	 * canBeNull && readOnly
	 */
	public OvhLineOptionLanguageEnum language;

	/**
	 * Nature of the forward when the line is busy
	 *
	 * canBeNull && readOnly
	 */
	public OvhLineOptionForwardNatureTypeEnum forwardBusyNature;

	/**
	 * Destination of the forward when the line is unavailable
	 *
	 * canBeNull && readOnly
	 */
	public String forwardBackupNumber;

	/**
	 * canBeNull && readOnly
	 */
	public Boolean doNotDisturb;

	/**
	 * Enable or disable record of outgoing calls
	 *
	 * canBeNull && readOnly
	 */
	public Boolean recordOutgoingCallsBeta;

	/**
	 * Nature of the forward on no-reply
	 *
	 * canBeNull && readOnly
	 */
	public OvhLineOptionForwardNatureTypeEnum forwardNoReplyNature;

	/**
	 * Enable calls forward when the line is unavailable
	 *
	 * canBeNull && readOnly
	 */
	public Boolean forwardBackup;

	/**
	 * Intercom mode: takes automatically the call with the loudspeaker
	 *
	 * canBeNull && readOnly
	 */
	public OvhLineOptionIntercomEnum intercom;

	/**
	 * Enable calls forward when the line is busy
	 *
	 * canBeNull && readOnly
	 */
	public Boolean forwardBusy;

	/**
	 * Destination of the forward on no-reply
	 *
	 * canBeNull && readOnly
	 */
	public String forwardNoReplyNumber;

	/**
	 * Whether or not the line has restriction on incoming calls
	 *
	 * canBeNull && readOnly
	 */
	public Boolean callRestrictionIncoming;

	/**
	 * Codecs preferences
	 *
	 * canBeNull && readOnly
	 */
	public String codecs;

	/**
	 * The default voicemail of the line. It can be the voicemail of any line of your account.
	 *
	 * canBeNull && readOnly
	 */
	public String defaultVoicemail;

	/**
	 * canBeNull && readOnly
	 */
	public Boolean absentSubscriber;

	/**
	 * If the line receives a new call and the line is already in communication, this new call is dispatched once the current call is completed
	 *
	 * canBeNull && readOnly
	 */
	public Boolean callWaiting;

	/**
	 * Destination of the unconditional forward
	 *
	 * canBeNull && readOnly
	 */
	public String forwardUnconditionalNumber;

	/**
	 * Enable unconditional calls forward
	 *
	 * canBeNull && readOnly
	 */
	public Boolean forwardUnconditional;

	/**
	 * Delay before forward on no-reply
	 *
	 * canBeNull && readOnly
	 */
	public Long forwardNoReplyDelay;

	/**
	 * The SIP domain of the line
	 *
	 * canBeNull && readOnly
	 */
	public String domain;

	/**
	 * Destination of the forward when the line is busy
	 *
	 * canBeNull && readOnly
	 */
	public String forwardBusyNumber;

	/**
	 * Enable calls forward on no-reply
	 *
	 * canBeNull && readOnly
	 */
	public Boolean forwardNoReply;

	/**
	 * Voicemail short number to dial from the line
	 *
	 * canBeNull && readOnly
	 */
	public String voicemailInternalNumber;

	/**
	 * Reject anonymous calls
	 *
	 * canBeNull && readOnly
	 */
	public Boolean anonymousCallRejection;

	/**
	 * Disallow outgoing calls password
	 *
	 * canBeNull && readOnly
	 */
	public String lockOutCallPassword;

	/**
	 * Disallow outgoing calls
	 *
	 * canBeNull && readOnly
	 */
	public Boolean lockOutCall;
}

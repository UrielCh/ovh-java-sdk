package net.minidev.ovh.api.telephony;

/**
 * ScreenList capable services
 */
public class OvhScreen {
	/**
	 * canBeNull && readOnly
	 */
	public OvhScreenListChoosingEnum incomingScreenList;

	/**
	 * canBeNull && readOnly
	 */
	public OvhScreenListChoosingEnum outgoingScreenList;

	/**
	 * canBeNull && readOnly
	 */
	public String serviceName;
}

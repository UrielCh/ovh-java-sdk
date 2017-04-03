package net.minidev.ovh.api.telephony;

/**
 * IVR menu entry
 */
public class OvhOvhPabxMenuEntry {
	/**
	 * The DTMF that triggers the action
	 *
	 * canBeNull && readOnly
	 */
	public String dtmf;

	/**
	 * The action triggered by the DTMF
	 *
	 * canBeNull && readOnly
	 */
	public OvhOvhPabxIvrMenuEntryActionEnum action;

	/**
	 * The position of the entry in the menu
	 *
	 * canBeNull && readOnly
	 */
	public Long position;

	/**
	 * The additionnal parameter of the action
	 *
	 * canBeNull && readOnly
	 */
	public String actionParam;

	/**
	 * canBeNull && readOnly
	 */
	public Long entryId;
}

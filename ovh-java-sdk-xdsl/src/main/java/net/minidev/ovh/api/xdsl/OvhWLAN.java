package net.minidev.ovh.api.xdsl;

import net.minidev.ovh.api.xdsl.xdslmodemconfig.OvhChannelModeEnum;
import net.minidev.ovh.api.xdsl.xdslmodemconfig.OvhSecurityTypeEnum;

/**
 * WLAN Configuration of the Modem
 */
public class OvhWLAN {
	/**
	 * How the channel is chosen (Auto / Manual)
	 *
	 * canBeNull && readOnly
	 */
	public OvhChannelModeEnum channelMode;

	/**
	 * Name of the Wifi
	 *
	 * canBeNull && readOnly
	 */
	public String wifiName;

	/**
	 * Security (None | WEP | WPA | WPA2 | WPAandWPA2)
	 *
	 * canBeNull && readOnly
	 */
	public OvhSecurityTypeEnum securityType;

	/**
	 * Choice of a channel (When chosen, channelMode is set to Manual)
	 *
	 * canBeNull && readOnly
	 */
	public Long channel;

	/**
	 * Hide or show the Wifi
	 *
	 * canBeNull && readOnly
	 */
	public Boolean SSIDAdvertisementEnabled;

	/**
	 * WPA or WEP key
	 *
	 * canBeNull && readOnly
	 */
	public String securityKey;

	/**
	 * Service Set Identifier of the WLAN interface
	 *
	 * canBeNull && readOnly
	 */
	public String SSID;

	/**
	 * ID of the ongoing todo (NULL if none)
	 *
	 * canBeNull && readOnly
	 */
	public Long taskId;

	/**
	 * Wifi state
	 *
	 * canBeNull && readOnly
	 */
	public Boolean enabled;
}

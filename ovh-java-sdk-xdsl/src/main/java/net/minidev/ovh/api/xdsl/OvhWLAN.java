package net.minidev.ovh.api.xdsl;

import net.minidev.ovh.api.xdsl.xdslmodemconfig.OvhChannelModeEnum;
import net.minidev.ovh.api.xdsl.xdslmodemconfig.OvhFrequencyEnum;
import net.minidev.ovh.api.xdsl.xdslmodemconfig.OvhSecurityTypeEnum;

/**
 * WLAN Configuration of the Modem
 */
public class OvhWLAN {
	/**
	 * Indicate if frequencies 2.4GHz and 5GHz are agregated
	 *
	 * canBeNull && readOnly
	 */
	public Boolean bandSteering;

	/**
	 * Name of the Wifi
	 *
	 * canBeNull && readOnly
	 */
	public String wifiName;

	/**
	 * How the channel is chosen (Auto / Manual)
	 *
	 * canBeNull && readOnly
	 */
	public OvhChannelModeEnum channelMode;

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
	 * Indicate if it is normal access wifi or guest wifi
	 *
	 * canBeNull && readOnly
	 */
	public Boolean guest;

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
	 * Wifi state
	 *
	 * canBeNull && readOnly
	 */
	public Boolean enabled;

	/**
	 * ID of the ongoing todo (NULL if none)
	 *
	 * canBeNull && readOnly
	 */
	public Long taskId;

	/**
	 * Frequency (2.4GHz | 5GHz)
	 *
	 * canBeNull && readOnly
	 */
	public OvhFrequencyEnum frequency;
}

package net.minidev.ovh.api.xdsl.templatemodem;

import net.minidev.ovh.api.xdsl.xdslmodemconfig.OvhChannelModeEnum;
import net.minidev.ovh.api.xdsl.xdslmodemconfig.OvhFrequencyEnum;

/**
 * WLAN Configuration for Modem Template
 */
public class OvhWLAN {
	/**
	 * Indicate if frequencies 2.4GHz and 5GHz are agregated
	 *
	 * canBeNull
	 */
	public Boolean bandSteering;

	/**
	 * Wifi Name
	 *
	 * canBeNull
	 */
	public String wifiName;

	/**
	 * How the channel is chosen (Auto / Manual)
	 *
	 * canBeNull
	 */
	public OvhChannelModeEnum channelMode;

	/**
	 * Security (None | WPA | WPA2 | WPAandWPA2)
	 *
	 * canBeNull
	 */
	public OvhSecurityTypeEnum securityType;

	/**
	 * Channel number (Useless if channelMode is set to Auto)
	 *
	 * canBeNull
	 */
	public Long channel;

	/**
	 * Control if Wifi is discoverable or hidden
	 *
	 * canBeNull
	 */
	public Boolean SSIDAdvertisementEnabled;

	/**
	 * Indicate if it is normal access wifi or guest wifi
	 *
	 * canBeNull
	 */
	public Boolean guest;

	/**
	 * Encrypted WLAN passphrase
	 *
	 * canBeNull
	 */
	public String securityKey;

	/**
	 * Service Set Identifier of the WLAN interface
	 *
	 * canBeNull
	 */
	public String SSID;

	/**
	 * Wifi state
	 *
	 * canBeNull
	 */
	public Boolean enabled;

	/**
	 * Frequency (2.4GHz | 5GHz)
	 *
	 * canBeNull
	 */
	public OvhFrequencyEnum frequency;
}

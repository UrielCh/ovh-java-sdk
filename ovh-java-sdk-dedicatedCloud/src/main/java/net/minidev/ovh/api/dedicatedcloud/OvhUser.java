package net.minidev.ovh.api.dedicatedcloud;

import net.minidev.ovh.api.dedicatedcloud.user.OvhActivationStateEnum;
import net.minidev.ovh.api.dedicatedcloud.user.OvhStateEnum;

/**
 * Private Cloud User
 */
public class OvhUser {
	/**
	 * Is this User able to access nsx interface (requires NSX option)
	 *
	 * canBeNull && readOnly
	 */
	public Boolean nsxRight;

	/**
	 * Last name of the user
	 *
	 * canBeNull && readOnly
	 */
	public String lastName;

	/**
	 * Defines if the user receives technical alerts
	 *
	 * canBeNull && readOnly
	 */
	public Boolean receiveAlerts;

	/**
	 * Defines if the user is a full admin in readonly
	 *
	 * canBeNull && readOnly
	 */
	public Boolean fullAdminRo;

	/**
	 * Activation state of the user account
	 *
	 * canBeNull && readOnly
	 */
	public OvhActivationStateEnum activationState;

	/**
	 * Login of the user
	 *
	 * canBeNull && readOnly
	 */
	public String login;

	/**
	 * canBeNull && readOnly
	 */
	public Long userId;

	/**
	 * Check if the given Private Cloud user can be enabled or disabled ?
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isEnableManageable;

	/**
	 * First name of the user
	 *
	 * canBeNull && readOnly
	 */
	public String firstName;

	/**
	 * Defines if the user can confirm security tokens (if a compatible option is enabled)
	 *
	 * canBeNull && readOnly
	 */
	public Boolean isTokenValidator;

	/**
	 * Mobile phone number of the user
	 *
	 * canBeNull && readOnly
	 */
	public String phoneNumber;

	/**
	 * Name of the user
	 *
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * Defines if the user can manage the network
	 *
	 * canBeNull && readOnly
	 */
	public Boolean canManageNetwork;

	/**
	 * State of the user account
	 *
	 * canBeNull && readOnly
	 */
	public OvhStateEnum state;

	/**
	 * Defines if the user can manage users rights
	 *
	 * canBeNull && readOnly
	 */
	public Boolean canManageRights;

	/**
	 * Email address of the user
	 *
	 * canBeNull && readOnly
	 */
	public String email;

	/**
	 * Defines if the user can manage ip failovers
	 *
	 * canBeNull && readOnly
	 */
	public Boolean canManageIpFailOvers;
}

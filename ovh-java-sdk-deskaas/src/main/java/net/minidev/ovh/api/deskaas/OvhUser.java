package net.minidev.ovh.api.deskaas;

import net.minidev.ovh.api.deskaas.user.OvhActivationStateEnum;
import net.minidev.ovh.api.deskaas.user.OvhStateEnum;

/**
 * Desktop As A Service User
 */
public class OvhUser {
	/**
	 * canBeNull && readOnly
	 */
	public String name;

	/**
	 * canBeNull && readOnly
	 */
	public OvhStateEnum state;

	/**
	 * canBeNull && readOnly
	 */
	public OvhActivationStateEnum activationState;

	/**
	 * canBeNull && readOnly
	 */
	public Long userId;

	/**
	 * canBeNull && readOnly
	 */
	public String email;
}

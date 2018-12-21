package net.minidev.ovh.api.domain.data;

/**
 * Representation of an .pro Contact Resource
 */
public class OvhProContact {
	/**
	 * Authority that certify your profesional status
	 *
	 * canBeNull && readOnly
	 */
	public String authority;

	/**
	 * Description of your job
	 *
	 * canBeNull && readOnly
	 */
	public String jobDescription;

	/**
	 * License number given by the authority
	 *
	 * canBeNull && readOnly
	 */
	public String licenseNumber;

	/**
	 * .pro Contact ID
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Website of the authority that certify your profesional status
	 *
	 * canBeNull && readOnly
	 */
	public String authorityWebsite;
}

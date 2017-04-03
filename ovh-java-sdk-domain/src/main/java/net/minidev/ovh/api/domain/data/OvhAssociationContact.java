package net.minidev.ovh.api.domain.data;

import java.util.Date;

/**
 * Representation of a Association additional information
 */
public class OvhAssociationContact {
	/**
	 * Page number of the publication of the declaration of the association
	 *
	 * canBeNull && readOnly
	 */
	public String publicationPageNumber;

	/**
	 * Date of the declaration of the association
	 *
	 * canBeNull && readOnly
	 */
	public Date declarationDate;

	/**
	 * Contact ID related to the association contact information
	 *
	 * canBeNull && readOnly
	 */
	public Long contactId;

	/**
	 * Association additional information ID
	 *
	 * canBeNull && readOnly
	 */
	public Long id;

	/**
	 * Date of the publication of the declaration of the association
	 *
	 * canBeNull && readOnly
	 */
	public Date publicationDate;

	/**
	 * Number of the publication of the declaration of the association
	 *
	 * canBeNull && readOnly
	 */
	public String publicationNumber;
}

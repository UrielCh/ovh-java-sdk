package net.minidev.ovh.api.imapcopy;

/**
 * Structure of imapCopy
 */
public class OvhStructImapCopy {
	/**
	 * Password of mailbox
	 *
	 * canBeNull
	 */
	public String password;

	/**
	 * IMAP Serveur of mailbox
	 *
	 * canBeNull
	 */
	public String serverIMAP;

	/**
	 * If true, IMAP Serveur of mailbox
	 *
	 * canBeNull
	 */
	public Boolean SSL;

	/**
	 * Account of mailbox
	 *
	 * canBeNull
	 */
	public String account;
}

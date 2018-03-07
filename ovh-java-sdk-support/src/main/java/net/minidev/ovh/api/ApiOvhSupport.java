package net.minidev.ovh.api;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import net.minidev.ovh.api.support.OvhMessage;
import net.minidev.ovh.api.support.OvhNewMessageInfo;
import net.minidev.ovh.api.support.OvhTicket;
import net.minidev.ovh.api.support.OvhTicketCategoryEnum;
import net.minidev.ovh.api.support.OvhTicketProductEnum;
import net.minidev.ovh.api.support.OvhTicketStatusEnum;
import net.minidev.ovh.api.support.OvhTicketSubCategoryEnum;
import net.minidev.ovh.api.support.OvhTicketTypeEnum;
import net.minidev.ovh.core.ApiOvhBase;
import net.minidev.ovh.core.ApiOvhCore;

/**
 * BasePath:https://eu.api.ovh.com/1.0
 * ResourcePath:/support
 * version:1.0
 */
public class ApiOvhSupport extends ApiOvhBase {
	public ApiOvhSupport(ApiOvhCore core) {
		super(core);
	}

	/**
	 * Create a new ticket
	 *
	 * REST: POST /support/tickets/create
	 * @param subcategory [required] Ticket message subcategory
	 * @param body [required] Ticket message body
	 * @param subject [required] Ticket message subject
	 * @param serviceName [required] Ticket message service name
	 * @param category [required] Ticket message category
	 * @param product [required] Ticket message product
	 * @param type [required] Ticket type (criticalIntervention requires VIP support level)
	 */
	public OvhNewMessageInfo tickets_create_POST(OvhTicketSubCategoryEnum subcategory, String body, String subject, String serviceName, OvhTicketCategoryEnum category, OvhTicketProductEnum product, OvhTicketTypeEnum type) throws IOException {
		String qPath = "/support/tickets/create";
		StringBuilder sb = path(qPath);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "subcategory", subcategory);
		addBody(o, "body", body);
		addBody(o, "subject", subject);
		addBody(o, "serviceName", serviceName);
		addBody(o, "category", category);
		addBody(o, "product", product);
		addBody(o, "type", type);
		String resp = exec(qPath, "POST", sb.toString(), o);
		return convertTo(resp, OvhNewMessageInfo.class);
	}

	/**
	 * Get ticket
	 *
	 * REST: GET /support/tickets/{ticketId}
	 * @param ticketId [required] internal identifier ticket
	 */
	public OvhTicket tickets_ticketId_GET(Long ticketId) throws IOException {
		String qPath = "/support/tickets/{ticketId}";
		StringBuilder sb = path(qPath, ticketId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, OvhTicket.class);
	}

	/**
	 * Reply to ticket
	 *
	 * REST: POST /support/tickets/{ticketId}/reply
	 * @param ticketId [required] internal ticket identifier
	 * @param body [required] text body of ticket response
	 */
	public void tickets_ticketId_reply_POST(Long ticketId, String body) throws IOException {
		String qPath = "/support/tickets/{ticketId}/reply";
		StringBuilder sb = path(qPath, ticketId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "body", body);
		exec(qPath, "POST", sb.toString(), o);
	}

	/**
	 * Get ticket messages
	 *
	 * REST: GET /support/tickets/{ticketId}/messages
	 * @param ticketId [required] internal ticket identifier
	 */
	public ArrayList<OvhMessage> tickets_ticketId_messages_GET(Long ticketId) throws IOException {
		String qPath = "/support/tickets/{ticketId}/messages";
		StringBuilder sb = path(qPath, ticketId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t1);
	}
	private static TypeReference<ArrayList<OvhMessage>> t1 = new TypeReference<ArrayList<OvhMessage>>() {};

	/**
	 * Reopen a ticket
	 *
	 * REST: POST /support/tickets/{ticketId}/reopen
	 * @param ticketId [required] internal ticket identifier
	 * @param body [required] ticket reopen reason
	 */
	public void tickets_ticketId_reopen_POST(Long ticketId, String body) throws IOException {
		String qPath = "/support/tickets/{ticketId}/reopen";
		StringBuilder sb = path(qPath, ticketId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "body", body);
		exec(qPath, "POST", sb.toString(), o);
	}

	/**
	 * Close ticket
	 *
	 * REST: POST /support/tickets/{ticketId}/close
	 * @param ticketId [required] internal ticket identifier
	 */
	public void tickets_ticketId_close_POST(Long ticketId) throws IOException {
		String qPath = "/support/tickets/{ticketId}/close";
		StringBuilder sb = path(qPath, ticketId);
		exec(qPath, "POST", sb.toString(), null);
	}

	/**
	 * Checks whether ticket can be scored
	 *
	 * REST: GET /support/tickets/{ticketId}/canBeScored
	 * @param ticketId [required] internal ticket identifier
	 */
	public Boolean tickets_ticketId_canBeScored_GET(Long ticketId) throws IOException {
		String qPath = "/support/tickets/{ticketId}/canBeScored";
		StringBuilder sb = path(qPath, ticketId);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, Boolean.class);
	}

	/**
	 * Set ticket score
	 *
	 * REST: POST /support/tickets/{ticketId}/score
	 * @param ticketId [required] internal ticket identifier
	 * @param scoreComment [required] ticket comment about the score
	 * @param score [required] ticket score
	 */
	public void tickets_ticketId_score_POST(Long ticketId, String scoreComment, String score) throws IOException {
		String qPath = "/support/tickets/{ticketId}/score";
		StringBuilder sb = path(qPath, ticketId);
		HashMap<String, Object>o = new HashMap<String, Object>();
		addBody(o, "scoreComment", scoreComment);
		addBody(o, "score", score);
		exec(qPath, "POST", sb.toString(), o);
	}

	/**
	 * List support tickets identifiers for this service
	 *
	 * REST: GET /support/tickets
	 * @param subject [required] Search by ticket subject
	 * @param status [required] Status of ticket
	 * @param serviceName [required] Ticket message service name
	 * @param archived [required] Search archived tickets
	 * @param ticketNumber [required] Search by ticket number
	 * @param minCreationDate [required] Minimum creation date
	 * @param maxCreationDate [required] Maximum creation date
	 * @param product [required] Search by ticket product
	 * @param category [required] Search by ticket category
	 */
	public ArrayList<Long> tickets_GET(Boolean archived, OvhTicketCategoryEnum category, Date maxCreationDate, Date minCreationDate, OvhTicketProductEnum product, String serviceName, OvhTicketStatusEnum status, String subject, String ticketNumber) throws IOException {
		String qPath = "/support/tickets";
		StringBuilder sb = path(qPath);
		query(sb, "archived", archived);
		query(sb, "category", category);
		query(sb, "maxCreationDate", maxCreationDate);
		query(sb, "minCreationDate", minCreationDate);
		query(sb, "product", product);
		query(sb, "serviceName", serviceName);
		query(sb, "status", status);
		query(sb, "subject", subject);
		query(sb, "ticketNumber", ticketNumber);
		String resp = exec(qPath, "GET", sb.toString(), null);
		return convertTo(resp, t2);
	}
	private static TypeReference<ArrayList<Long>> t2 = new TypeReference<ArrayList<Long>>() {};
}

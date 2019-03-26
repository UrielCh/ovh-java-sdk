package net.minidev.ovh.api.dedicated.server;

/**
 * A structure describing SMART health disk status
 */
public class OvhRtmDiskSmart {
	/**
	 * temperature
	 *
	 * canBeNull
	 */
	public Long temperature_celsius;

	/**
	 * Multizone error rate
	 *
	 * canBeNull
	 */
	public Long multizone_error_rate;

	/**
	 * Other errors
	 *
	 * canBeNull
	 */
	public Long other_errors;

	/**
	 * Current pending sectors
	 *
	 * canBeNull
	 */
	public Long current_pending_sector;

	/**
	 * Offline uncorrectable
	 *
	 * canBeNull
	 */
	public Long offline_uncorrectable;

	/**
	 * Realocated event count
	 *
	 * canBeNull
	 */
	public Long realocated_event_count;

	/**
	 * Uncorrected read errors
	 *
	 * canBeNull
	 */
	public Long uncorrected_read_errors;

	/**
	 * Offline seek rate
	 *
	 * canBeNull
	 */
	public Long offline_seek_performance;

	/**
	 * Uncorrected write errors
	 *
	 * canBeNull
	 */
	public Long uncorrected_write_errors;

	/**
	 * UDMA crc error
	 *
	 * canBeNull
	 */
	public Long udma_crc_error;
}

package net.minidev.ovh.api.dbaas.logs;

/**
 * Flowgger configuration
 */
public class OvhFlowggerConfiguration {
	/**
	 * Indicates how messages are delimited
	 *
	 * canBeNull && readOnly
	 */
	public OvhFlowggerConfigurationLogFramingEnum logFraming;

	/**
	 * Type of format to decode
	 *
	 * canBeNull && readOnly
	 */
	public OvhFlowggerConfigurationLogFormatEnum logFormat;
}

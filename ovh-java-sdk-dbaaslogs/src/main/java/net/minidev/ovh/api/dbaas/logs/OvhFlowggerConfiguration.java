package net.minidev.ovh.api.dbaas.logs;

/**
 * Flowgger configuration
 */
public class OvhFlowggerConfiguration {
	/**
	 * Number of message to always waits for a full batch to be
        buffered before sending it to Kafka
	 *
	 * canBeNull && readOnly
	 */
	public Long kafkaCoalesce;

	/**
	 * Indicates how messages are splitted
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

	/**
	 * TLS version
	 *
	 * canBeNull && readOnly
	 */
	public OvhFlowggerConfigurationTlsMethodEnum tlsMethod;

	/**
	 * Input type
	 *
	 * canBeNull && readOnly
	 */
	public OvhFlowggerConfigurationTypeEnum type;
}

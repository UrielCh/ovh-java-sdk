package net.minidev.ovh.api.dbaaslogs;

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
	public OvhFlowggerConfigurationLogframing logFraming;

	/**
	 * Type of format to decode
	 *
	 * canBeNull && readOnly
	 */
	public OvhFlowggerConfigurationLogformat logFormat;

	/**
	 * TLS version
	 *
	 * canBeNull && readOnly
	 */
	public OvhFlowggerConfigurationTlsmethod tlsMethod;

	/**
	 * Input type
	 *
	 * canBeNull && readOnly
	 */
	public OvhFlowggerConfigurationType type;
}

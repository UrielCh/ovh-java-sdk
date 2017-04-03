package net.minidev.ovh.api.complextype;

/**
 * A value set tagged with its unit and serie name
 */
public class OvhChartSerie<T> {
	/**
	 * canBeNull
	 */
	public String unit;

	/**
	 * canBeNull
	 */
	public T[] values;

	/**
	 * canBeNull
	 */
	public String serieName;
}

package net.minidev.ovh.api.complextype;

/**
 * A value set tagged with its unit
 */
public class OvhUnitAndValues<T> {
	/**
	 * canBeNull
	 */
	public String unit;

	/**
	 * canBeNull
	 */
	public T[] values;
}

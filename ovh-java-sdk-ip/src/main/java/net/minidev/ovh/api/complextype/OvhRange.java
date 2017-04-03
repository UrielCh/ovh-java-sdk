package net.minidev.ovh.api.complextype;

/**
 * Start and end points (inclusive) of a range
 */
public class OvhRange<T> {
	/**
	 * Start point of the range
	 *
	 * canBeNull
	 */
	public T from;

	/**
	 * End point of the range
	 *
	 * canBeNull
	 */
	public T to;
}

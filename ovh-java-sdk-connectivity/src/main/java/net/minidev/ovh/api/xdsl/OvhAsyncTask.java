package net.minidev.ovh.api.xdsl;

/**
 * Async task
 */
public class OvhAsyncTask<T> {
	/**
	 * Result of the call
	 *
	 * canBeNull
	 */
	public T result;

	/**
	 * Error
	 *
	 * canBeNull
	 */
	public String error;

	/**
	 * Status of the call
	 *
	 * canBeNull
	 */
	public OvhAsyncTaskStatusEnum status;
}

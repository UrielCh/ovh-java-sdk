package net.minidev.ovh;

import java.util.function.Consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.minidev.ovh.core.OvhServiceException;

@FunctionalInterface
public interface ConsumerTry<T> {
	/**
	 * Performs this operation on the given argument.
	 *
	 * @param t the input argument
	 */
	void accept(T t) throws Exception;

	//////////////////
	public final static Logger log = LoggerFactory.getLogger(ConsumerTry.class);

	public static <T> Consumer<T> Try(ConsumerTry<T> c) {
		return (T t) -> {
			try {
				c.accept(t);
			} catch (OvhServiceException e) {
				if (e.isExpired())
					return;
				if (e.isNonExists())
					return;
				log.warn(e.getMessage());
			} catch (Exception e) {
				e.printStackTrace();
				log.warn(e.getMessage());
			}
		};
	}
}

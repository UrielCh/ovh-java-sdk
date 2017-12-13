package net.minidev.ovh.core;

/**
 * This interface can be use to mock API or to add a cache to OVH request.
 * 
 * @author uriel
 *
 */
public interface CacheManager {
	String getCache(String apiPath, String method, String query, Object payload);

	String setCache(String apiPath, String method, String query, Object payload, String data);
}

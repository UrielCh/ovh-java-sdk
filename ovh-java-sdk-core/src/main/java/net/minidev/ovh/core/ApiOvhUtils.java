package net.minidev.ovh.core;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ApiOvhUtils {
	/**
	 * log
	 */
	private final static Logger log = LoggerFactory.getLogger(ApiOvhUtils.class);

	protected final static ObjectMapper mapper;
	static {
		mapper = new ObjectMapper();
		// mapper.getFactory().configure(JsonGenerator.Feature.ESCAPE_NON_ASCII, true);
		mapper.setSerializationInclusion(Include.NON_NULL);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	}

	/**
	 * Convert JSON String to a POJO java
	 * @param in
	 * @param mapTo
	 * @return POJO Object
	 * @throws IOException
	 */
	public static <T> T convertTo(String in, TypeReference<T> mapTo) throws IOException {
		try {
			return mapper.readValue(in, mapTo);
		} catch (Exception e) {
			log.error("Can not convert:{} to {}", in, mapTo, e);
			throw new OvhServiceException("local", "conversion Error to " + mapTo);
		}
	}

	/**
	 * Convert JSON String to a POJO java
	 * @param in
	 * @param mapTo
	 * @return POJO Object
	 * @throws IOException
	 */
	public static <T> T convertTo(String in, Class<T> mapTo) throws IOException {
		try {
			return mapper.readValue(in, mapTo);
		} catch (Exception e) {
			log.error("Can not convert:{} to {}", in, mapTo, e);
			throw new OvhServiceException("local", "conversion Error to " + mapTo);
		}
	}

	/**
	 * Convert Object to JSON String
	 * @param body
	 * @return a String containing the JSON
	 */
	public static String objectJsonBody(Object body) {
		if (body instanceof String)
			return (String) body;
		String txt = "";
		try {
			txt = mapper.writeValueAsString(body);
		} catch (JsonProcessingException e) {
			log.error("objectJsonBody", e);
		}
		return txt;
	}

	/**
	 * Create a new OVH Application using https://eu.api.ovh.com/createApp/
	 * Outout the Application Key and Application Secret in std-out
	 * @param nic
	 * @param password
	 * @throws IOException
	 */
	public void createApplication(String nic, String password) throws IOException {
		String url = "https://eu.api.ovh.com/createApp/";
		Document doc = Jsoup.connect(url)
				.data("nic", nic)
				.data("password", password)
				.data("applicationName", "One Shoot Token")
				.data("applicationDescription", "One Shoot Token")
				.post();
		String body = doc.toString();
		Pattern extract = Pattern.compile(" Application (\\w+)<pre><name>([^<]+)</name></pre>");
		Matcher m = extract.matcher(body);
		String Key = null;
		String Secret = null;
		while (m.find()) {
			String k = m.group(1);
			String v = m.group(2);
			if (k.equals("Key"))
				Key = v;
			if (k.equals("Secret"))
				Secret = v;
		}
		log.warn("Key:{} Secret:{}", Key, Secret);
	}

	/**
	 * Sleep helper that catch exception
	 * @param ms
	 */
	public static void sleep(long ms) {
		try {
			Thread.sleep(ms);
		} catch (Exception e) {
		}
	}
	
	/**
	 * MultiThread safe Digester
	 * @author uriel
	 */
	static class LocalMessageDigest extends ThreadLocal<MessageDigest> {
		String algo;

		public LocalMessageDigest(String algo) {
			this.algo = algo;
		}

		protected synchronized MessageDigest initialValue() {
			try {
				return MessageDigest.getInstance(algo);
			} catch (NoSuchAlgorithmException e) {
				throw new RuntimeException("Fail creating " + algo + " Digester");
			}
		}
	}

	private static ThreadLocal<MessageDigest> SHA1_DIGEST = new LocalMessageDigest("SHA1");

	public static String digestSha1(final byte[] data) {
		MessageDigest sha1 = SHA1_DIGEST.get();
		sha1.reset();
		byte[] digest = sha1.digest(data);
		return encodeHex(digest);
	}

	/**
	 * Hexa chars used ib Hexa encoding
	 */
	static char[] hexa = "0123456789abcdef".toCharArray();

	/**
	 * Encode bytes[] to lowercase hex string
	 * @param bytes
	 * @return lowcased hex value
	 */
	public static String encodeHex(byte[] bytes) {
		char[] result = new char[bytes.length * 2];
		for (int i = 0; i < bytes.length; i++) {
			result[i * 2] = hexa[(bytes[i] & 0xF0) >> 4];
			result[i * 2 + 1] = hexa[bytes[i] & 0x0F];
		}
		return new String(result);
	}
}

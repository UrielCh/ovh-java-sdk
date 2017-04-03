package net.minidev.ovh.api.dnssec;

/**
 * 
                Generated : The key has been created, but has not yet been used for anything.
                ###
                Published : The DNSKEY record is published in the zone, but predecessors of the key may be held in caches.
                ###
                Ready     : The new key data has been published for long enough to guarantee that any previous versions of the DNSKEY RRset have expired from caches.
                ###
                Active    : The key has started to be used to sign RRsets.
                ###
                Retired   : A successor key has become active and this key is no longer being used to generate RRSIGs.
                ###
                Removed   : The key has been removed from the zone.
                ###
                Revoked   : The key is published for a period with the "revoke" bit set as a way of notifying validating resolvers that have configured it as an trust anchor that it is about to be removed from the zone.
 */
public enum OvhKeyStatusEnum {
	active("active"),
	generated("generated"),
	published("published"),
	removed("removed"),
	retired("retired"),
	revoked("revoked");

	final String value;

	OvhKeyStatusEnum(String s) {
		this.value = s;
	}

	public String toString() {
		return this.value;
	}
}

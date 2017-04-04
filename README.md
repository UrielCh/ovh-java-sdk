# ovh-java-sdk
[![Build Status](https://travis-ci.org/UrielCh/ovh-java-sdk.svg?branch=master)](https://travis-ci.org/UrielCh/ovh-java-sdk)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/net.minidev/ovh-java-sdk./badge.svg?style=flat-square)](https://maven-badges.herokuapp.com/maven-central/net.minidev/ovh-java-sdk/)

The complet java SDK for OVH services. Each service had his own java SDK. you can use a couples of service:
    
		<dependency>
			<groupId>net.minidev</groupId>
			<artifactId>ovh-java-sdk-domain</artifactId>
			<version>1.0.0</version>
		</dependency>
		<dependency>
			<groupId>net.minidev</groupId>
			<artifactId>ovh-java-sdk-order</artifactId>
			<version>1.0.0</version>
		</dependency>

or you can load them all with a single dependency:

		<dependency>
			<groupId>net.minidev</groupId>
			<artifactId>ovh-java-sdk</artifactId>
			<version>1.0.0</version>
		</dependency>

but it's not recomended exepted if you use them all.

# usage sample

## Using the all in one SDK:

    ApiOvh api = ApiOvh.getInstance(nic, password);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    for (String serviceName : api.domain.GET(null)) {
        OvhService service = api.domain.serviceName_serviceInfos_GET(serviceName);
        System.out.printf("%s status:%s expire on:%s\n", serviceName, service.status.toString(), sdf.format(service.expiration));
    }


by default you will the the folling error:
    [main] ERROR net.minidev.ovh.core.ApiOvhConfigBasic - No cert directory, can not save consumer_key! please set `consumer_key_storage` variable to a valid directory in your ./ovh.conf, ~/.ovh/config, ~/ovh.conf or /etc/ovh.conf, or in your environ variale OVH_CONSUMER_KEY_STORAGE
    [main] ERROR net.minidev.ovh.core.ApiOvhConfigBasic - no applicationKey, using the defaut one create a key, and set `application_key' and 'application_secret` variable in your ./ovh.conf, ~/.ovh/config, ~/ovh.conf or /etc/ovh.conf, or in your environ variales OVH_APPLICATION_KEY and OVH_APPLICATION_SECRET


because you need ton configure your ovh access, but it will work.

## Using ApiOvhDomain:

    ApiOvhCore core = ApiOvhCore.getInstance(nic, password);
    ApiOvhDomain api = new ApiOvhDomain(core);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    for (String serviceName : api.GET(null)) {
        OvhService service = api.serviceName_serviceInfos_GET(serviceName);
        System.out.printf("%s status:%s expire on:%s\n", serviceName, service.status.toString(), sdf.format(service.expiration));
    }

of cours you get the same results.

# function naming

Calls have the same name thant they REST URL, just replace special chars by _ and postfix the result by the http method name ex:

    POST /telephony/{billingAccount}/conference/{serviceName}/participants/{id}/mute

will be named:

    billingAccount_conference_serviceName_participants_id_mute_POST(billingAccount, serviceName, id, ...)

so that you can easily guesse all the function names.

# services:
all servicise are present exepth auth, that is unbunded in the main ovh-java-sdk-core.

# authentification

you can use:
- a user/password auth in your code
- a nic / CK

# about the API:
- this api had been build to use multi account in the same time.

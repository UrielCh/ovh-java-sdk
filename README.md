<img src="https://api.ovh.com/images/ovh-under-construction.png" alt="OVH logo" height="100" align="left"/>

# Ovh-java-sdk
[![Build Status](https://travis-ci.org/UrielCh/ovh-java-sdk.svg?branch=master)](https://travis-ci.org/UrielCh/ovh-java-sdk)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/net.minidev/ovh-java-sdk./badge.svg?style=flat-square)](https://maven-badges.herokuapp.com/maven-central/net.minidev/ovh-java-sdk/)


The complete java SDK for OVH services. Each service had his own java SDK. you can use a couples of service:
    
	<dependency>
		<groupId>net.minidev</groupId>
		<artifactId>ovh-java-sdk-domain</artifactId>
		<version>0.9</version>
	</dependency>
	<dependency>
		<groupId>net.minidev</groupId>
		<artifactId>ovh-java-sdk-order</artifactId>
		<version>0.9</version>
	</dependency>

Or you can load them all with a single dependency:

	<dependency>
		<groupId>net.minidev</groupId>
		<artifactId>ovh-java-sdk</artifactId>
		<version>0.9</version>
	</dependency>

But it's not recomended, excepted if you use them all.

# Usage sample

## Using the all in one SDK:

List all your domain with their expiration date.

    ApiOvh api = ApiOvh.getInstance(nic, password);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    for (String serviceName : api.domain.GET(null)) {
        OvhService service = api.domain.serviceName_serviceInfos_GET(serviceName);
        System.out.printf("%s status:%s expire on:%s\n", serviceName,
	    service.status.toString(), sdf.format(service.expiration));
    }

by default you will the the folling error:

    [main] ERROR net.minidev.ovh.core.ApiOvhConfigBasic - No cert directory, can not save consumer_key! please set `consumer_key_storage` variable to a valid directory in your ./ovh.conf, ~/.ovh/config, ~/ovh.conf or /etc/ovh.conf, or in your environ variale OVH_CONSUMER_KEY_STORAGE
    [main] ERROR net.minidev.ovh.core.ApiOvhConfigBasic - no applicationKey, using the defaut one create a key, and set `application_key` and `application_secret` variable in your ./ovh.conf, ~/.ovh/config, ~/ovh.conf or /etc/ovh.conf, or in your environ variales OVH_APPLICATION_KEY and OVH_APPLICATION_SECRET

because you need ton configure your ovh access, but it will work.

## Using ApiOvhDomain:

List all your domain with their expiration date, only using `ovh-java-sdk-domain` dependence.

    ApiOvhCore core = ApiOvhCore.getInstance(nic, password);
    ApiOvhDomain api = new ApiOvhDomain(core);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    for (String serviceName : api.GET(null)) {
        OvhService service = api.serviceName_serviceInfos_GET(serviceName);
        System.out.printf("%s status:%s expire on:%s\n", serviceName,
	    service.status.toString(), sdf.format(service.expiration));
    }

you get the same results.

## Configuration file
the configuration is loaded from the following files in this order:
1. ovh.conf *in the current directory*
2. ~/.ovh/config 
3. ~/ovh.conf
4. /etc/ovh.conf

the configutation file can contains those values:
* `endpoint` entry point if usong a single endpoint
* `application_key` your application key
* `application_secret` your application secret
* `consumer_key` your consumer key (CK) if you are using a single account
* `redirection` the redirection linked to your `application_key`
* `consumer_key_storage` a directory to store your CK in multi account mode.

# Function naming

Java method have the same name that their REST URL, just replace special chars by _ and postfix the result by the uppercased http method ex:

    POST /telephony/{billingAccount}/conference/{serviceName}/participants/{id}/mute
    GET  /telephony/{billingAccount}/abbreviatedNumber/{abbreviatedNumber}

will be named:

    billingAccount_conference_serviceName_participants_id_mute_POST(billingAccount, serviceName, id, ...)
    billingAccount_abbreviatedNumber_abbreviatedNumber_GET(billingAccount, abbreviatedNumber)
    
so that you can easily guest all the function names.

 * the namespace are removed form the method name.
 * using the main `ApiOvh` fron `ovh-java-sdk` this called is available through `apiOvh.telephony.billingAccount_abbreviatedNumber_abbreviatedNumber_GET`

# Services:
All servicise are present exepted `ovh-java-sdk-auth`, that one is embedded in the main `ovh-java-sdk-core` artefact.

# Authentification

You can use:
- a `user`/`password` auth in your code, in this case the API generate CK on demande for 15 minutes, and renew then if needed.
- a `nic`/`CK`, in this case you can only use a single account. (will be available in the version 1.0)

# About the API:
- This api is the public version of the Api used to manage resource fron the biggest OVH customer.
- The first version of our API had never been released for the sake of ovh. (We outaged OVH a couple of times with the previous version)
- This api had been build to use multiple account in the same time.

# Supported APIs
Try the official API [api Ovh europe](https://eu.api.ovh.com/).

# License
3-Clause BSD


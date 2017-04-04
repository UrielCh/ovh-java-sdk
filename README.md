# ovh-java-sdk
[![Build Status](https://travis-ci.org/UrielCh/ovh-java-sdk.svg?branch=master)](https://travis-ci.org/UrielCh/ovh-java-sdk)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/net.minidev/ovh-java-sdk./badge.svg?style=flat-square)](https://maven-badges.herokuapp.com/maven-central/net.minidev/ovh-java-sdk./)

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

# authentification

you can use a user/password auth in your code, or a nic / CK

...


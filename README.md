# WeatherforcastWS2
A Maven 3 project on embedded Glassfish to deploy a Java 15 SOAP webservice (jax-ws) and static pages.
Builded with Eclipse 2020-12 (LATEST) and using openjdk-15

## Project created from :
- https://glassfish.org/docs/latest/embedded-server-guide/embedded-server-guide.html#GSESG00038

## Maven Process Infos
- Install and run using the maven goal `install`
- Stop the Glassfish server directly from Eclipse Console or using the Maven goal `embedded-glassfish:stop`

## Actual Issue
The glassfish server start and I have glassfish 404 page on `http://localhost:8080` and on `https://localhost:8181`

I don't understand why the index.html isn't available before go ahead to test the jax-ws Webservice.

If someone have an idea ;)
Thanks in advance...
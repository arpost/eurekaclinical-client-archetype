# ${artifactId}
[Atlanta Clinical and Translational Science Institute (ACTSI)](http://www.actsi.org), [Emory University](http://www.emory.edu), Atlanta, GA

## What does it do?
It provides a REST API client, `${package}.client.Client.java`, for calling the ${serviceArtifactId}'s REST APIs.

## Version 1.0 development series
Latest release: [![Latest release](https://maven-badges.herokuapp.com/maven-central/${groupId}/${artifactId}/badge.svg)](https://maven-badges.herokuapp.com/maven-central/${groupId}/${artifactId})

No final releases yet

## Build requirements
* [Oracle Java JDK 8](http://www.oracle.com/technetwork/java/javase/overview/index.html)
* [Maven 3.2.5 or greater](https://maven.apache.org)

## Runtime requirements
* [Oracle Java JRE 8](http://www.oracle.com/technetwork/java/javase/overview/index.html)

## Building it
The project uses the maven build tool. Typically, you build it by invoking `mvn clean install` at the command line. For simple file changes, not additions or deletions, you can usually use `mvn install`. See https://github.com/eurekaclinical/dev-wiki/wiki/Building-Eureka!-Clinical-projects for more details.

## Maven dependency
```
<dependency>
    <groupId>${groupId}</groupId>
    <artifactId>${artifactId}</artifactId>
    <version>${version}</version>
</dependency>
```

## Developer documentation
* [Javadoc for latest development release](http://javadoc.io/doc/${groupId}/${artifactId}) [![Javadocs](http://javadoc.io/badge/${groupId}/${artifactId}.svg)](http://javadoc.io/doc/${groupId}/${artifactId})

## Getting help
Feel free to contact us at help@eurekaclinical.org.

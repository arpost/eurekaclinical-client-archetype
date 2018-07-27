#set($hash = '#')
${hash} ${artifactId}
[Georgia Clinical and Translational Science Alliance (Georgia CTSA)](http://www.georgiactsa.org), [Emory University](http://www.emory.edu), Atlanta, GA

${hash}${hash} What does it do?
It provides a REST API client, `${package}.client.Client.java`, for calling the ${serviceArtifactId}'s REST APIs.

${hash}${hash} Version 1.0 development series
Latest release: [![Latest release](https://maven-badges.herokuapp.com/maven-central/${groupId}/${artifactId}/badge.svg)](https://maven-badges.herokuapp.com/maven-central/${groupId}/${artifactId})

No final releases yet

${hash}${hash} Build requirements
* [Oracle Java JDK 8](http://www.oracle.com/technetwork/java/javase/overview/index.html)
* [Maven 3.2.5 or greater](https://maven.apache.org)

${hash}${hash} Runtime requirements
* [Oracle Java JRE 8](http://www.oracle.com/technetwork/java/javase/overview/index.html)

${hash}${hash} Building it
The project uses the maven build tool. Typically, you build it by invoking `mvn clean install` at the command line. For simple file changes, not additions or deletions, you can usually use `mvn install`. See https://github.com/eurekaclinical/dev-wiki/wiki/Building-Eureka!-Clinical-projects for more details.

${hash}${hash} Maven dependency
```
<dependency>
    <groupId>${groupId}</groupId>
    <artifactId>${artifactId}</artifactId>
    <version>${version}</version>
</dependency>
```

${hash}${hash} Developer documentation
* [Javadoc for latest development release](http://javadoc.io/doc/${groupId}/${artifactId}) [![Javadocs](http://javadoc.io/badge/${groupId}/${artifactId}.svg)](http://javadoc.io/doc/${groupId}/${artifactId})

${hash}${hash} Getting help
Feel free to contact us at help@eurekaclinical.org.

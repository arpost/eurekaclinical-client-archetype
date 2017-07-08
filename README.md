# Eureka! Clinical Client Archetype
[Atlanta Clinical and Translational Science Institute (ACTSI)](http://www.actsi.org), [Emory University](http://www.emory.edu), Atlanta, GA

## What does it do?
This project is an maven archetype that helps you create a base Eureka! Clinical client project for using a Eureka! Clinical service's REST APIs.

## Version 1.0 development series
Latest release: [![Latest release](https://maven-badges.herokuapp.com/maven-central/org.eurekaclinical/eurekaclinical-client-archetype/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.eurekaclinical/eurekaclinical-client-archetype)

## Version history
No final releases yet

## Requirements
* [Oracle Java JDK 8](http://www.oracle.com/technetwork/java/javase/overview/index.html)
* [Maven 3.2.5 or greater](https://maven.apache.org)

## How to use it
The project can be created as follows:

1) Run the following command with your own values for the properties from groupId down in the example below.
```
mvn archetype:generate -DarchetypeGroupId=org.eurekaclinical \
    -DarchetypeArtifactId=eurekaclinical-client-archetype \
    -DarchetypeVersion=version \
    -DgroupId=org.eurekaclinical \
    -DartifactId=eurekaclinical-microservicename-client \
    -Dpackage=org.eurekaclinical.packagename \
    -DserviceArtifactId=eurekaclinical-microservicename-service \
    -DinceptionYear=four-digit-year \
    -Dversion=1.0-SNAPSHOT
```
Alternatively, run the following and answer the prompts:
```
mvn archetype:generate -DarchetypeGroupId=org.eurekaclinical \
    -DarchetypeArtifactId=eurekaclinical-client-archetype \
    -DarchetypeVersion=version
```
The `groupId`, `artifactId`, `version`, and `package` properties are standard maven properties that specify the groupId,
artifactId and version of the resulting maven project, and the package that all of the project's classes will go in.
The initial version should be `1.0-SNAPSHOT`. The other properties are specific to Eureka! Clinical:
* `inceptionYear`: the four-digit year in which the service's initial release is anticipated. The value that you
specify here goes into the `inceptionYear` tag in the resulting maven project's pom.xml, and it also goes into the
`etc/NOTICE.template` file.
* `serviceArtifactId`: the artifactId of the corresponding service project. Assumes that the service project and this 
project have the same groupId.
 
All Eureka! Clinical core projects should follow the naming convention in the first example above, 
replacing `microservicename` or `MicroserviceName` with a name for your new service with corresponding capitalization.
Projects that are deployment-specific should have their own groupId, and the artifactId should begin with an identifier
for your deployment, e.g., `emory` instead of `eurekaclinical` for services that are specific to a deployment at
Emory University. 

2) A folder with the new project should be created in the current directory, which in this example would be eurekaclinical-microservicename-client. Type `cd eurekaclinical-microservicename-client`.
3) To generate an initial NOTICE file, type `mvn notice:generate`. You will need to rerun this command whenever the project's dependencies change.

The resulting project will be buildable using `mvn clean install`.

# Wildfly Bootable Jar Web App Archetype 
Archetype for generate WildFly Bootable JAR Web Application

## Building the project

* Clone this repository project.
* Do: `mvn clean verify`

## Usage:

     mvn archetype:generate                                  \
      -DarchetypeGroupId=com.xtesoft.archetypes.wildfly.bootable.jar                \
      -DarchetypeArtifactId=wildfly-web-app          \
      -DarchetypeVersion=1.0.0                \
      -DgroupId=sv.com.your.organization                               \
      -DartifactId=yourprojectname 


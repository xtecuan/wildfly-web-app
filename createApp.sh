#!/bin/bash

    mvn archetype:generate                                  \
      -DarchetypeGroupId=com.xtesoft.archetypes.wildfly.bootable.jar                \
      -DarchetypeArtifactId=wildfly-web-app          \
      -DarchetypeVersion=1.0.0                \
      -DgroupId=sv.edu.mined.proyectos                               \
      -DartifactId=nuevo1
#!/bin/bash

# CMDVAR="-Djava.security.egd=file:/dev/./urandom","java -agentlib:jdwp=transport=dt_socket,address=0:8000,server=y,suspend=n -jar"
java $CMDVAR -jar $EUREKA_HOST $EUREKA_PORT $CONSUMER_PORT ./consumer-0.0.1-SNAPSHOT.jar
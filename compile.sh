#!/bin/sh

javac -d target/classes/ -classpath $CATALINA_HOME/lib/servlet-api.jar src/main/java/com/baldurtech/*.java

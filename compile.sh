#!/bin/sh

javac -d target/classes/ -classpath "lib-test/reflections-0.9.9-RC2.jar;$CATALINA_HOME/lib/servlet-api.jar" src/main/java/com/baldurtech/*.java

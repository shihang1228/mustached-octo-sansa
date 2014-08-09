#!/bin/sh

CLASSPATH="lib-test/reflections-0.9.9-RC2.jar;target/classes;target/test-classes"
CLASSPATH="$CLASSPATH;lib-test/guava-15.0.jar"
CLASSPATH="$CLASSPATH;lib-test/javassist-3.18.2-GA.jar"

java -classpath "$CLASSPATH" com.baldurtech.unit.TestCase com.baldurtech
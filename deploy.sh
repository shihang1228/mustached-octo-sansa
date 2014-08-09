#!/bin/sh

mkdir -p $CATALINA_HOME/webapps/mustached-octo-sansa/

cp -r src/main/webapp/* $CATALINA_HOME/webapps/mustached-octo-sansa/
cp -r target/classes $CATALINA_HOME/webapps/mustached-octo-sansa/WEB-INF/

cp -r lib-test $CATALINA_HOME/webapps/mustached-octo-sansa/WEB-INF/
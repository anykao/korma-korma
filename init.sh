#!/usr/bin/env bash

lein localrepo install jars/ojdbc14.jar com.oracle/ojdbc 1.4
lein deps
lein classpath


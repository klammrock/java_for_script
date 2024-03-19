#!/usr/bin/env bash

JAVA_LIBS_DIR=/home/klamm/projects/java/libs

# java -cp "$JAVA_LIBS_DIR/*" --enable-preview --source 21 script.java # 2>/dev/null

export CLASSPATH="$JAVA_LIBS_DIR/*"
java --enable-preview --source 21 script.java # 2>/dev/null

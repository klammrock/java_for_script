#!/usr/bin/env bash

JAVA_LIBS_DIR=/home/klamm/projects/java/libs

# java -cp "$JAVA_LIBS_DIR/*" --enable-preview --source 21 script.java # 2>/dev/null

export CLASSPATH="$JAVA_LIBS_DIR/*"
# java --enable-preview --source 21 script.java # 2>/dev/null
# for java 24
java --enable-preview script.java # 2>/dev/null

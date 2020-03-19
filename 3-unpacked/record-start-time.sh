#!/bin/sh

set -e

tmpfile=$(mktemp /tmp/tilt-example-java.XXXXXX)
cat src/main/java/dev/tilt/example/IndexController.java | \
    sed -e "s/startTimeSecs = .*;/startTimeSecs = $(date +%-s);/" | \
    sed -e "s/startTimeNanos = .*;/startTimeNanos = $(date +%-N);/" > \
    $tmpfile
mv $tmpfile src/main/java/dev/tilt/example/IndexController.java

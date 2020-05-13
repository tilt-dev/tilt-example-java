import re
import time

filename = "src/main/java/dev/tilt/example/IndexController.java"
f = open(filename, "r")
contents = f.read()
f.close()

timestamp_sec = int(time.time())
timestamp_nano = (float(time.time()) - timestamp_sec) * 1000 * 1000 * 1000
contents = re.sub(r'startTimeSecs = .*;',
                  "startTimeSecs = %d;" % timestamp_sec,
                  contents)
contents = re.sub(r'startTimeNanos = .*;',
                  "startTimeNanos = %d;" % timestamp_nano,
                  contents)

f = open(filename, "w")
f.write(contents)
f.close()
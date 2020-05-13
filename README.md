# tilt-example-java

[![Build Status](https://circleci.com/gh/windmilleng/tilt-example-java/tree/master.svg?style=shield)](https://circleci.com/gh/windmilleng/tilt-example-java)

An example project that demonstrates a live-updating Java server in Kubernetes. Read [doc](https://docs.tilt.dev/example_java.html).

We used [Spring Initializr](https://start.spring.io/) to bootstrap the project,
then added Docker & Kubernetes configs for running it in Kubernetes.

To run these examples, you should also have:
- javac (a JDK)
- unzip
- rsync
- python

## Fastest Deployment

This progression of examples shows how to start, and incrementally update
your project for live updates.

- [0-base](0-base): The simplest way to start
- [1-measured](1-measured): Use `local_resource` to measure your deployment time
- [2-optimized](2-optimized): Compile executable Jars and copy them into Docker
- [3-unpacked](3-unpacked): Unpack the executable Jar into Docker layers
- [4-recommended](4-recommended): Live update executable Jars

## Other Configurations

- [3-recommended](3-recommended): The recommended setup from an earlier version
  of this guide.
- [101-jib](101-jib): An example of how to integrate Tilt with the [Jib Java
  image builder](https://github.com/GoogleContainerTools/jib)
- [102-jib-live-update](102-jib-live-update): An example of how to use
  live_update with Jib. It requires a lot of knowledge of Jib internals, but you
  can make it work!

## License

Copyright 2020 tilt.dev

Licensed under [the Apache License, Version 2.0](LICENSE)

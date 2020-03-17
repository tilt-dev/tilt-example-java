# tilt-example-java

An example project that demonstrates a live-updating Java server in Kubernetes.

We used [Spring Initializr](https://start.spring.io/) to bootstrap the project,
then added Docker & Kubernetes configs for running it in Kubernetes.

## Fastest Deployment

This progression of examples shows how to start, and incrementally update
your project for live updates.

- [0-base](0-base): The simplest way to start
- [1-measured](1-measured): Use `local_resource` to measure your deployment time
- [2-optimized](2-optimized): Compile executable Jars and copy them into Docker
- [3-recommended](3-recommended): Live update executable Jars

## Other Configurations

- [101-jib](101-jib): An example of how to integrate Tilt with the [Jib Java image builder](https://github.com/GoogleContainerTools/jib)

## License

Copyright 2020 tilt.dev

Licensed under [the Apache License, Version 2.0](LICENSE)

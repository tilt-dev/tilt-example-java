# Quarkus Live Update with Tilt

A demo to show how sync local [Quarkus](https://quarkus.io/) sources with pod running in kubernetes and use the `quarkus:dev` mode to hot reload the changes.

## Important

This Dockerfile is used for development purposes, in order to have a production image, you may consider to use [Native builds](https://quarkus.io/guides/building-native-image)

## Pre-requiste

- Have [tilt](https://docs.tilt.dev/install.html) properly installed and a kubernetes environment. Ensure that you have `KUBECONFIG` environment var or is in the proper kube context.
- Have Docker or Buildah properly installed.

## Running the demo

Clone the demo sources locally:

```
git clone https://github.com/tilt-dev/tilt-example-java.git
cd 201-quarkus-live-update/
```

If it's being used docker as builder, start the environment with:

```
tilt up
```

If it's being used buildah as builder, start the environment with:

```
tilt up -f Tiltfile.buildah
```

The command creates the following resources:

- a kubernetes deployment called **quarkus-sync-demo**
- a persistence volume claim called `m2-cache` to cache the maven artifacts for faster builds

Check the stats of the application:

```
kubectl get pods -w ##(1)
```

1. A successful start will have **quarkus-sync-demo** in **Running** status

| Note | You can terminate the `kubectl get pods -w` using the command CTRL+C |
| ---- | ------------------------------------------------------------ |
|      |                                                              |

Lets see the sync in action, open a new terminal and navigate to `$PROJECT_HOME`. Run the following command:

```
./poll.sh ##(1)
```

1. this will keep calling the kubernetes service once in every 5 seconds

Without any change you should be seeing response as `hello` getting printed every 5 seconds.

You can now make changes to the sources e.g change `hello` in GreetingResource.java to `namaste`

After few seconds you will see your polling window sending the new response `namaste`

## Cleanup

```
tilt down -f <Tiltfile>
```

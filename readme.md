# ![RealWorld Example App](logo.png)

> ### Java EE codebase containing real world examples (CRUD, auth, advanced patterns, etc) that adheres to the [RealWorld](https://github.com/gothinkster/realworld) spec and API.


### [Demo](https://github.com/gothinkster/realworld)&nbsp;&nbsp;&nbsp;&nbsp;[RealWorld](https://github.com/gothinkster/realworld)


This codebase was created to demonstrate a fully fledged fullstack application built with Java EE including CRUD operations, authentication, routing, pagination, and more.

We've gone to great lengths to adhere to the Java EE community styleguides & best practices.

For more information on how to this works with other frontends/backends, head over to the [RealWorld](https://github.com/gothinkster/realworld) repo.


# How it works

The application uses Java EE in a [Wildfly Swarm](http://wildfly-swarm.io) container.

Technologies used:

* Java
* Maven
* [Junit 5](https://junit.org/junit5/)
* JAX-RS
* Codeship

# Getting started

You need Java and Maven installed.

    mvn wildfly-swarm:run
    open http://localhost:8080/hello


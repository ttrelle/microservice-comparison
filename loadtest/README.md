# Load Tests

Tests are performed with [k6](http://www.k6.io).

## Setup

On Mac use brew:

```
$ brew tap loadimpact/k6
$ brew install k6
```

## Run Tests

This will perform GET request to `http://localhost:8080/hello` for 2 minutes using 10 virtual users:

```
k6 run -d 2m -vus 10 localhost.js
```

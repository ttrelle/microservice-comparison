# Load Tests

Tests are performed with [k6](http://www.k6.io).

## Setup

Fetch the lastest k6 Docker image:

```
docker pull loadimpact/k6
```

## Run Tests

```
docker run --name k6-worker loadimpact/k6 -run -d 2m -vus 10 - < localhost.js
```

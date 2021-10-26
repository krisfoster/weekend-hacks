A Java/Micronaut version of https://github.com/oracle-devrel/weekend-hacks

Run with `./gradlew run`

Compile with GraalVM Native Image to a native executable with `./gradlew nativeImage`

Exercise the app (assuming running on localhost:8080):
* `curl http://localhost:8080` to fetch the index.html
* `curl http://localhost:8080/candy`
* `curl -X POST -H "Content-Type: application/json" -d '{"speed":5}' http://localhost:8080/auto`
* `curl -X POST -H "Content-Type: application/json" -d '{"status":"green"}' http://localhost:8080/whattodo`
* `curl http://localhost:8080/query`


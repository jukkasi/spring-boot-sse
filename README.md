For Spring Boot 2.2

1. Set Spring Boot version 2.2.0.RC1 in pom.xml
1. Start application
2. Use Chrome http://localhost:8080/index.html
3. Open devtools -> Network
4. "sse" request fails for 406 and does not retry, in application log
Resolved [org.springframework.web.HttpMediaTypeNotAcceptableException: Could not find acceptable representation]

For Spring Boot 2.1

1. Set Spring Boot version 2.1.9.RELEASE in pom.xml
2. Start application
3. Use Chrome http://localhost:8080/index.html
4. Open devtools -> Network
5. "sse" request succeeds
6. new "sse" request is created every 30 seconds
7. all "sse" requests return 200 OK

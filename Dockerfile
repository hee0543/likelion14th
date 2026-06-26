FROM eclipse-temurin:21-jre
# 자바 설정 먼저 쌓고..

WORKDIR /app

COPY build.libs/*.jar /app/app.jar

ENTRYPOINT ["java","-jar","/app/app.jar"]
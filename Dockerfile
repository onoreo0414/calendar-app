# ベースイメージに OpenJDK 17 を使用
FROM openjdk:17-jdk-slim

# 作業ディレクトリを /app に設定
WORKDIR /app

# Maven でビルドした JAR をコピー
COPY target/calendar-app-0.0.1-SNAPSHOT.jar app.jar

# アプリを起動
ENTRYPOINT ["java","-jar","app.jar"]

# OpenJDK 17 をベースに使用
FROM eclipse-temurin:17-jdk-jammy

# 作業ディレクトリ
WORKDIR /app

# Maven でビルドした JAR をコピー
COPY target/calendar-app-0.0.1-SNAPSHOT.jar app.jar

# Render が割り当てるポートを使用
EXPOSE 8080

# コンテナ起動時に Spring Boot アプリを実行
ENTRYPOINT ["java", "-jar", "app.jar"]

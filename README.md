# MathUtil — JUnit 5

Branch này chứa phiên bản MathUtil sử dụng **Maven**, **Java 21** và **JUnit 5** để minh họa unit testing và Continuous Integration với GitHub Actions.

## Công nghệ sử dụng

- Java 21
- Maven
- JUnit Jupiter 5.8.2
- Maven Surefire Plugin
- GitHub Actions

## Cấu trúc chính

```text
src/main/java/   Mã nguồn ứng dụng
src/test/java/   Các bài kiểm thử JUnit 5
pom.xml          Cấu hình Maven và dependencies
```

## Chạy project

Yêu cầu máy đã cài JDK 21 và Maven.

```bash
git clone --branch mathutil-junit5 https://github.com/MinhThuc1/math-util.git
cd math-util
mvn clean test
```

Để build file JAR:

```bash
mvn clean package
```

## Các phiên bản khác

- [Branch `math-util`](https://github.com/MinhThuc1/math-util/tree/math-util): phiên bản sử dụng Ant và JUnit 4.
- [Branch `main`](https://github.com/MinhThuc1/math-util): trang giới thiệu và điều hướng của repository.

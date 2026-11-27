# MathUtil

Repository này lưu trữ hai phiên bản của project MathUtil. Branch `main` chỉ dùng làm trang giới thiệu; mã nguồn nằm trong các branch bên dưới.

## Chọn phiên bản

### [`math-util`](https://github.com/MinhThuc1/math-util/tree/math-util)

Phiên bản ban đầu sử dụng **Java**, **Apache Ant** và **JUnit 4**.

```bash
git clone --branch math-util https://github.com/MinhThuc1/math-util.git
```

### [`mathutil-junit5`](https://github.com/MinhThuc1/math-util/tree/mathutil-junit5)

Phiên bản sử dụng **Java 21**, **Maven** và **JUnit 5**, kèm cấu hình Continuous Integration bằng GitHub Actions.

```bash
git clone --branch mathutil-junit5 https://github.com/MinhThuc1/math-util.git
cd math-util
mvn clean test
```

> Hãy chọn một trong hai branch trên để xem mã nguồn và hướng dẫn chi tiết của từng phiên bản.

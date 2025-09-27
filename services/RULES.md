## Lưu ý trước khi code

1. Vì là đang chạy CI nên khi ae tạo project mới, cần khai báo tên project vào .github/workflow/java-ci/yml, dòng 21 (matrix.service) để github nó tích hợp. Phải đúng tên thì mới tích hợp được

Ví dụ:

```yml
jobs:
  spring-boot-build:
    runs-on: ubuntu-latest
    strategy:
      fail-fast: false
      matrix:
        service: [
            EurekaServer, # Dự án EurekaServer, nằm ở src/EurekaServer
            APIGateway, # Dự án APIGateway, nằm ở src/APIGatway
            book-service,
            member-service,
            loan-service,
            fine-service,
            notification-service,
          ]
```

2. Khi tạo project mới, không cần import springdoc openapi hay sử dụng config cloud và phiên bản spring boot thủ công nữa. Thay vào đấy thì import file pom.xml cùng cấp với thư mục của các service.

Ví dụ:
Gốc:

```xml
<parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.5.6</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>
```

Sửa thành:

```xml
<parent>
        <groupId>com.se1853_jv</groupId>
        <artifactId>microservice-project</artifactId>
        <version>1.0.0</version>
        <relativePath>../pom.xml</relativePath>
    </parent>
```

Đồng thời xóa hết các dependency management bị trùng mà pom.xml cha đã quy định rồi

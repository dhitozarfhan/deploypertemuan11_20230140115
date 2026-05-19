# Praktikum 11 - Spring Boot Authentication

Proyek ini adalah implementasi dari sistem autentikasi dasar menggunakan Java Spring Boot dan database PostgreSQL.

## Screenshot Hasil

### 1. Halaman Login
![Halaman Login](./screenshots/login.png)

### 2. Halaman Register
![Halaman Register](./screenshots/register.png)

### 3. Halaman Home
![Halaman Home](./screenshots/home.png)

### 4. Running App di WSL
![Running di WSL](./screenshots/running_wsl.png)

### 5. Isi File `docker-compose.yml`
![Docker Compose](./screenshots/docker_compose.png)

*(Isi file `docker-compose.yml` juga dapat dilihat di repository ini)*
```yaml
version: '3.8'

services:
  db:
    image: postgres:15
    container_name: praktikum_db_container
    environment:
      POSTGRES_DB: praktikum_db
      POSTGRES_USER: praktikum_user
      POSTGRES_PASSWORD: 12345
    ports:
      - "5433:5432"
    volumes:
      - postgres_data:/var/lib/postgresql/data

volumes:
  postgres_data:
```

### 6. Isi Data pada Tabel
![Isi Tabel Database](./screenshots/database_table.png)

---
**Catatan:** Silakan letakkan gambar-gambar screenshot asli Anda di dalam folder `screenshots/` dengan nama file yang sesuai agar dapat tampil di README ini.

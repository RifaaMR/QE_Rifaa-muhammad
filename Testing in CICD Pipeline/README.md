                                                            Rangkuman

1. CICD (Continuous Integration - Continuous Delivery - Continuous Deployment) merupakan suatu metode untuk delivery software kepada pengguna dengan meminimalisir campur tangan manusia
2. CI terletak pada flow bagian awal yang terdiri dari Build, Test, dan Merging dan dilanjutkan oleh CD yang secara otomatis melakukan deployment ke production atau server tujuan
3. Salah satu cara menerapkan github pipeline adalah dengan membuat file ci.yml yang berisi command dan konfigurasi deployment dan pengetesan dalam bahasa yaml

### Manfaat Implementasi CI (Continuous Integration)

1. **Mendeteksi Bug pada Tahap Awal**: Bug yang ditemukan lebih awal akan menyebabkan kerusakan yang lebih sedikit.
2. **Mengurangi Jumlah Bug**: Implementasi CI membantu menurunkan jumlah bug secara keseluruhan.
3. **Proses Pengembangan Lebih Transparan**: Tim akan diberitahu ketika build gagal dan penyebabnya, sehingga proses menjadi lebih transparan.
4. **Efisien**: Karena seluruh proses diotomatisasi, pengujian manual menjadi lebih sedikit.

### Manfaat Implementasi CD (Continuous Delivery/Deployment)

1. **Mengurangi Risiko**: Otomatisasi proses penerapan yang rumit mengurangi kemungkinan kesalahan manusia, memastikan setiap penerapan konsisten.
2. **Penerapan yang Mudah dan Tim yang Lebih Bahagia**: Penerapan otomatis membuat proses lebih lancar dan meningkatkan kepuasan tim.
3. **Mengurangi Biaya**: Otomatisasi proses penerapan membantu mengurangi biaya operasional.
4. **Proses yang Sepenuhnya Otomatis dan Transparan**: Semua langkah dalam proses penerapan menjadi otomatis dan mudah dipantau.
5. **Frekuensi Rilis Lebih Sering**: Otomatisasi memungkinkan rilis dilakukan lebih sering.

### Biaya dalam Tahap Continuous Integration

1. **Penulisan Tes Otomatis oleh Tim**: Tim harus menulis tes otomatis.
2. **Server untuk Tes Otomatis**: Dibutuhkan server untuk menjalankan tes otomatis.
3. **Penggabungan Perubahan oleh Pengembang**: Pengembang harus sering menggabungkan perubahan mereka.

### Biaya dalam Tahap Continuous Delivery/Deployment

1. **Dasar yang Kuat dalam Proses CI**: Fondasi yang kuat dalam proses CI sangat penting.
2. **Budaya Pengujian yang Optimal**: Budaya pengujian harus berada pada tingkat terbaik.
3. **Dokumentasi yang Sering Diperbarui**: Dokumentasi harus sering diperbarui agar tetap sesuai dengan penerapan.

### Alat untuk CI/CD Pipeline

1. **Jenkins**
2. **Bamboo**
3. **CircleCI**
4. **AWS CodeBuild**
5. **Azure DevOps**
6. **GitLab CI/CD**
7. **Travis CI**
8. **GitHub Actions**

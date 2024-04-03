Rangkuman

1. Definisi: Performance testing adalah jenis pengujian perangkat lunak yang bertujuan untuk mengevaluasi kinerja sistem dalam hal responsivitas, keandalan, efisiensi, dan skalabilitas di bawah berbagai kondisi beban kerja.
2. Tujuan:
   • Memvalidasi apakah sistem memenuhi persyaratan kinerja yang ditetapkan.
   • Mengidentifikasi dan mengatasi masalah kinerja yang mungkin terjadi sebelum sistem diluncurkan ke produksi.
   • Menganalisis dan memahami kinerja sistem dalam kondisi normal dan puncak.
3. Tipe Pengujian:
   • Load testing : merupakan pengujian yang dilakukan untuk memahami perilaku sistem dalam keadaan beban tertentu. Load testing menentukan kelakuan sistem pada saat kondisi normal dan puncak. Idealnya untuk mengetahui jumlah traffic yang ada di prod sebagai nilai di load test.
   • Smoke testing : dilakukan untuk verify script yang sudah dibuat, apakah sistem tersebut dapat mengahandle minimal load tanpa masalah sama sekali. Biasanya hany 1-2Vus.
   • Stress testing : dilakukan untuk mengamati kemampuan dan kestabilan sistem pada saat kondisi ekstrem. Dilakukan bertahap menuju load normal, puncak, dan melebihinya, lalu turun untuk melihat proses pemulihan.
   • Spike testing : mirip stress test namun kenaikan langsung menuju melibihi puncak dilakukan dalam waktu singkat dan tanpa waktu scale out.
   • Soak testing : untuk mengetahui reanility Ketika dalam tekanan di bawah puncak dalam jangka Panjang (>= 1 jam). Dapat mengetahui apakah ada bug pada race condition, memori leaks, db connection dsb.
   • Endurance Testing: Menguji kinerja sistem selama periode waktu yang lama untuk memastikan tidak adanya penurunan kinerja seiring waktu.
   • Volume Testing: Menguji kinerja sistem saat diberi jumlah data yang besar.
4. Langkah-langkah Pengujian:
   • Perencanaan: Menetapkan tujuan pengujian, mengidentifikasi skenario pengujian, dan menentukan lingkungan pengujian.
   • Pengaturan: Mempersiapkan environment pengujian, mengkonfigurasi alat pengujian, dan mempersiapkan data tes.
   • Eksekusi: Menjalankan skenario pengujian dengan berbagai tingkat beban dan kondisi.
   • Pemantauan dan Analisis: Memantau kinerja sistem secara real-time, menganalisis hasil pengujian, dan mengidentifikasi masalah kinerja.
   • Pelaporan: Menyusun laporan hasil pengujian, termasuk temuan, rekomendasi perbaikan, dan metrik kinerja.
5. Alat Performance Testing: Ada berbagai alat yang tersedia untuk melakukan performance testing, termasuk JMeter, K6, Locust, Gatling, LoadRunner, BlazeMeter, dan Apache Bench. Alat ini menyediakan fungsionalitas untuk membuat, menjalankan, dan menganalisis skenario pengujian dengan berbagai tingkat kompleksitas.
6. Manfaat:
   • Mendeteksi dan mengatasi masalah kinerja sebelum peluncuran produk.
   • Meningkatkan kepuasan pengguna dengan memastikan kinerja sistem yang baik.
   • Mengurangi risiko downtime atau kegagalan sistem di masa depan.
   • Membangun kepercayaan dan reputasi perusahaan dalam hal kinerja produk.

1. Jelaskan jenis-jenis dari performance testing.
   Jawab
   • Load testing : merupakan pengujian yang dilakukan untuk memahami perilaku sistem dalam keadaan beban tertentu. Load testing menentukan kelakuan sistem pada saat kondisi normal dan puncak. Idealnya untuk mengetahui jumlah traffic yang ada di prod sebagai nilai di load test.
   • Smoke testing : dilakukan untuk verify script yang sudah dibuat, apakah sistem tersebut dapat mengahandle minimal load tanpa masalah sama sekali. Biasanya hany 1-2Vus.
   • Stress testing : dilakukan untuk mengamati kemampuan dan kestabilan sistem pada saat kondisi ekstrem. Dilakukan bertahap menuju load normal, puncak, dan melebihinya, lalu turun untuk melihat proses pemulihan.
   • Spike testing : mirip stress test namun kenaikan langsung menuju melibihi puncak dilakukan dalam waktu singkat dan tanpa waktu scale out.
   • Soak testing : untuk mengetahui reanility Ketika dalam tekanan di bawah puncak dalam jangka Panjang (>= 1 jam). Dapat mengetahui apakah ada bug pada race condition, memori leaks, db connection dsb.

2. Jelaskan berbagai tantangan dalam melakukan performance testing.
   Jawab
   • Biaya: Persiapan environment terpisah dan penggunaan infrastruktur cloud dapat menjadi biaya tambahan yang signifikan, terutama jika harus meniru lingkungan produksi dengan akurasi yang tinggi.
   • Kompleksitas Konfigurasi: Mengatur environment yang terisolasi dan konfigurasi alat pengujian performance memerlukan pemahaman yang mendalam tentang infrastruktur sistem dan kebutuhan pengujian.
   • Waktu dan Sumber Daya: Proses persiapan dan eksekusi performance testing membutuhkan waktu dan sumber daya yang signifikan, termasuk pengumpulan data, analisis hasil, dan iterasi untuk meningkatkan kinerja sistem.
   • Skalabilitas: Mengukur kinerja sistem pada skala yang besar dan memprediksi bagaimana sistem akan bertindak saat menghadapi lonjakan lalu lintas adalah tantangan tersendiri, terutama untuk aplikasi yang melayani jumlah pengguna yang sangat besar.
   • Ketersediaan Sumber Daya: Kadang-kadang sulit untuk mendapatkan akses ke sumber daya yang diperlukan, seperti hardware khusus atau lingkungan yang mirip dengan produksi, yang dapat memperlambat atau menghambat proses pengujian.

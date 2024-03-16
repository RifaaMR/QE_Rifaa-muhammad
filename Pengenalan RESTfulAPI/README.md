                                    Rangkuman Materi RESTful API

1. Definisi: RESTful API (Representational State Transfer) adalah pendekatan arsitektur perangkat lunak untuk merancang sistem berbasis web yang berfokus pada sumber daya dan aksi yang dilakukan pada sumber daya tersebut. Ini menggunakan metode HTTP standar untuk berkomunikasi antara klien dan server.
2. Karakteristik Utama:
   • Berbasis pada HTTP: RESTful API menggunakan protokol HTTP untuk komunikasi antara klien dan server, memanfaatkan metode HTTP seperti GET, POST, PUT, DELETE.
   • Representasi Sumber Daya: Sumber daya (resource) dalam RESTful API direpresentasikan sebagai URI (Uniform Resource Identifier), dan klien berinteraksi dengan sumber daya menggunakan operasi HTTP.
   • Stateless: Setiap permintaan dari klien ke server harus mengandung semua informasi yang diperlukan untuk memahami dan memproses permintaan tersebut. Server tidak menyimpan status sesi klien di antara permintaan.
3. Operasi CRUD: RESTful API menyediakan operasi CRUD (Create, Read, Update, Delete) untuk mengelola sumber daya. Ini sesuai dengan operasi HTTP, di mana:
   • GET: Digunakan untuk membaca data atau mendapatkan representasi sumber daya.
   • POST: Digunakan untuk membuat sumber daya baru.
   • PUT: Digunakan untuk memperbarui atau mengganti sumber daya yang ada.
   • DELETE: Digunakan untuk menghapus sumber daya.
4. Format Data: RESTful API sering menggunakan format data yang umum seperti JSON (JavaScript Object Notation) atau XML (eXtensible Markup Language) untuk pertukaran data antara klien dan server. JSON menjadi lebih umum digunakan karena lebih ringan dan mudah dibaca oleh manusia dan diurai oleh komputer.
5. Keamanan: RESTful API dapat diamankan menggunakan berbagai metode, seperti otentikasi HTTP (Basic, Digest, Token), HTTPS, dan OAuth untuk mengontrol akses ke sumber daya dan melindungi integritas data.
6. HATEOAS (Hypermedia As The Engine Of Application State): Prinsip ini menekankan bahwa API harus menyediakan hyperlink ke sumber daya terkait, sehingga klien dapat menavigasi aplikasi tanpa bergantung pada pengetahuan sebelumnya tentang struktur URI.
7. Contoh Implementasi: Banyak aplikasi web dan layanan menggunakan RESTful API untuk menyediakan akses ke fungsionalitas dan data. Contoh termasuk layanan web seperti Twitter, Facebook, Google Maps, dan banyak lagi.

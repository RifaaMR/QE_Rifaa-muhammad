                                                    Rangkuman

Iterable

1. Definisi: Interface Iterable adalah salah satu interface yang disediakan oleh Java Collections Framework. Merupakan metode, yaitu iterator(), yang mengembalikan iterator yang dapat digunakan untuk mengiterasi melalui elemen-elemen dalam suatu kumpulan data.
2. Penggunaan: Iterable digunakan sebagai dasar untuk kumpulan data yang dapat diiterasi, seperti List, Set, dan Map. Ini memungkinkan penggunaan perulangan for-each untuk mengakses elemen-elemen dalam kumpulan data tanpa memerlukan penanganan langsung terhadap iterator.
3. Implementasi: Pada kelas di Java Collections Framework mengimplementasikan interface Iterable, termasuk ArrayList, LinkedList, HashSet, TreeSet, dan lainnya. Selain itu juga dapat membuat kelas kustom terpisah yang mengimplementasikan Iterable jika diperlukan.

Map Structure

1. Definisi: Struktur data Map adalah kumpulan pasangan key-nilai yang memetakan setiap key kepada nilai yang sesuai. Setiap key dalam Map harus unik dan nilai dapat diakses dengan menggunakan key tersebut.
2. Jenis-jenis Map: Ada beberapa jenis Map dalam Java, termasuk:
• HashMap: Implementasi dasar Map yang menggunakan hashing untuk penyimpanan dan pencarian cepat.
• TreeMap: Implementasi yang menyimpan pasangan key-nilai dalam urutan terurut berdasarkan key, biasanya menggunakan struktur pohon merah-hitam.
• LinkedHashMap: Implementasi yang mempertahankan urutan sisipan elemen, serupa dengan HashMap tetapi dengan tambahan penjagaan urutan.
• WeakHashMap: Implementasi yang menggunakan referensi lemah untuk key, yang memungkinkan objek key yang tidak lagi digunakan untuk dihapus secara otomatis.
3. Penggunaan: Map digunakan untuk memetakan key ke nilai dan umumnya digunakan untuk menyimpan data yang membutuhkan akses cepat berdasarkan key. Map sering digunakan dalam aplikasi seperti penyimpanan data terstruktur, caching, dan pengindeksan.
4. Iterasi pada Map: Selain akses langsung menggunakan key, juga dapat mengiterasi melalui Map menggunakan mekanisme seperti perulangan for-each atau iterator. Ini memungkinkan untuk mengakses dan memanipulasi setiap pasangan key-nilai dalam Map.

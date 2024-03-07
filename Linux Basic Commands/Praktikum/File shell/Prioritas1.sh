#1/bin/sh

#buat dua folder
mkdir hobi
mkdir hewan

#buat dua file
touch hobi.txt
touch hewan.txt

#menambahkan konten ke file 
echo "Renang dan Lari" >  hobi.txt
echo "kucing dan anjing" > hewan.txt

#memindahkan file 
mv hobi.txt ./hobi
mv hewan.txt ./hewan

#hasil akhir 
echo "Berhasil"


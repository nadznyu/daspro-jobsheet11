**Pertanyaan Percobaan 1**
1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks ke-0? Jelaskan!
2. Mengapa terdapat null pada daftar nama penonton?
3. Lengkapi daftar penonton pada langkah ke-4 sebagai berikut
4. Jelaskan fungsi dari penonton.length dan penonton[0].length! Apakah penonton[0].length, penonton[1].length, penonton[2].length, dan penonton[3].length memiliki nilai yang sama? Mengapa?
5. Modifikasi kode program pada pertanyaan 4 untuk menampilkan panjang setiap baris pada array menggunakan for loop. Compile, run, lalu amati hasilnya.
6. Modifikasi kode program pada pertanyaan 5 untuk menampilkan panjang setiap baris pada array menggunakan foreach loop. Compile, run, lalu amati hasilnya.
7. Tambahkan kode program untuk menampilkan nama penonton pada baris ke-3 menggunakan for loop. Compile, run, lalu amati hasilnya.
8. Modifikasi kode program pada pertanyaan 7 menjadi perulangan dengan foreach loop. Compile, run, lalu lakukan amati hasilnya.
9. Modifikasi kembali kode program pada langkah 11 untuk menampilkan nama penonton untuk setiap baris. Compile dan run program kemudian amati hasilnya.
10. Menurut Anda, apa kekurangan dan kelebihan foreach loop dibandingkan dengan for loop?
11. Berapa indeks baris maksimal untuk array penonton?
12. Berapa indeks kolom maksimal untuk array penonton?
13. Apa fungsi dari String.join()?

**Jawaban Percobaan 1**
1. Tidak harus, asalkan indeks dalam elemen array masih valid.
2. Karena elemen dari array tersebut belum di isi.
3. Sudah dilengkapi.
4. Fungsi dari penonton.length untuk menghasilkan jumlah barisnya yaitu 4, sedangkan 
   penonton[0].length untuk menghasilkan jumlah kolomnya yaitu 2. Lalu nilai dari penonton[0].length, penonton[1].length, penonton[2].length, dan penonton[3].length memiliki nilai yang sama karena memiliki jumlah kolom yang sama.
5. Sudah commit di github.
6. Sudah commit di github.
7. Sudah commit di github.
8. Sudah commit di github.
9. Sudah commit di github.
10. foreach loop lebih sederhana dan mudah dibaca, tetapi kekurangan foreach loop yaitu tidak 
    bisa mengakses indeks secara langsung.
11. indeks baris maksimalnya 3.
12. indeks kolom maksimalnya 1.
13. Untuk menghubungkan serta menampilkan kumpulan String dengan pemisah.

**Pertanyaan Percobaan 2**
1. Apakah pengisian elemen array dari scanner harus dilakukan secara berurutan mulai dari 
   indeks ke-0? Jelaskan!
2. Modifikasi kode program untuk memberikan opsi menu sebagai berikut:
- Menu 1: Input data penonton
- Menu 2: Tampilkan daftar penonton
- Menu 3: Exit
3. Modifikasi kode program untuk menghandle apabila nomor baris/kolom kursi yang tidak tersedia
4. Pada menu 1, modifikasi kode program untuk memberikan warning apabila kursi yang dipilih 
   sudah terisi oleh penonton lainnya lalu munculkan perintah untuk memasukkan baris dan kolom kembali
5. Pada menu 2, jika kursi kosong, ganti null dengan ***

**Jawaban Percobaan 2**
1. Jika di implementasikan pada perulangan(loop), wajib menggunakan 0 karena perulangan itu 
   pasti dijalankan secara berurutan.
2. Sudah ditambahkan.
3. Sudah commit di github.
4. Sudah commit di github.
5. Sudah commit di github.

**Pertanyaan Percobaan 3**
1. Tambahkan kode program sebagai berikut
    for (int i = 0; i < myNumbers.length; i++) {
        System.out.println(Arrays.toString(myNumbers[i]));
    }
2. Apa fungsi dari Arrays.toString()?
3. Apa nilai default untuk elemen pada array dengan tipe data int?
4. Tambahkan kode program berikut
    for (int i = 0; i < myNumbers.length; i++) {
        System.out.println("Panjang baris ke-" + (i+1) + ": " + myNumbers[i].length);
    }
5. Array myNumbers memiliki length berbeda untuk setiap barisnya. Apakah panjang array 
   dapat dimodifikasi setelah diinstansiasi?

**Jawaban Percobaan 3**
1. Sudah ditambahkan.
2. Digunakan untuk mengubah isi array menjadi teks (string) agar mudah dibaca saat ditampilkan.
3. Nilai defaultnya adalah 0.
4. Sudah ditambahkan.
5. Tidak, panjang array tidak bisa diubah setelah array tersebut diinstansiasi, seperti contoh 
   pada soal, maka panjang array angka akan tetap 3.

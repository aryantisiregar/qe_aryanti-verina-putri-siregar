# qe_aryanti-verina-putri-siregar

<br>Nama : Aryanti Verina Putri Siregar
<br>NIM  : 11S19065
<br>Asal : Institut Teknologi Del

==================================================
<br>**Fundamental Performance Test**
<br><br>

<br>Performance Test adalah teknik non fungsional testing untuk menentukan parameter sistem dalam hal responsif dan disabilitas dibalik berbagai load kerja.  Mengukur kualitas atribut dari sistem seperti stabilitas, ketahanan dan penggunaan resource. Hasil pengujian biasanya berupa number of virtualize, section per second. 
<br>

<br>Yang diukur dari Performance Test
<br>• Performa suatu aplikasi sampai suatu batas tertentu. 
<br>• Bukan merupakan functional-test
<br>• Mengamati response time ketika menjalankan request dalam jumlah yang sangat banyak
<br>• Melihat suatu sistem berinteraksi dengan jumlah data yang cukup besar.



<br>Namun, performance testing termasuk test yang memakan biaya yang cukup mahal, disebabkan karena pengetesannya memerlukan persiapan yang dimana beberapa kasus harus membuat environment terpisah dari production agar tidak tercampurnya data test dengan data production. Environment ini ada juga yang membuatnya di server cloud yang biayanya bisa lebih besar dari environment production.
<br>

<br>Langkah yang harus dilakukan:
<br>1. Membuat test plan
<br>2. Membuat script test
<br>3. Melakukan performance test
<br>4. Menganalisa hasil performance test
<br>

<br>Tipe:
<br>1. Smoke Testing
<br>Testing yang pertama kali dilakukan setelah software di bangun. Fungsinya untuk memastikan fungsi penting berhasil dibangun. Dilakukan untuk verify script yang sudah dibuat, apakah sistem dapat handle minimal load, tanpa masalah sama sekali. Biasanya hanya 1-2 VUs.
<br>2. Load Testing
<br>Load Testing adalah pengujian yang paling sederhana yang dilakukan untuk memahami perilaku sistem dalam keadaan beban tertentu. Hasil dari load test digunakan untuk mengukur kepentingan bisnis saat transaksi yang kritis dengan memonitor dampak terhadap database, application server atau pendukung lainnya.
<br>3. Stress Testing
<br>Metode ini untuk dilakukan untuk mengamati kemampuan dan kestabilan sistem pada saat kondisi ekstrem. Dilakukan bertahap menuju load normal, puncak, dan melebihinya, lalu turun untuk melihat proses recovery. 
<br>4. Spike Testing
<br>Seperti stress test, namun kenaikan langsung menuju melebihi puncak dilakukan dalam waktu singkat. Jika stress test memberikan waktu untuk scale-out, disini tidak. Salah satu contoh adalah pada saat flash sale di suatu e-commerce, yang dimana banyaknya kunjungan pengguna yang langsung memuncak saat mengakses halaman flash sale.
<br>5. Soak Testing
<br>Dapat mengetahui apakah terdapat bug pada race condition, memory leaks, db connection dsb.
<br>
<br>
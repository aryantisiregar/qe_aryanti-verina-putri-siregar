# qe_aryanti-verina-putri-siregar

<br>Nama : Aryanti Verina Putri Siregar
<br>NIM  : 11S19065
<br>Asal : Institut Teknologi Del

==================================================
<br>**Basic RESTful API**
<br> Application Programming Interface
<br>merupakan penghubung yang memungkinkan suatu suatu aplikasi untuk berelasi dengan aplikasi lainnya dengan berbagai data
<br> Tujuan : untuk mempercepat proses  development dengan menggunakan function secara terpisah sehingga developer tidak perlu menggunakan fitur yang sama. 
<br> API berperan sebagai pembawa pesan dari pengguna dan memberitahu sistem apa yang harus dilakukan dan memberikan respon sesuai dengan permintaan tersebut. 
<br> REST (Representational State Transfer) standar arsitektur komunikasi berbasis web yang sering digunakan untuk pengembangan berbasis web. Umumnya menggunakan HTTP method.
<br><br>

<br>**Komponen REST API:**
<br>1. Method
<br>2. URL (Base URL + path) => kata kunci ke server
<br>3. Header => Pesan itu sah
<br>4. Body => Informasi
<br>

<br>HTTP RESPON CODE :
<br>(200)OK => request sukses
<br>(201)Created => request sukses dan resoursenya berhasil dibuat (POST dan PUT)
<br>(400)Bad Request => terjadi ketika melakukan request POST dan PUT, data tidak sesuai
<br>(404)Not  Found => ketika respon found tidak ditemukan 
<br>(401)Unauthorized => tidak melakukan autentifikasi terlebih dahulu 
<br>(405)Method  Not Allowed=> HTTP tidak respon  
<br>(500)Internal => Kesalahan server
<br>

<br>API testing dibedakan menjadi 3:
<br>- Functionality => test untuk memvalidasi suatu fitur apakah sudah berfungsi atau belum 
<br>- Load Test => untuk menguji kekuatan suatu sistem apakah mampu mengolah data  dari beban yang diberikan.
<br>- Security => test untuk menguji keamanan dari suatu sistem
<br>

<br>Tools yang digunakan untuk API:
<br>- Postman
<br>- Frisby.js
<br>- Jmeter
<br>- Rest-assured
<br>

<br>API testing Process
<br>- Specification review => meriew API dan documen
<br>- Specification Development
<br>- Framework Development
<br>- Test Case development
<br>- Execution dan report
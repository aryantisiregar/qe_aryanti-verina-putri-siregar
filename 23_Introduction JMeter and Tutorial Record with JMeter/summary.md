# qe_aryanti-verina-putri-siregar

<br>Nama : Aryanti Verina Putri Siregar
<br>NIM  : 11S19065
<br>Asal : Institut Teknologi Del

==================================================
<br>**Introduction JMeter and Tutorial Record with JMeter**
<br><br>

<brTools:
<br>- JMeter
<br>- K6
<br>- Locust
<br>- BlazerMeter
<br>- Smartbear Load Ninja
<br>

<br>Apache JMeter -> perangkat lunak sumber terbuka, aplikasi desktop Java 100% murni, yang dirancang untuk memuat uji perilaku fungsional dan mengukur kinerja situs web.
<br>

<br>**Keuntungan:**
Open Source => bisa melihat code di JMeter  dan melihat permasalahan sendiri
Dibuat dengan GUI dan nonGUI (command line)

<br>**Komponen yang ada di JMeter**
<br>Test Plan => rencana besar dari sebuah pengujian yang akan dilakukan (parent)
<br>Thread Groups => Kumpulan thread yang menjalankan skenario yang sama
<br>Samplers => sebutan untuk request yang dikirim ke server
<br>Config Element => element yang digunakan untuk konfigurasi atau modifikasi sampler requests yang dikirim ke server
<br>Listener => merekam apapun atau data yang dihasilkan dari tes
<br>Timer => fitur akan jalan duluan sebelum semua fitur yang lain berjalan
<br>Assertion => seperti assert pada API/Web/Testing merupakan kriteria tambahan apakah pass/tidak
<br>Pre-post processors => fitur untuk memproses/modifikasi response data sebelum/sesudah tes

<br>**Select Template**

1. Click on the Templates... (1) button right next to New file button on the toolbar, or by selecting File | Templates... from the menu.
2. Then, select Select Template as Recording (2).
3. Click on the Create(3) button. Refer to the following screenshot.


<br>**Enable HTTP(S) Test**
<br>**Script Recorder**

1. Click on the HTTP(S) Test Script Recorder (1)
2. Then, select Toggle (2) to enable HTTP(S) Test Script Recorder

<br>**Run in CLI mode**
1. Buka cmd
2. redirect path ke \apache-jmeter-version\bin
3. Type jmeter -n -t [path to jmx file] -l [path to results file in CSV]

<br>Summary Report
<br>Success rate = (jumalah_response_2xx / jumlah_thread)*100%

<br>
<br>
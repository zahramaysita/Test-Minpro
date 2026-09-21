# LAPORAN MINI PROJECT 2 

## PEMOGRAMAN BERORIENTASI OBJEK

### SISTEM MANAJEMEN PENITIPAN HEWAN 

Nama : Zahra Maysita

NIM : 2509116015

Kelas : A'2025

# BAB I 
# PENDAHULUAN
## 1.1 Deskripsi Program

Sistem Penitipan Hewan Peliharaan merupakan program berbasis Java yang dibuat untuk membantu mengelola data hewan dan data penitipan hewan. Program ini memiliki beberapa fitur seperti menambah, menampilkan, mengubah, menghapus, dan mencari data hewan, serta mengelola data penitipan hewan yang tersimpan dalam sistem.

Program ini dibuat dengan menerapkan konsep Object Oriented Programming (OOP), yaitu dengan membagi program ke dalam beberapa class sesuai dengan fungsinya. Class Hewan digunakan sebagai superclass untuk menyimpan data hewan, sedangkan class Kucing, Anjing, Kelinci, dan Hamster digunakan sebagai subclass yang mewarisi atribut dan method dari class Hewan. Selain itu, class Penitipan digunakan untuk menyimpan data penitipan, sedangkan class Service digunakan untuk mengatur proses pengolahan data. Program juga menggunakan object, constructor, ArrayList, percabangan, dan perulangan dalam proses pengelolaan data.

Program ini menerapkan validasi input untuk memastikan data yang dimasukkan sesuai dengan ketentuan yang telah ditetapkan. Selain itu, program juga menerapkan nilai tambah berupa polymorphism (method overriding) pada method getInfo() yang terdapat pada class turunan hewan. Dengan adanya penerapan konsep OOP dan validasi input, program menjadi lebih terstruktur, mudah dikembangkan, serta dapat mengurangi kesalahan dalam pengolahan data.

## 1.2 Tujuan Program

Tujuan dari pembuatan program Sistem Penitipan Hewan Peliharaan yaitu:

1. Membantu pengelola penitipan hewan dalam mencatat dan mengelola data hewan yang dititipkan.
2. Memudahkan pengelola dalam menyimpan dan melihat informasi mengenai hewan dan data penitipannya.
3. Memudahkan pengelola dalam melakukan penambahan, perubahan, penghapusan, dan pencarian data.
4. Membantu menjaga data penitipan agar lebih teratur dan mudah dikelola.
5. Mengurangi kesalahan dalam memasukkan data dengan adanya validasi input.

## 1.3 Alur Singkat Program

Saat program dijalankan, sistem akan menampilkan menu utama yang berisi berbagai pilihan fitur. Pengguna dapat memilih menu sesuai kebutuhan, seperti mengelola data hewan maupun data penitipan hewan.
Pada pengelolaan data hewan, pengguna dapat menambahkan, menampilkan, mengubah, menghapus, dan mencari data hewan yang tersimpan di dalam sistem. Selain itu, pengguna juga dapat mengelola data penitipan hewan dengan menambahkan, menampilkan, mengubah, dan menghapus data penitipan.

Setiap data yang dimasukkan akan disimpan ke dalam sistem dan dapat diakses kembali melalui menu yang tersedia. Setelah suatu proses selesai dilakukan, sistem akan kembali menampilkan menu utama sehingga pengguna dapat memilih fitur lainnya.
Program akan terus berjalan sampai pengguna memilih menu Keluar. Setelah menu tersebut dipilih, sistem akan menampilkan pesan penutup dan program akan berhenti dijalankan.

# BAB II 
# IMPLEMENTASI PROGRAM

Pada bab ini akan dijelaskan implementasi program Sistem Penitipan Hewan Peliharaan. Pembahasan meliputi menu-menu yang tersedia pada program, seperti pengelolaan data hewan, pengelolaan data penitipan, pencarian data, serta proses validasi input yang diterapkan dalam sistem. Penjelasan disertai dengan tampilan program untuk menunjukkan cara kerja setiap fitur yang tersedia.

## 2.1 Menu Utama

<img width="407" height="252" alt="image" src="https://github.com/user-attachments/assets/c7389c97-448a-4c5b-a789-70311974daab" />

Gambar di atas menampilkan menu utama dari program Sistem Manajemen Penitipan Hewan. Pada menu ini terdapat 10 pilihan, yaitu menu tambah data hewan, tambah data penitipan, tampilkan data hewan, tampilkan data penitipan, ubah data hewan, ubah data penitipan, hapus data hewan, hapus data penitipan, cari data hewan, dan keluar dari program. Pengguna dapat memilih menu dengan menginput angka yang tersedia sehingga sistem dapat menampilkan pesan kesalahan apabila pengguna memasukkan pilihan yang tidak valid.


<img width="865" height="396" alt="image" src="https://github.com/user-attachments/assets/6b547f25-c0d6-47f3-8b3a-89148944b6ff" />

Pada menu utama, program menggunakan struktur percabangan switch-case untuk memproses pilihan yang dimasukkan oleh pengguna. Setiap pilihan menu memiliki case yang berbeda sehingga sistem dapat menjalankan fitur sesuai dengan pilihan pengguna, seperti menambah, menampilkan, mengubah, menghapus, dan mencari data. Selain itu, program juga menggunakan default pada switch-case untuk menangani pilihan yang tidak tersedia.


<img width="185" height="52" alt="image" src="https://github.com/user-attachments/assets/e0ad3526-e348-472b-b1bb-58f06d72a08a" />

Apabila pengguna memasukkan angka di luar pilihan menu yang disediakan, sistem akan menampilkan pesan bahwa pilihan menu tidak valid dan meminta pengguna untuk memasukkan pilihan yang benar.


<img width="260" height="55" alt="image" src="https://github.com/user-attachments/assets/16b5d2ad-312a-454a-98fa-4704ce578330" />

Program juga menerapkan validasi input pada menu utama sehingga pengguna hanya dapat memasukkan angka sebagai pilihan menu. Jika pengguna memasukkan huruf atau karakter selain angka, sistem akan menampilkan pesan kesalahan dan meminta pengguna untuk menginput kembali pilihan yang valid. Dengan adanya validasi tersebut, program dapat berjalan dengan lebih aman dan mengurangi kesalahan input dari pengguna.

## 2.2 Kelola Data Hewan

### 2.2.1 Tampilkan Data Hewan

<img width="262" height="126" alt="image" src="https://github.com/user-attachments/assets/a0e8ac43-c1ef-42aa-b7c2-ce8d67d37422" />

<img width="542" height="160" alt="image" src="https://github.com/user-attachments/assets/db4e200b-5820-4fee-9b95-2274e1276612" />

Gambar di atas menampilkan data hewan yang tersimpan di dalam sistem. Data yang ditampilkan merupakan dummy data yang telah ditambahkan sebelumnya ke dalam ArrayList sebagai data awal program. Penerapan dummy data ini dilakukan untuk memenuhi ketentuan program, yaitu agar fitur read dapat langsung menampilkan data tanpa pengguna harus melakukan input data terlebih dahulu. Informasi yang ditampilkan meliputi ID hewan, nama hewan, dan jenis hewan. Selain menampilkan dummy data, menu ini juga dapat menampilkan data baru yang berhasil ditambahkan oleh pengguna melalui menu tambah data hewan.

### 2.2.2 Tambah Data Hewan

<img width="262" height="81" alt="image" src="https://github.com/user-attachments/assets/35e58391-805e-4d77-a2aa-9b3e66356fe7" />

<img width="222" height="80" alt="image" src="https://github.com/user-attachments/assets/7c485bc2-60ee-42fe-a2d4-2b994fb8b3a3" />

<img width="205" height="60" alt="image" src="https://github.com/user-attachments/assets/9cf5133f-c8f9-4b3a-a007-93e8807aaaff" />

<img width="276" height="67" alt="image" src="https://github.com/user-attachments/assets/72dbc376-ae06-4aa4-b957-8a98748e73cd" />

Program juga menerapkan validasi input pada proses penambahan data hewan. ID hewan harus berupa angka, tidak boleh bernilai nol atau negatif, serta tidak boleh menggunakan ID yang sudah terdaftar sebelumnya.

<img width="312" height="95" alt="image" src="https://github.com/user-attachments/assets/89e17f0e-964a-4a94-9a12-3cbdf295d8c3" />

<img width="342" height="232" alt="image" src="https://github.com/user-attachments/assets/f31b667c-7586-4ec6-bcd7-3e537db180b0" />

<img width="342" height="156" alt="image" src="https://github.com/user-attachments/assets/eddbea85-9ecf-4f5e-85de-bcf7c471e697" />

<img width="292" height="162" alt="image" src="https://github.com/user-attachments/assets/0980f1a9-67c9-4010-9cc6-4aea81ac5c29" />

Selain itu, nama hewan tidak boleh kosong. Jika terdapat data yang tidak sesuai, sistem akan menampilkan pesan kesalahan dan data tidak akan disimpan ke dalam sistem.
Pada saat memilih jenis hewan, pengguna hanya dapat memasukkan angka sesuai pilihan yang tersedia, yaitu 1 untuk Kucing, 2 untuk Anjing, 3 untuk Kelinci, dan 4 untuk Hamster. Apabila pengguna memasukkan angka di luar pilihan tersebut atau memasukkan huruf maupun karakter selain angka, sistem akan menampilkan pesan kesalahan dan meminta pengguna untuk memasukkan pilihan yang valid.

<img width="282" height="247" alt="image" src="https://github.com/user-attachments/assets/8979dc0b-2968-4d3c-8d7e-67faf0c94057" />

Gambar di atas menampilkan proses penambahan data hewan ke dalam sistem. Pengguna memasukkan ID hewan, nama hewan, dan memilih jenis hewan yang tersedia. Karena data yang dimasukkan valid, sistem berhasil menyimpan data hewan dan menampilkan pesan bahwa data berhasil ditambahkan.
### 2.2.3 Update Data Hewan

### 2.2.4 Hapus Data Hewan

### 2.2.5 Cari Data Hewan

## 2.3 Kelola Data Penitipan


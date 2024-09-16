# Aplikasi Login dan Registrasi Acara 4 PGPB

Ini adalah proyek aplikasi Android sederhana yang menyediakan fitur login, registrasi, dan halaman utama untuk pengguna. Proyek ini dikembangkan menggunakan **Android Studio** dengan **Empty Views Activity**. Aplikasi ini memiliki tiga halaman utama: Halaman Login, Halaman Registrasi, dan Halaman Utama.

## Fitur
1. **Halaman Login**
   - Pengguna dapat login dengan username/email dan password.
   - Tombol "Remember me" untuk mengingat sesi login.
   - Link untuk mengarahkan pengguna ke halaman registrasi jika belum memiliki akun.

2. **Halaman Registrasi**
   - Pengguna dapat mendaftar dengan mengisi username, email, nomor telepon, dan password.
   - Setelah mendaftar, pengguna akan diarahkan ke halaman utama.

3. **Halaman Utama**
   - Setelah berhasil login atau registrasi, pengguna akan melihat halaman utama dengan pesan sambutan dan informasi email serta nomor telepon yang terdaftar.

## Struktur Proyek
- **MainActivity.java**: Berfungsi sebagai halaman login.
- **RegisterActivity.java**: Berfungsi sebagai halaman registrasi pengguna.
- **HomeActivity.java**: Berfungsi sebagai halaman utama setelah login atau registrasi berhasil.
- **activity_main.xml**: Layout untuk halaman login.
- **activity_register.xml**: Layout untuk halaman registrasi.
- **activity_home.xml**: Layout untuk halaman utama.

## Instalasi dan Penggunaan
Ikuti langkah-langkah di bawah ini untuk menginstal dan menjalankan aplikasi ini di Android Studio:

1. **Clone atau Unduh Proyek**
   ```bash
   git clone https://github.com/username/repository-name.git
   ```
   
2. **Buka Proyek di Android Studio**
   - Buka Android Studio.
   - Klik `File > Open`, lalu arahkan ke folder proyek yang telah di-clone/diunduh.
   
3. **Sync Proyek dengan Gradle**
   - Android Studio akan secara otomatis melakukan sinkronisasi proyek dengan Gradle. Pastikan tidak ada error selama proses ini.

4. **Jalankan Aplikasi**
   - Pilih perangkat emulator atau perangkat fisik yang terhubung.
   - Klik tombol `Run` atau gunakan shortcut `Shift + F10` untuk menjalankan aplikasi.

## Dependencies
Pastikan Anda memiliki versi minimum Android SDK dan tools berikut:
- Android SDK: 21+
- Build Tools: 30.0.3
- Android Studio: 4.1.1 atau lebih baru

## Package Name
- Nama package yang digunakan dalam proyek ini: `com.frendy.logina4`.

## Struktur Direktori
```
├── app
│   ├── manifests
│   │   └── AndroidManifest.xml
│   ├── java
│   │   └── com.frendy.logina4
│   │       ├── MainActivity.java
│   │       ├── RegisterActivity.java
│   │       └── HomeActivity.java
│   └── res
│       ├── layout
│       │   ├── activity_main.xml
│       │   ├── activity_register.xml
│       │   └── activity_home.xml
│       └── drawable
│           ├── ic_email.xml
│           └── ic_password.xml
```

## Cara Kerja Aplikasi
1. **Login**: Pengguna memasukkan username/email dan password, lalu menekan tombol login. Jika username dan password benar, pengguna diarahkan ke **HomeActivity**.
2. **Registrasi**: Pengguna yang belum memiliki akun dapat membuka halaman registrasi, mengisi form, dan menekan tombol register. Data pengguna disimpan dan mereka diarahkan ke **HomeActivity** setelah registrasi berhasil.
3. **HomeActivity**: Pengguna akan melihat pesan selamat datang yang berisi username, email, dan nomor telepon yang telah terdaftar.

## Catatan
- Proyek ini menggunakan Empty Views Activity sebagai template dasar.
- Data pengguna hanya disimpan secara sementara di memori (belum ada implementasi database).
- Jika Anda ingin menambahkan penyimpanan permanen, seperti database SQLite atau Firebase, Anda dapat menambahkannya di bagian penyimpanan data.

## Kontribusi
Jika Anda ingin berkontribusi dalam proyek ini:
1. Fork proyek ini.
2. Buat branch fitur (`git checkout -b fitur-baru`).
3. Commit perubahan (`git commit -m 'Tambah fitur baru'`).
4. Push ke branch (`git push origin fitur-baru`).
5. Buat Pull Request.

## Lisensi
Proyek ini dilisensikan di bawah [MIT License](LICENSE).

# CNovel — Aplikasi Worldbuilding & Menulis Novel (Android)

Aplikasi Android untuk penulis membangun dunia cerita (worldbuilding) dan menulis novel secara terstruktur.

**[Download APK Terbaru](https://github.com/yourusername/cnovel/releases/latest)** · Dibuild otomatis via GitHub Actions

---

## Fitur

### 📚 Manajemen Proyek
- Buat & kelola banyak proyek novel
- Setiap proyek punya dunia, karakter, dan naskah sendiri

### 🌍 Worldbuilding
- **Karakter**: nama, usia, peran, sifat, latar belakang, relasi
- **Lokasi**: deskripsi, peta konsep, keterkaitan
- **Timeline**: urutan peristiwa penting
- **Entitas Lain**: organisasi, budaya, sihir/teknologi, bahasa
- **Catatan Bebas**: fleksibel untuk ide apa pun

### ✍️ Penulisan
- **Bab & Adegan** — struktur hierarki (Bagian → Bab → Adegan)
- **Editor Markdown** dengan preview
- **Word counter** & target harian
- **Progress bar** per bab & keseluruhan novel

### 🔗 Referensi
- Sematkan entitas worldbuilding langsung di naskah
- Panel referensi saat menulis (tanpa pindah halaman)

### 💾 Penyimpanan
- Berbasis file JSON — portabel, mudah di-*backup*/sync
- Bisa disimpan di Google Drive / Dropbox / Git

---

## Tech Stack

| Lapisan | Teknologi |
|---------|-----------|
| Bahasa  | Kotlin |
| UI      | Jetpack Compose |
| Nav     | Navigation Compose |
| Storage | JSON (kotlinx.serialization) |
| Build   | Gradle + GitHub Actions |

---

## Struktur Proyek

```
cnovel/
├── .github/workflows/build.yml   # Build APK otomatis
├── app/
│   ├── build.gradle.kts
│   └── src/main/
│       ├── AndroidManifest.xml
│       └── java/com/cnovel/app/
│           ├── MainActivity.kt
│           ├── data/model/        # Project, Character, Location, Chapter
│           ├── data/repository/   # Repository & penyimpanan JSON
│           └── ui/
│               ├── screens/      # Halaman aplikasi
│               └── theme/        # Tema & warna
├── build.gradle.kts
├── settings.gradle.kts
├── gradle.properties
├── gradle/wrapper/gradle-wrapper.properties
└── README.md
```

---

## Cara Build APK Lokal

```bash
git clone https://github.com/yourusername/cnovel.git
cd cnovel
./gradlew assembleDebug
# APK ada di app/build/outputs/apk/debug/
```

Atau download dari **GitHub Releases** (dibuild otomatis oleh GitHub Actions).

---

## Lisensi

MIT

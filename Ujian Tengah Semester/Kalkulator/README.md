# UTS2
<strong>Kalkulator</strong>

Project Kalkulator merupakan kalkulator sederhana untuk menghitung perkalian, penjumlahan, pembagian, pengurangan, dan pemangkatan dari dua buah bilangan.  Istimewanya, aplikasi ini menerima bilangan berupa string bahasa Indonesia dengan nilai bilangan maksimal adalah 20.  Operator yang digunakan juga berupa teks bahasa Indonesia dalam bentuk String.  Anda harus membuatkan method hitung pada Kalkulator untuk menghitung hasil kalkulasinya.

Keterangan:
1.	Class BilanganString merupakan class yang menerima bilangan dalam bentuk teks berbahasa Indonesia dengan nilai maksimal 20.  Misalnya adalah “dua belas”.  Class ini mengkonversi bilangan dalam teks ke dalam bilangan dalam bentuk integer.  Kemudian terdapat method apakahDuaDigit untuk mengembalikan true/false jika bilangan tersebut dua digit.  Method apakahLebihDari10 akan mengembalikan true/false jika lebih dari 10  atau tidak.  Input teks tidak harus huruf kecil.
2.	Class Operator merupakan class yang menerima jenis operator dalam bentuk teks berbahasa Indonesia, hanya “kali”, “bagi”, “tambah”, “kurang”, dan “pangkat”.  Input teks tidak harus huruf kecil.
3.	Class Kalkulator adalah class utama untuk menerima input bilangan1, bilangan2, dan operator dengan tipe class BilanganString dan Operator.  Class ini memiliki method hitung untuk menghitung hasil akhir dari kalkulasi bilangan dan operatornya.
4.	Gunakan Maven!
5.	Class Main yang diberikan pada project dapat dikembangkan untuk dicoba.  Class AppTest juga sudah disediakan.  Saat mencoba, class AppTest bisa dikomen dulu.

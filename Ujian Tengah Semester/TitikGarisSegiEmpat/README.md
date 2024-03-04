# UTS-A1
UTS-A1
<strong>Titik, Garis, dan SegiEmpat</strong>

Buatlah sebuah class Titik, Garis, dan SegiEmpat.  
Berikut adalah spesifikasi dari class Titik yang harus dipenuhi:
Class Titik memiliki dua atribut, yaitu x dan y yang masing-masing bertipe integer.
Class Point memiliki tiga constructor, yaitu:
-	Titik(int, int), langsung mengisi nilai x dan y.
-	Titik(), berarti membuat sebuah titik pada koordinat (0,0).
-	Titik(Titik), membuat titik berdasarkan Titik lain yang sudah ada sebelumnya.
Class Titik memiliki beberapa method, yaitu:
-	Method distance(int, int), untuk menghitung jarak antara titik sekarang dengan suatu titik di koordinat (x,y).
-	Method distance(Titik), untuk menghitung jarak antara titik sekarang dengan suatu titik yang lain.
-	Setter dan getter untuk atribut x dan y.

Untuk class Garis, berikut ini adalah spesifikasi yang harus dipenuhi:
Class Garis memiliki 2 atribut yaitu titikA dan titikB yang bertipe Titik
Class Garis memiliki 4 constructor yaitu:
-	Garis(Titik, Titik) untuk mengisi titik A dan titik B
-	Garis(Garis) untuk mengisi titik dengan Garis lain
-	Garis(Titik,int,int) untuk mengisi titik A dengan parameter pertama dan titik B dengan koordinat x,y
-	Garis(int,int,Titik) untuk mengisi titik A dengan koordinat x,y dan titik B dengan Titik
Method dari class Garis adalah:
-	getPanjangGaris() untuk menghitung panjang garis tersebut.
-	getPanjangSepertigaGaris() untuk menghitung 1/3 * panjang garis tersebut.
-	apakahPanjangSama(Garis) untuk mengetahui apakah panjang garis sama dengan garis yang diinputkan (return boolean true / false).
-	Lengkapi dengan getter dan setter untuk semua atribut.

Class SegiEmpat memiliki 4 atribut, yaitu garisA, garisB, garisC dan garisD yang merupakan keempat Garis dari segi empat tersebut.  Setiap atribut bertipe Garis.
Class SegiEmpat memiliki 2 konstructor:
-	SegiEmpat(Garis,Garis,Garis,Garis) untuk mengisi 4 garis yang membentuk segiempat
-	SegiEmpat(Titik,Titik,Titik,Titik) untuk menerima 4 titik sudut yang membentuk segiempat
-	SegiEmpat(Garis,Titik,Titik) untuk menerima 1 buah garis (garisA ke B) dan 2 buah titik (titik c dan titik d) yang membentuk segi empat
Class SegiEmpat memiliki method area() untuk menghitung luas kotak dan apakahKotak() untuk mengetahui apakah segi empat itu berbentuk kotak (bujur sangkar) atau bukan (return boolean).  Lengkapi dengan getter dan setter untuk seluruh atribut yang ada.

Soal secara detail dengan Gambar dapat dilihat di E-Class saat ujian.

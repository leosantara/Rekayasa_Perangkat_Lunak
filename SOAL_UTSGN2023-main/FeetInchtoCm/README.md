# UTS3
<strong>Project Feet Inch to Cm</strong>

Materi: Overloading method
Buatlah sebuah program java untuk menghitung nilai konversi dari feet dan inci ke centimeter(cm) dengan ketentuan berikut:
- Ketentuan project maven:
<pre>
    -Grupid = com.rplbo.uts3
    -Artifactid = FeetIncToCm
    -Version = 1.0-SNAPSHOT
    -Name = FeetIncToCm
    -Hanya ada 1 class saja Main
 </pre>
-	Buat method bernama FeetIncToCm yang memiliki 2 parameter yaitu feet dan inch.
  <pre>
  Validasi nilai kedua parameter tidak boleh kurang atau sama dengan 0, nilai inch harus kurang atau sama dengan 12. Return -1 jika tidak memenuhi syarat.
  Jika valid, maka konversi nilai dari feet dan inch ke cm.
  Return nilai centimeter-nya.
  </pre>
-	Buat method dengan nama yang sama yaitu FeetIncToCm tetapi hanya memiliki 1 parameter inc.
  <pre>
  Validasi parameter inch tidak boleh kurang atau sama dengan 0. Return -1 jika tidak memenuhi.
  Jika valid, maka hitunglah nilai centimeternya dengan memanggil fungsi FeetIncToCm (double feet, double inch) yang sudah dibuat sebelumnya. 
  Hint: inch dibagi menjadi feet dan sisanya menjadi inch.
  Return nilai centimeternya
  </pre>
-	Panggil kedua method di main method.
CATATAN: 1 inch = 2.54 cm dan 1 foot = 12 inch

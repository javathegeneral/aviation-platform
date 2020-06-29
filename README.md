# aviation-platform

Java 1.8.0_51'de derlenmiştir.

İlgili API Dokümantasyonu http://localhost:8080/swagger-ui.html altındadır.


JSR303 notasyonları kullanıldığı için Global Exception Handler kullanılarak hata anlamlandırıldı. Lakin karşı tarafa exception gönderiyor ilgili versiyonda. İlgili kod düzenlenebilir.

H2 Database In Memory çalışıyor. Projeyi aldıktan sonra mvn clean install ile build edip çıkan jar ile java -jar xxx.jar komutu ile çalıştırabilirsiniz.
Spring Profile bir sonraki adımda verilebilir. Şu an sadece development aşaması olduğu için profile verilmemiştir. 

İlgili ödevde sadece Airport ve Airplane ekleme/arama yapılabiliyor.

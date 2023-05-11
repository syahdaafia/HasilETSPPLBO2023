# ETS PPLBO PRAKTIK

## Food Ordering System on Microservices
Nama  : Syahda Afia Dhiya Ulhaq Tajduin  
NIM   : 201524030  
Kelas : D4-3A  

## Tech Stack
- Spring Boot Java Framework
- MongoDB
- MySQL

## Prequisites
- [x] Java JDK 17  
- [x] MongoDB  
- [x] MySQL
- [x] Intellij IDE

## Services
**API Gateway**
- [x] Mengelola interaksi antar endpoint

**Consumer Service**  
Bertanggung jawab untuk menyimpan dan mengelola data consumer  
- [x] Menyimpan data informasi dari pelanggan  
- [x] Mengelola informasi pelanggan  

**Delivery Service**  
Bertanggung jawab untuk menyimpan status pengiriman dari pemesanan yang dilakukan customer jika customer melakukan pemesanan _online_   
- [x] Memproses permintaan pengiriman pesanan
- [x] Melacak pengiriman
- [x] Menyediakan informasi kapan pesanan akan sampai
- [x] Menyediakan API untuk menerima permintaan pengiriman

**Inventory Service**  
Bertanggung jawaba untuk manajemen stok barang atau produk yang tersedia  
- [x] Memantau dan mengelola stok barang atau produk yang tersedia dalam sistem  
- [x] Memastikan bahwa informasi produk yang ditampilkan dalam aplikasi pemesanan _online_ selalu akurat

**Order Service**  
Bertanggung jawab untuk mengelola pesanan yang diterima dari pelanggan, baik melalui pesanan langsung di kafe, pesanan _online_, maupun reservasi  
- [x] Menyimpan informasi pesanan, seperti produk yang dipesan, jumlah, harga, dan status  
- [x] Menyediakan API untuk membuat, mengubah, atau membatalkan pesanan  
- [x] Menyediakan API untuk mengecek status pesanan  

**Payment Service**  
Bertanggung jawab untuk mengelola pembayaran yang dilakukan oleh pelanggan  
- [x] Menyediakan API untuk menerima pembayaran dari pelanggan  
- [x] Menyediakan API untuk memverifikasi pembayaran  
- [x] Menyediakan API untuk membatalkan pembayaran  

**Product Service**  
Bertanggung jawab untuk mengelola dan menyediakan daftar produk-produk yang dijual di kafe dan bakery, seperti kue, roti, pastry, dan minuman kopi  
- [x] Menyediakan informasi produk, seperti nama, harga, gambar, dan deskripsi  
- [x] Menyediakan informasi persediaan produk, seperti jumlah produk yang tersedia, dan kapan produk tersebut akan tersedia lagi  
- [x] Menyediakan API untuk membuat, mengubah, atau menghapus produk  


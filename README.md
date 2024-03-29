# ETS PPLBO PRAKTIK

## Food Ordering System on Microservices
Nama  : Syahda Afia Dhiya Ulhaq Tajduin  
NIM $~~$ : 201524030  
Kelas $~$ : D4-3A  

## Tech Stack
- Spring Boot Java Framework
- MongoDB
- MySQL

## Prequisites
- [x] Java JDK 17  
- [x] MongoDB  
- [x] MySQL
- [x] Intellij IDE

## API Documentation/Tester (Postman)
[![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/24074206-135df299-8b2b-4f9a-be2e-7511fc6eef89?action=collection%2Ffork&collection-url=entityId%3D24074206-135df299-8b2b-4f9a-be2e-7511fc6eef89%26entityType%3Dcollection%26workspaceId%3D096d2409-cc7e-4682-8edf-da67f42ca944)  

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
Bertanggung jawab untuk manajemen stok barang atau produk yang tersedia  
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

**Upcoming Service**
- Kitchen Service
- Order History Service
- Consumer Service
- Notification Service
- Cafe Service
- Accounting Service

## Business Capabilities and Service Mapping  
![Untitled Diagram drawio](https://github.com/syahdaafia/HasilETSPPLBO2023/assets/76998317/048ebc2b-1120-4fce-8f97-4adaaf2be069)  

## Service Architecture  
<img width="431" alt="image" src="https://github.com/syahdaafia/HasilETSPPLBO2023/assets/76998317/ebb5dcfc-859f-470d-8603-e0c7914eea57">  

## Design Pattern Used  
**Problem**  
Biasanya 1 client membutuhkan data dari beberapa service dan client tersebut menghubungi service-service tersebut secara langsung. Ini membutuhkan biaya yang mahal.

**Solusi**  
Menggunakan API Composition. API Composition merupakan pattern yang membuat client tidak harus menghubungi banyak service secara langsung, melainkan melalui request ke API Composer. API Composer ditempatkan di depan microservices.  

**API Composition**  
API Composition diterapkan di order service dikarenakan pada order service sering dilakukan query untuk mencari pemesanan yang biasanya menggunakan findOrder() query. findOrder() query akan mengembalikan OrderDetails yang berisi order id, nama cafe, delivery status, estimasi kedatangan, dan payment status. Untuk mendapat data tersebut, tentunya kita perlu data-data dari berbagai service yang berbeda. Maka dari itu, API composition merupakan pattern yang tepat untuk order service. Nantinya, akan ditempatkan sebuah composer di depan service-service yang memiliki data yang dibutuhkan. Client hanya perlu melakukan request kepada composer tersebut dan nantinya composer tersebut lah yang akan mengambil data dari berbagai service, menggabungkannya, dan mengembalikannya ke client.

**Arsitektur Penerapan API Composition**  
<img width="469" alt="image" src="https://github.com/syahdaafia/HasilETSPPLBO2023/assets/76998317/2b31998a-d143-46a1-9a44-464a802d0a4b">




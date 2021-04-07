# Turkcell POC

## Kurulum

- MongoDB Server kurulumu
 >
>
> >https://www.mongodb.com/try/download/community<
>
> sitesinden MongoDB Community server, sistem özellikleri seçilerek indirilip kurulur.
> 
> Kurulan dizinde içinde
>
> > MongoDB/Server/4.4/bin 
>
>   komut satırına
> > mogod
> 
> komutu ile lokal sunucu çalıştırılır.
> 
>default: localhost:27017 

- MongoDB Compass kurulumu
> Görüntülemede yardımcı olması için 
> > https://www.mongodb.com/try/download/compass
>
> Adresinden MongoDb Compass kurulabilir. Connect ekranından
>
> >Fill in connection fields individually
>
>seçeneğine tıklanarak localhost:27017 sunucusuna kolayca bağlanılabilir.
>
## Çalıştırma
- Sunucu'da veritabanı oluşturma
> Mongodb sunucus dizininde ek bir komut satırı daha oluşuturularak
> > mongo
>
>komutu çalıştırılır.
>
>Çıkan ekranda sırasıyla
> > use turkcell
> 
> > db.createCollection("Menu")
>
> > db.createCollection("Product")
>
> > db.createCollection("ServiceRequest")
>
>komutları çalıştırılmalıdır.
>

- Initial Data
> Program çalıştırılmadan önce
> > MongoDB Compass üzerinde jSON, CSV dosyası veya manuel olarak
> 
> ya da
>
> > gsm-handler/src/main/resources
> >
> > dizininde bulunan data.json içerisindeki JSON liste objesi değiştirlebilir.
>
- Uygulamayı çalıştırmak
> Bu aşamada uygulama bir IDE yardımı ya da komut satırından çalıştırılır.
>
- Swagger 
> swagger kullanımı için 
> > http://localhost:8080/swagger-ui.html#/
> 
> adresi kullanılır.
 

 

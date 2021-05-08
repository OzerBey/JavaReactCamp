# Homework requirements :
**E-Commerce**
Aşağıda bir e-ticaret sisteminde sisteme kayıt ve sisteme giriş için gerekli gereksinim ve kabul kriterlerini yazdım. Bu sisteme ait Java backend yazmak istiyoruz.

Kullanıcılar sisteme bilgilerini girerek üye olabilmelidir.

Sisteme temel kullanıcı bilgileri , e-posta ve parolayla üye olunabilmelidir. Temel kullanıcı bilgileri : ad, soyad, e-posta, parola. Temel bilgilerin tamamı zorunludur.
Parola en az 6 karakterden oluşmalıdır.
E-posta alanı e-posta formatında olmalıdır. (Regex ile yapınız. Araştırma konusu)
E-Posta daha önce kullanılmamış olmalıdır.
Ad ve soyad en az iki karakterden oluşmalıdır.
Üyelik sonucu kullanıcıya doğrulama e-postası gönderilmelidir. (Simulasyon)
Doğrulama linki tıklandığında üyelik tamamlanmalıdır. (Simulasyon)
Hatalı veya başarılı durumda kullanıcı bilgilendirilmelidir.
Kullanıcılar sisteme Google hesapları ile üye olabilmelidir. (Simulasyon)

İlerleyen zamanlarda başka yetkilendirme servisleri de kullanılabilir. (Sistemi dış servis entegrasyonu olacak şekilde yapılandırınız.)
Hatalı veya başarılı durumda kullanıcı bilgilendirilmelidir.
Kullanıcılar e-posta ve parola bilgisiyle sisteme giriş yapabilmelidir.

E-posta ve parola zorunludur
Hatalı veya başarılı durumda kullanıcı bilgilendirilmelidir.

# Özet :
**Entities:**
Users (Zorunlu olan alanlar) :

- Adı (min 2 karakter)
- Soyadı (min 2 karakter)
- E mail (Regexte e posta formatiında ) ve daha önce   kullanılmamış e posta olmak
- parola (min 6 karakter)
- Dogrulama (IsVerify())

**Functions:**

- Register => kayıt olduktan sonra e posta gönderme simulasyonu
- Doğrulama (verify) oluşturulan bir simulasyon yapısı ile e mail i doğrulayıp doğru ise doğruluk onayı, değisle hata mesajı verir (Doğrulama sonucu döndür)

* Üçüncül sistemlerle kayıt (google, github vb.) hatalı veya onay durumunda mesaj bildirimi
* Sisteme giriş (Login) e posta ve şifre ile giriş. Zorunlu alanlar hatalı veya doğruluk durumunda kullanıcıya bilgi mesajı yolla

# **[Regex (Regular Expressions) kaynak](https://ceaksan.com/tr/regex-regular-expressions-nedir)**
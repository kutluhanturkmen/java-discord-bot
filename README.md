# Java Discord Bot Altyapısı

Bu proje **Java** ve **JDA** kullanılarak hazırlanmış temel Discord bot altyapısıdır.  
Projede komutlar, event listenerlar ve modüler yapı bulunmaktadır.

## Özellikler
- Ping komutu
- Ready event listener
- Modüler komut ve event sistemi

## Kurulum
1. Repo'yu klonlayın:
   ```bash
   git clone https://github.com/kullaniciadi/java-bot.git
   ```
2. Maven ile bağımlılıkları yükleyin:
   ```bash
   mvn install
   ```
3. Environment değişkeni olarak bot tokeninizi ekleyin:
   ```ini
   DISCORD_TOKEN=your-bot-token
   ```

4. Botu çalıştırın:
   ```bash
   mvn exec:java -Dexec.mainClass="com.username.bot.Bot"
   ```

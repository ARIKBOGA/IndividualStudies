import java.time.LocalTime;

public class Timer {

    public static void main(String[] a) {
        new Timer();


    }

    public Timer() {
        Clock c = new Clock(); // Thread yaratıldı fakat başlatılmadı.
        c.start(); // Thread'i başlatır.
    }

    private static class Clock extends Thread {
        LocalTime time = LocalTime.now();
        /**
         * Başlangıç zamanı sistemden alınır.
         */

        private int dk = time.getMinute(), sn = time.getSecond(), saat = time.getHour();

        /**
         * Bu saate bir saniye ekleyen method. Bu method her çağırıldığında
         * saate bir saniye eklenir ve saniye ve dakika 60'a bölünerek
         * çıkan sonuçları... Ne olduğunu biliyosunuz artık bunun :)
         */
        private void timeIncrement() {
            sn++;
            if (sn / 60 > 0) {
                dk += sn / 60;
                sn %= 60;
            }
            if (dk / 60 > 0) {
                saat += dk / 60;
                dk %= 60;
            }
        }

        /**
         * Thread start() edildiğinde çağırılan method.
         * Thread program kapatılana kadar hiç bitmesin diyorsanız, bu methodun
         * içerisinde bir sonsuz döngü ayarlamanız gerekiyor.
         */
        public void run() {
            while (true) { // Sonsuz döngümüz.
                try {
                    Thread.sleep(1000); // Thread'i 1 saniye beklet.
                    timeIncrement(); // Sonra saate bir saniye ekle.
                    System.out.print("\rThe time is : " + this); // Saati yazdır.

                } catch (InterruptedException e) {
                    e.printStackTrace(); // Thread'i uyutmaya çalışırken hata olması durumunda...
                }
            }
        }

        /**
         * Clock class'ının System.out.println() methoduna
         * parametre olarak atanması durumunda çağırılan method.
         * Clock class'ından dijital saat dizaynında bir String üretir.
         */
        public String toString() {
            String a = (saat / 10 == 0) ? "0" + saat : "" + saat;
            a += ":" + ((dk / 10 == 0) ? "0" + dk : "" + dk);
            a += ":" + ((sn / 10 == 0) ? "0" + sn : "" + sn);
            return a;
        }
    }
}
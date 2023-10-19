/*
Направете програма Bаѕе36, която печата случаен низ от букви и цифри,
 като генерира случайно long число и го конвертира към base 36 (36- тичен) формат.
 */
package UNLOCKJAVA.week1.homework2;

import java.util.Random;

public class LongBase36 {
    public static void main(String[] args) {
        long randomLong = new Random().nextLong();  // Генерираме случайно long число
        String base36String = Long.toString(randomLong, 36); // Конвертираме числото към base 36 формат
        System.out.println("Случаен base36 низ: " + base36String);
    }
}

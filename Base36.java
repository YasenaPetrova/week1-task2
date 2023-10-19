/*Говорихме, че има различни бройни системи. Има двоична, осмична, десетична шестнадесетична… и.т.н.
Една доста интересна бройна система е 36-тичната. Защо? Защото съдържа всички цифри от 0 до 9, така и всички букви от английската азбука – A до Z.
Сега задачата ви е да направите програма, която показва как изглеждат числата в различните бройни системи.
Затова трябва да отпечатате числото 0x7DEDEDE1 в:

1.Двоичен формат (с представка 0b отпред)
2.Осмичен формат (с представка 0 отпред)
3.Десетичен формат
4.Шестнадесетичен формат (с представка 0x и ако има букви в числото, те да са малки)
5.36-тично, като всички букви са главни.

 */
package unlockjava.week1.homework2;

public class Base36 {
    public static void main(String[] args) {
                int number = 0x7DEDEDE1; // Числото в шестнадесетичен формат

                // Двоичен формат с представка 0b
                String binaryFormat = "0b" + Integer.toString(number, 2);
                System.out.println("Двоичен формат: " + binaryFormat);

                // Осмичен формат с представка 0
                String octalFormat = "0" + Integer.toString(number, 8);
                System.out.println("Осмичен формат: " + octalFormat);

                // Десетичен формат
                System.out.println("Десетичен формат: " + number);

                // Шестнадесетичен формат с представка 0x и малки букви
                String hexFormat = "0x" + Integer.toString(number, 16).toLowerCase();
                System.out.println("Шестнадесетичен формат: " + hexFormat);

                // 36-тичен формат с главни букви
                String base36Format = Integer.toString(number,36).toUpperCase();
                System.out.println("36-тичен формат: " + base36Format);


            }
        }
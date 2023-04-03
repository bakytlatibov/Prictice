import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
//        int[] ints = {5, 3, 56, 7, 3, 2, 23, 5, 6, 1};
//        int max = ints[0];
//        int min = ints[0];
//        int maxInd = 0;
//        int minInd = 0;
//        for (int i = 0; i < ints.length; i++) {
//            if (ints[i] < min) {
//                minInd = i;
//                min = ints[i];
//            } else if (ints[i] > max) {
//                maxInd = i;
//                max = ints[i];
//            }
//        }
//        int temp = ints[minInd];
//        ints[minInd] = ints[maxInd];
//        ints[maxInd] = temp;
//        Arrays.stream(ints).forEach(System.out::println);


//    Создорду кайтааруучу метод тузунуз, параметрине String типтеги массив алсын. Эгерде ал массивдин ичиндеги
//    элемент так ортосунда "K" деген символду камтыса анда ал созду баш (чон) тамга менен алмаштырыныз.
//    МИСАЛЫ:
//    String array = new String[]{"hello", "world", "caKes"};
//    консолго:
//    оригинал массив:
//    hello, world, caKes
//    метод колдонулгандан кийинки массив
//    hello, world, CAKES

        String[] strings = {"bakyt", "asan", "", "bekkzat", "caKes"};
        Arrays.stream(strings).forEach(System.out::println);



        method(strings);

    }

    public static void method(String[] words) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf('k')==words[i].length()/2) {
                System.out.println(words[i].toUpperCase());

            }
        }


    }


}
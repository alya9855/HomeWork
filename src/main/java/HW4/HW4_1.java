package HW4;

public class HW4_1 {
    /**
    public static void main(String[] args) {
        String s = "Перестановочный алгоритм быстрого действия";
        String s1 = "Перевыборы выбранного президента";
        String s2 = "Посмотрите как Рите нравится ритм";
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};

        printO(s);
        System.out.println(countE(s1));

    }
     **/

    public static void printO1(String str, char a) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a){
                System.out.println(str.charAt(i));
            }
        }
    }


    public static int countE1(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'е'){
                count++;
            }
        }
        return count;
    }

    public static void rit(String str){
        str = str.toLowerCase();
        int index = str.indexOf("рит");
        while (index != -1) {
            System.out.println(index);
            index = str.indexOf("рит", index + 1);
        }
    }

    public static int doNotCountE(String [][]arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(!arr[i][j].contains("е")){
                    count++;
                }
            }
        }
        return count;
    }


    public static void printO(String str) {
        char[] sentence = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            sentence[i] = str.charAt(i);
        }
        for (int i = 0; i < sentence.length; i++) {
            if (sentence[i] == 'о'){
                System.out.println(sentence[i]);
            }
        }
    }

    public static int countE(String str) {
        char[] sentence = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            sentence[i] = str.charAt(i);
        }
        int count = 0;
        for (int i = 0; i < sentence.length; i++) {
            if (sentence[i] == 'е'){
               count++;
            }
        }
        return count;
    }
}
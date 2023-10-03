import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n = 0;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите слова какой длины необходимо удалить:");
        n = sc1.nextInt();

        String str = "";
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите предложение:");
        str = sc2.nextLine();

       String[] strArr = str.split(" ");//разбиваем текст на массив слов
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<strArr.length;i++){

            char first = strArr[i].charAt(0); // первая буква каждого слова
            if(!((strArr[i].length() == n) && strArr[i].matches("^(?i:[bcdfghjklmnpqrstvwxz]).*"))){

                sb.append(strArr[i]).append(" ");
            }

        }
        String outText = sb.toString().trim();

        System.out.println("Полученное предложение:");
        // вывод результата
        System.out.print(outText+" "+"\n\n");


    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("введите фразу!");
        String text = scr.nextLine();

        text=RemoveArticles.removeArticles(text);
        text=Methods.changeChar1(text);
        text= DoubleLiters.doubleLiters(text);
        text= RemoveLastE.removeLastE(text);
        System.out.println(text);

    }
}


import java.util.Scanner;
public class Main2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  name= sc.nextLine();
        if ("Вячеслав".equals(name)){
            System.out.println("Привет, Вячеслав");}
        else
        {System.out.println("Нет такого имени");}
    }
}

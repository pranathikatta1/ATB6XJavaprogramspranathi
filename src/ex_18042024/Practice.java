package ex_18042024;

public class Practice {

    public static void main(String[] args) {

        int a= 20;
        int result = ++a;

        System.out.println(a); //21
        System.out.println(result); //21

        int b =30;
        int result1 = b++;

        System.out.println(b); //31
        System.out.println(result1);//30

        int b1= 10;
        System.out.println(b1++); //10 - This is like result
        System.out.println(b1); //11

    }

}

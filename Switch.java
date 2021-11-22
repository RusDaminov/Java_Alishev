import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input age");
        int age = scanner.nextInt();
//        if(age==10)
//            System.out.println("schooler");
//        else if(age==18)
            System.out.println("finished school");
        switch(age){
            case 0 :
                System.out.println("you are a newborn");
                break;
            case 7 :
                System.out.println("you are a schoolar");
                break;
            case 18 :
                System.out.println("finished school");
                break;
//        String age = scanner.nextInt();
//        switch(age){
//            case "zero" :
//                System.out.println("you are a newborn");
//                break;
//            case "seven" :
//                System.out.println("you are a schoolar");
//                break;
//            case "eighteen" :
//                System.out.println("finished school");
//                break;


        }
    }
}

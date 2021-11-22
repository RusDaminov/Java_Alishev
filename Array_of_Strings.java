

public class Array_of_Strings {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        String[] strings = new String[3];
        strings[0] = "Hello";
        strings[1] = "bye";
        strings[2] = "Java";
//        System.out.println(strings[0]);
//        System.out.println(strings[2]);

//        for(int i =0; i<strings.length; i++)
//            System.out.println(strings[i]);

        for(String string:strings){
            System.out.println(string);
        }
        int[] numbers1 = {1,2,3};
        int sum = 0;
        for(int x:numbers1){
            sum = sum+x;
            System.out.println(sum);
        }
    }
}

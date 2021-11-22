
public class Arrays {
    public static void main(String[] args) {
        int number = 10;
//        char character = 'a';
//        String s = "Hello";
//        String str = new String("Hello");
        int[] numbers = new int[5];     // numbers -> [array] pointer
        for(int i = 0; i<numbers.length; i++){
            numbers[i] = i*10;
            System.out.println(numbers[i]);
        }
        System.out.println();
        int[] numbers1 = {1,2,3,4};
        for(int i = 0; i<numbers.length; i++)
            System.out.println(numbers1[i]);
        //System.out.println(numbers[0]); // 0 1 2 3 4
        //System.out.println(numbers[5]);
    }
}

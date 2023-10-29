package Arrays;

public class AvrageValueArray {
    public static void main(String[] args) {

        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
        System.out.println(avrageValue(numbers));

    }
    public static int avrageValue(int[] numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
        System.out.println(numbers.length);
        return sum / numbers.length;
    }
}

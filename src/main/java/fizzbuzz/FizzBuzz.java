package fizzbuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        playFizzBuzz(1, 100, 3, "Fizz", 5, "Buzz");
    }

    public static void playFizzBuzz(int start, int end, int fizzNumber, String fizzWord, int buzzNumber, String buzzWord) {
        for (int i = start; i <= end; i++) {
            String output = "";
            if (i % fizzNumber == 0) output += fizzWord;
            if (i % buzzNumber == 0) output += buzzWord;
            System.out.println(output.isEmpty() ? i : output);
        }
    }
}

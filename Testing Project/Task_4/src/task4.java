import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class task4 {
    public static void main(String[] args) throws IOException {
        List<Integer> numbers = new ArrayList<>();
        int steps = 0;

        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        String st;
        while ((st = br.readLine()) != null) {
            numbers.add(Integer.parseInt(st));
        }

        Collections.sort(numbers);

        int median = numbers.get(numbers.size() / 2);

        for (int num : numbers) {
            steps += Math.abs(num - median);
        }

        System.out.println(steps);
    }
}
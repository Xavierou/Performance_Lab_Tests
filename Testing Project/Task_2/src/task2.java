import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class task2 {
    public static void main(String[] args) throws IOException {
        List<String> params = new ArrayList<>();
        List<Point> pointList = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        String st;
        while ((st = br.readLine()) != null) {
            params.add(st);
        }
        br.close();

        String[] coords = params.getFirst().split(" ");
        Circle circle = new Circle(new Point(
                Integer.parseInt(coords[0]), Integer.parseInt(coords[1])), Integer.parseInt(params.getLast()));
        params.clear();

        br = new BufferedReader(new FileReader(args[1]));
        while ((st = br.readLine()) != null) {
            params.add(st);
        }

        for (String p : params) {
            String[] buf = p.split(" ");
            pointList.add(new Point(Integer.parseInt(buf[0]), Integer.parseInt(buf[1])));
        }

        for (Point p : pointList) {
            double distance = circle.calculateDistance(p);

            if (distance < circle.getRadius()) {
                System.out.println(1);
            } else if (distance > circle.getRadius()) {
                System.out.println(2);
            }
            else {
                System.out.println(0);
            }
        }
    }
}
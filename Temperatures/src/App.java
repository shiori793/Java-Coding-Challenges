import java.util.*;

public class App {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        int result = 0;

        if(n != 0){
            result = in.nextInt();
            for (int i = 0; i < n-1; i++) {
                int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
                if(Math.abs(result) > Math.abs(t)){
                    result = t;
                }else if(Math.abs(result) == Math.abs(t)){
                    result = ((result > 0) || (t > 0)) ? Math.abs(result) : result;
                }
            }
        }

        in.close();

        System.out.println(result);
    }
}
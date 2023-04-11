import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Level1 {

    public void printStar(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=0 ; i<a ; i++){
            for(int j =0; j<b; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public String stringConcat(){
        String s = "adksnZcjd";

        String upperStr =  Arrays.stream(s.split("")).filter(str -> str.equals(str.toUpperCase()))
            .sorted(Comparator.nullsLast(Comparator.naturalOrder()))
            .collect(Collectors.joining());

        String lowerStr = Arrays.stream(s.split("")).filter(str -> str.equals(str.toLowerCase()))
            .sorted(Comparator.nullsLast(Comparator.naturalOrder()))
            .collect(Collectors.joining());

        return lowerStr + upperStr;
    }

    public int absolute() {
        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};

        int result = 0;

        for(int i=0; i<absolutes.length; i++){
            if(signs[i]){ result += absolutes[i]; }
            else { result -= absolutes[i]; }
        }
        return result;
    }
}

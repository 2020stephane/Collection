import java.util.Arrays;

public class MainClass {

   public static void main(String[] args) {
        if (args.length != 0) {
            System.out.println("les arguments sont :");
            for (String arg : args)
                System.out.println(arg);
            Arrays.sort(args);
            System.out.println("les arguments tries sont :");
            for (String arg : args)
                System.out.println(arg);
        }
    }
}

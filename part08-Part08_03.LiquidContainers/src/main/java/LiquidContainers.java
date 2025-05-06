
import java.util.Scanner;

public class LiquidContainers {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int liquid1_ = 0;
        int liquid2_ = 0;
        int count = 0;

        System.out.println("First: " + liquid1_ + "/100");
        System.out.println("Second: " + liquid2_ + "/100");

        while (true) {
            System.out.print("> ");
            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            count++;
            String[] split = input.split(" ");
            String firstWord = split[0];
            String secondWord = split[1];
            int volume = Integer.valueOf(secondWord);

            if(volume < 0){
                continue;
            }

            if (firstWord.equals("add")) {
                if (liquid1_ + volume > 100) {
                    liquid1_ = 100;
                } else {
                    liquid1_ += volume;
                }
            }
            if (firstWord.equals("move")) {

                int amountToTransfer = Math.min(liquid1_, volume);
                liquid1_ -= amountToTransfer;
                liquid2_ += amountToTransfer;

                if(liquid2_ > 100){
                    liquid2_ = 100;
                }
            }
            if (firstWord.equals("remove")) {
                if (volume>liquid2_) {
                    liquid2_ = 0;
                } else {
                    liquid2_ -= volume;
                }
            }

            System.out.println("First: " + liquid1_ + "/100");
            System.out.println("Second: " + liquid2_ + "/100");
        }

    }

}

import java.util.Date;
import java.util.Random;
import java.util.random.*;
import java.util.Scanner;

public class Lottery {
    private int lotteryNumber;

    public Lottery() {



    }

    public String luckyNumber() {
        Random random = new Random();
        this.lotteryNumber = random.nextInt(0,100);
        return String.format("%02d", lotteryNumber);

    }




}

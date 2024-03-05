import java.util.Date;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();


        // Gets random number from 0-4
        int randomNumber = random.nextInt(5);

        switch (randomNumber) {
            case 0:
                System.out.println("Числото е 0.");
                break;
            case 1:
                System.out.println("Числото е 1.");
                break;
            case 2:
                System.out.println("Числото е 2.");
                break;
            default:
                System.out.println("Изтеглихте число по-голямо от зададените (0-2).");
        }

    }
}

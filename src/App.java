import java.util.Scanner;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        String date_now = LocalDate.now().toString().replaceAll("-", "");
        int date_now_int = Integer.parseInt(date_now);
        System.out.println(date_now);
        int lediga_platser = 0;
        int[] personnummer = new int[20];
        Scanner val = new Scanner(System.in);
        int val1 = 0;
        // int barn_billjet = 0;
        int date_now_int_18 = (date_now_int - 180000);
        while (val1 != 4) {
            System.out.println("Välj ett alternativ:");
            System.out.println("1:lägg till passagerare");
            System.out.println("2:lediga platser");
            System.out.println("3:Hur mycket har man tjänat");
            System.out.println("4.Avsluta");
            System.out.print("Ange val: ");
            val1 = val.nextInt();
            if (val1 == 1) {
                lagg_till_passagerare(personnummer, val);
            } else if (val1 == 2) {
                lediga_platser = rakna_lediga_platser(personnummer);
                System.out.println("Det finns " + lediga_platser + " lediga platser");
            } else if (val1 == 3) {
                val3(personnummer, date_now_int_18);
            }
        }
        val.close();
    }
    public static void lagg_till_passagerare(int[] personnummer, Scanner mainScanner) {
        int userInput = 0;
        System.out.print("Skriv perssonnummer för att bokam i detta format (ÅÅÅÅMMDD): ");
        try {
            userInput = mainScanner.nextInt();
            System.out.println("Du är inbokad");
        } catch (Exception e) {
            System.out.println(
                    "ERROR Ditt personnummer är för långt vänligen skriv i detta format ÅÅÅÅMMDD eller så har du skrivit bokstäver");
            mainScanner.nextLine();
            return;
        }
        for (int i = 0; i < personnummer.length; i++) {
            if (personnummer[i] == 0) {
                personnummer[i] = userInput;
                break;
            }
        }
    }
    public static void val3(int[] personnummer, int date_now_int_18) {
        int lediga_platser = rakna_lediga_platser(personnummer);
        int barn_billjet = 0;
        for (int i = 0; i < personnummer.length; i++) {
            if (personnummer[i] > date_now_int_18 && personnummer[i] != 0) {
                barn_billjet++;
            }
        }
        System.out.println("Du har tjänat " + ((int) ((20 - lediga_platser) * 299.9) - (150 * barn_billjet)) + "kr");
    }
    public static int rakna_lediga_platser(int[] personnummer) {
        int lediga_platser = 0;
        for (int i = 0; i < personnummer.length; i++) {
            if (personnummer[i] == 0) {
                lediga_platser++;
            }
        }
        return lediga_platser;
    }
}

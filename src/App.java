import java.util.Scanner;
import java.time.LocalDate;
public class App {
    public static void main(String[] args) throws Exception {
        String date_now = LocalDate.now().toString().replaceAll("-","");
        int date_now_int = Integer.parseInt(date_now.substring(2));
        System.out.println(date_now.substring(2));
        int lediga_platser = 0;
        int[] personnummer = new int[20];
        Scanner val = new Scanner(System.in);
        int val1 = 0;
        int barn_billjet = 0;
        while (val1 != 4) {
            System.out.println("Välj ett alternativ:");
            System.out.println("1:lägg till passagerare");
            System.out.println("2:lediga platser");
            System.out.println("3:Hur mycket har man tjänat");
            System.out.println("4.Avsluta");
            System.out.print("Ange val: ");
            val1 = val.nextInt();
            if (val1 == 1) {
                // String ageinput = "";
                int userInput = 0;
                try {
                    // System.out.println("Barn eller vuxen billjet?");
                    // int ageinput = val.nextInt();
                    // // Räkna ut ålder
                    // // 
                    // if (ageinput <18) {
                    //     barn_billjet++;
                    // }
                    System.out.print("Skriv perssonnummer för att bokam i detta format (ÅÅMMDD): ");
                    userInput = val.nextInt();
                    System.out.println("Du är inbokad");

                    if ((userInput-(date_now_int-180000)    )>0) {
                        ++barn_billjet;
                    }

                } catch (Exception e) {
                    System.out.println(
                            "ERROR Ditt personnummer är för långt vänligen skriv i detta format ÅÅMMDDXXXX eller så har du skrivit bokstäver");
                }

                for (int i = 0; i < personnummer.length; i++) {

                    if (personnummer[i] == 0) {
                        personnummer[i] = userInput;
                        break;
                    }

                }

            } else if (val1 == 2) {
                lediga_platser = 0;
                for (int i = 0; i < personnummer.length; i++) {
                    if (personnummer[i] == 0) {
                        lediga_platser++;

                    }

                }
                System.out.println("Det finns " + lediga_platser + " lediga platser");
            } else if (val1 == 3) {
                lediga_platser = 0;
                for (int i = 0; i < personnummer.length; i++) {
                    if (personnummer[i] == 0) {
                        lediga_platser++;

                    }

                }
                System.out.println("Du har tjänat " + ((int) ((20 - lediga_platser) * 299.9) - (150*barn_billjet)) + "kr");
            }

        }
        val.close();

    }

}

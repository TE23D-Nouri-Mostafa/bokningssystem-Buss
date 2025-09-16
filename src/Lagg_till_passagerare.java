// import java.util.Scanner;
// import java.time.LocalDate;

// public class Lagg_till_passagerare {

//     // public static void säg_hej() {
//     //     System.out.println("HEEEEJ");
//     // }

//     // public static int[] returnera_array() {
//     //     int[] arrayen = new int[10];
//     //     return arrayen;
//     // }

//     public static void lagg_till_passagerare( int[] personnummer1) {
//         String date_now = LocalDate.now().toString().replaceAll("-", "");
//         int date_now_int = Integer.parseInt(date_now.substring(2));
//         Scanner val = new Scanner(System.in);
//         int barn_billjet = 0;
//         int userInput = 0;
//         // int[] personnummer = new int[20];
//         System.out.print("Skriv perssonnummer för att bokam i detta format (ÅÅMMDD): ");

//         try {
//             userInput = val.nextInt();
//             System.out.println("Du är inbokad");
//             if ((userInput - (date_now_int - 180000)) > 0) {
//                 ++barn_billjet;
//             }

//         } catch (Exception e) {
//             System.out.println(
//                     "ERROR Ditt personnummer är för långt vänligen skriv i detta format ÅÅMMDD eller så har du skrivit bokstäver");
//         }

//         for (int i = 0; i < personnummer1.length; i++) {

//             if (personnummer1[i] == 0) {
//                 personnummer1[i] = userInput;
//                 break;
//             }

//         }

//     }
// }

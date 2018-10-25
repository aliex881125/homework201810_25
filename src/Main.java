import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
       if(a<b){
           if (a%2==0&&b%2==0){
               int result =0;
               for(int i =a;i<=b;i = i+2 ){
                   result = result+i;
               }
               System.out.println(result);
           }
           if (a%2==0&&b%2!=0){
               int result =0;
               for(int i =a;i<=b-1;i = i+2 ){
                   result = result+i;
               }
               System.out.println(result);
           }
           if (a%2!=0&&b%2==0){
               int result =0;
               for(int i =a+1;i<=b;i = i+2 ){
                   result = result+i;
               }
               System.out.println(result);
           }
           if (a%2!=0&&b%2!=0){
               int result =0;
               for(int i =a+1;i<=b-1;i = i+2 ){
                   result = result+i;
               }
               System.out.println(result);
           }
       }//---------------------------------------------第四題


//        Scanner scn = new Scanner(System.in);
//        int a = scn.nextInt();
//        int b = scn.nextInt();
//        if(a<b) {
//            if (a % 2 == 0 && b % 2 == 0) {
//                int result = 0;
//                for (int i = a + 1; i <= b - 1; i = i + 2) {
//                    result = result + i;
//                }
//                System.out.println(result);
//            }
//           else if (a % 2 == 0 && b % 2 != 0) {
//                int result = 0;
//                for (int i = a + 1; i <= b; i = i + 2) {
//                    result = result + i;
//                }
//                System.out.println(result);
//            }
//            else if (a % 2 != 0 && b % 2 == 0) {
//                int result = 0;
//                for (int i = a; i <= b - 1; i = i + 2) {
//                    result = result + i;
//                }
//                System.out.println(result);
//            }
//            else if (a % 2 != 0 && b % 2 != 0) {
//                int result = 0;
//                for (int i = a; i <= b; i = i + 2) {
//                    result = result + i;
//                }
//                System.out.println(result);
//            }
//        }-----------------------------------------第三題




//        Scanner scn = new Scanner(System.in);
//        String v1 = scn.next();
//        switch (v1){
//            case "Spring":
//                System.out.println("2~4月");
//                break;
//            case "Summer":
//                System.out.println("5~7月");
//                break;
//            case "Fall":
//                System.out.println("8~10月");
//                break;
//            case "Winter":
//                System.out.println("11~1月");
//                break;
//        }---------------------------------第二題



//        Scanner scn = new Scanner(System.in);
//        int v1 = scn.nextInt();
//        switch (v1){
//            case 1:
//                System.out.println("January");
//                break;
//            case 2:
//                System.out.println("February");
//                break;
//            case 3:
//                System.out.println(" March");
//                break;
//            case 4:
//                System.out.println("April");
//                break;
//            case 5:
//                System.out.println("May");
//                break;
//            case 6:
//                System.out.println("June");
//                break;
//            case 7:
//                System.out.println("July");
//                break;
//            case 8:
//                System.out.println("August");
//                break;
//            case 9:
//                System.out.println("September");
//                break;
//            case 10:
//                System.out.println("October");
//                break;
//            case 11:
//                System.out.println("November");
//                break;
//            case 12:
//                System.out.println("December");
//                break;
//        }-----------------------------------------第一題

    }
}

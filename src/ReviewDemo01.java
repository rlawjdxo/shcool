import java.util.Scanner;
//v5
public class ReviewDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean isprime = true;

        //       for (int k=2; k<=number; k++){
        //           if (number % k==0) {
        //               isprime = false;
        //               break; //첫번째 약수가 발견되면 for문 탈출
        //           }
        //         //  System.out.println(k);
        //       }

        int k = 2;
        while (k < number) {
            if (number % k == 0) {//isprime 유지되면 ture
                isprime = false;
                break;
            }
           // System.out.println(k);
            k++;
        }
        System.out.println(number + (isprime ? "은(는) 소수!" : "은(는) 소수 아닙니다!"));
//        if (isprime)//isprime 유지되면 ture
//            System.out.println(number + "은(는) 소수!");
//        else
//            System.out.println(number + "은(는) 소수 아닙니다!");
    }
}





//    import java.util.Scanner;
//    //v4
//    public class ReviewDemo01 {
//        public static void main(String[] args) {
//            Scanner sc= new Scanner(System.in);
//            int number = sc.nextInt();
//            boolean isprime = true;
//
//            for (int k=2; k<=number; k++){
//                if (number % k==0) {
//                    isprime = false;
//                    break; //첫번째 약수가 발견되면 for문 탈출
//                }
//                System.out.println(k);
//            }
//            if (isprime)//isprime 유지되면 ture
//                System.out.println(number + "은(는) 소수!");
//            else
//                System.out.println(number + "은(는) 소수 아닙니다!");
//        }
//    }




//    import java.util.Scanner;
//    //v3
//    public class ReviewDemo01 {
//        public static void main(String[] args) {
//            Scanner sc= new Scanner(System.in);
//            int number = sc.nextInt();
//            boolean isprime = true;
//
//            for (int k=2; k<=number; k++){//반복 횟수 2회감소
//                if (number % k==0) //입력된 수를 k로 나누었을때 나머지가 0
//                    isprime = false;
//            }
//            if (isprime)//isprime 유지되면 ture
//                System.out.println(number + "은(는) 소수!");
//            else
//                System.out.println(number + "은(는) 소수 아닙니다!");
//        }
//    }




//    import java.util.Scanner;
//    //v2
//    public class ReviewDemo01 {
//        public static void main(String[] args) {
//            Scanner sc= new Scanner(System.in);
//            int number = sc.nextInt();
//            int cnt =0;
//
//            for (int k=2; k<=number; k++){//반복 횟수 2회감소
//               if (number % k==0)
//                    cnt++;
//            }
//            if (cnt ==0)//카운트가 0이 유지되면 ture
//                System.out.println(number + "은(는) 소수!");
//            else
//                System.out.println(number + "은(는) 소수 아닙니다!");
//        }
//    }



//import java.util.Scanner;
//v1
//public class ReviewDemo01 {
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        int number = sc.nextInt();
//        int cnt =0;
//
//        for (int k=1; k<=number; k++){
//            if (number % k==0)
//                cnt++;
//        }
//        if (cnt ==2)
//             System.out.println(number + "은(는) 소수!");
//        else
//        System.out.println(number + "은(는) 소수 아닙니다!");
//    }
//}

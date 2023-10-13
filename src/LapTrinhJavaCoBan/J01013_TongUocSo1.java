package LapTrinhJavaCoBan;

import java.util.Scanner;

public class J01013_TongUocSo1 {
    public static final int MAX_N = 2000001;

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        int snt[] = new int[MAX_N];
        for(int i=2; i<Math.sqrt(MAX_N); i++)
        {
            if(snt[i] == 0)
                for(int j=i*i; j<MAX_N; j+=i)
                {
                    snt[j] = i;
                }
        }
        snt[0] = 1; snt[1] = 1;
        while(n-- != 0)
        {
            int a = sc.nextInt();
            while(snt[a]!=0)
            {
                sum += snt[a];
//                System.out.print( snt[a]+" ");
                a/=snt[a];
            }
            sum+=a;
//            System.out.println(a);
        }
        System.out.println(sum);
    }

    public static int sumOfPrimes(int a) {
        int sum = 0;
        int i = 2;
        while (a != 1) {
            if (a % i == 0) {
                sum += i;
                a /= i;
            } else {
                i ++;
            }
        }
        return sum;
    }
}

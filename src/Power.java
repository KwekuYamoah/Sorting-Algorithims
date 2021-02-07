public class Power {
    /**
     * Computing a**n asumming
     * n is a positive integer
     */

    public static int power(int a, int n){
        int answer = a; //initially result will hold the base integer
        for(int i = 1; i < n; i++){
            answer *= a;
        }

        return answer;
    }

    public static int powerV2(int a, int n){
        int answer = 1;
        while( n > 0){
            //if odd exponent
            if((n & 1)  == 1){
                answer *= a;
            }

            /**
             * n is even
             * divide by 2
             * and do a**a
             */
            n *= 0.5; // n*0.5
            a *= a; //x^2
        }

        return answer;
    }

    public static int powerV3(int a, int n){
        int result = 1;

        while (n != 0)
        {
            result *= a;
            n--;
        }

        return result;
    }


    public static void main(String[] args){
        System.out.println(power(0,0));
        System.out.println(powerV2 (3,3));
        System.out.println(powerV3 (4,2));

    }
}

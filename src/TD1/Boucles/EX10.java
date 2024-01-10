package TD1.Boucles;

public class EX10 {

        public static void main(String[] args) {
            int number;
            for (int i = 100; i <= 999; i++) {
                number = i;
                int sum = 0;
                while (number > 0) {
                    int chiffre = number % 10;
                    sum += Math.pow(chiffre, 3);
                    number /= 10;
                }
                if (sum == i) {
                    System.out.println(i);
                }
            }
        }

}

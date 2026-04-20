
        public class Tabuadas {
            public static void main(String[] args) {
        
                for (int n = 1; n <= 10; n++) {
                    System.out.println("\nTabuada do " + n);
        
                    for (int i = 0; i <= 10; i++) {
                        System.out.printf("%2d x %2d = %3d\n", n, i, n * i);
                    }
                }
            }
        }
public class OOPConcepts {
        private void privMethod() {
            System.out.println("To jest metoda prywatna");
        }

        void packagePrivateMethod() {
            System.out.println("To jest metoda o dostepie 'package-private'");
            privMethod();
        }

        public void pubMethod() {
            System.out.println("To jest metoda publiczna");
            privMethod();
        }

        public static void staticPubMethod() {
            System.out.println("To jest metoda statyczna i publiczna");
        }
}

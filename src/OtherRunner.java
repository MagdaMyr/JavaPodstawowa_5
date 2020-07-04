public class OtherRunner {

    public static void main(String[] args) {
        OOPConcepts oopConcepts = new OOPConcepts();
        //oopConcepts.packagePrivateMethod();
        oopConcepts.pubMethod();
        //tak nie robimy!
        //oopConcepts.staticPubMethod();

        //metode statyczna wolam z poziomu klasy
        OOPConcepts.staticPubMethod();
    }
}

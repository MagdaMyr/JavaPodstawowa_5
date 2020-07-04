public class PersonRunner {
        public static void main(String[] args) {
            Person pm = new Person("Janusz Janusz", "47012962973");
            System.out.println(pm);
            pm.printHasReachedRetirementAge();
            Person pk = new Person("Grazyna Janusz", "86071975344");
            System.out.println(pk);
            pk.printHasReachedRetirementAge();
            System.out.print("Roznica wieku miedzy nimi to: ");
            pm.printYearsDiff(pk);
            pk.printYearsDiff(pm);
            pm.printYearsToRetirement();
            pk.printYearsToRetirement();
        }
}

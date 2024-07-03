public class InheritedWizards {
    public static void main(String[] args) {
        // Step 5
        Storm s = new Storm("wind", false, "Ron Weasley");
        System.out.println(s.announce());

        // Step 8
        Apprentice a = new Apprentice("Hermione Grainger");
        Storm stormA = a.castWindStorm();
        System.out.println(stormA.announce());

        // Step 12
        Wizard w = new Wizard("Severus Snape");
        Storm stormB = w.castRainStorm();
        System.out.println(stormB.announce());

        // Step 17
        Master m = new Master("Albus Dumbledore");
        Storm stormC = m.castRainStorm();
        System.out.println(stormC.announce());
        Storm stormD = m.castLightningStorm();
        System.out.println(stormD.announce());
    }
}
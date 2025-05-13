public class normalizeAngle {
    public normalizeAngle(int angle) {
        /*
        int nAngle = angle % 359;
        System.out.println(Math.abs(nAngle));
        */
        int nAngle = Math.floorMod(angle,359);
        System.out.println(nAngle);
    }
}
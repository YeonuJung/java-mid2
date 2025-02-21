package generic.test.unit;

public class UnitUtil {

    public static <T extends BioUnit> T maxHp(T u1, T u2) {
        if (u1.getHp() > u2.getHp()) {
            return u1;
        } else {
            return u2;
        }
    }
}

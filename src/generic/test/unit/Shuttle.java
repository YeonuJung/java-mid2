package generic.test.unit;

public class Shuttle <T extends BioUnit> {
    private T unit;

    public void showInfo() {
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
    }

    public void in(T unit) {
        this.unit = unit;
    }

    public T out(){
        return unit;
    }

}

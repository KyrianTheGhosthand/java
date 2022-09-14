package part6;

public class Officer {
    protected int base;
    protected int bonus;
    protected int penalty;
    protected int actual;
    public Officer(){}
    public Officer(int base, int bonus, int penalty, int actual) {
        this.base = base;
        this.bonus = bonus;
        this.penalty = penalty;
        this.actual = actual;

    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getPenalty() {
        return penalty;
    }

    public void setPenalty(int penalty) {
        this.penalty = penalty;
    }

    public int getActual(int base, int bonus, int penalty) {
        actual = base + bonus - penalty;
        return actual;
    }

    public void setActual(int actual) {
        this.actual = actual;
    }

    @Override
    public String toString() {
        return "Officer{" +
                "base=" + base +
                ", bonus=" + bonus +
                ", penalty=" + penalty +
                ", actual=" + actual +
                '}';
    }


}

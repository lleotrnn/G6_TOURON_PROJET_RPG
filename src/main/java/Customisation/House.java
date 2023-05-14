package Customisation;

public enum House {
    GRYFFINDOR(0.75, 0.7, 1, 1),
    RAVENCLAW(1,1,1,1),
    HUFFLEPUFF(1,0.7,1.5,1),
    SLYTHERIN(1,0.7,1,1.3);

    private final double reducedDamage;
    private final double accuracyRate;
    private final double potionPowerRate;
    private final double damageRate;

    House(double reducedDamage, double accuracyRate, double potionPowerRate, double damageRate) {
        this.reducedDamage = reducedDamage;
        this.accuracyRate = accuracyRate;
        this.potionPowerRate = potionPowerRate;
        this.damageRate = damageRate;
    }

    public double getReducedDamage() {
        return reducedDamage;
    }

    public double getAccuracyRate() {
        return accuracyRate;
    }

    public double getPotionPowerRate() {
        return potionPowerRate;
    }

    public double getDamageRate() {
        return damageRate;
    }
}
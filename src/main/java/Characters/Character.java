package Characters;

public abstract class Character {

    public String name;
    public int maxHp, hp, currentHp, attack, defense;

    public Character(String name, int hp) { //  int xp
        this.name = name;
        this.maxHp = hp;
        this.currentHp = hp;
    }

    public String getName() {
        return name;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setMaxHp(int maxHp) {
        this.hp = maxHp;
    }

    public void setHp(int hp) {
        this.currentHp = hp;
    }
    public void setCurrentHp(int currentHp) {
        if (hp < 0) {
            this.currentHp = 0;
        } else if (currentHp > maxHp) {
            this.currentHp = maxHp;
        } else {
            this.currentHp = currentHp;
        }
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public boolean isDefeated() {
        return hp <= 0;
    }

    public void defend() {
    }

    public void damageTaken(int damage) {
        int damageTaken = damage - defense;
        if (damageTaken < 0) {
            damageTaken = 0;
        }
        currentHp -= damageTaken;
    }
}


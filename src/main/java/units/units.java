package units;

public class units {
    public int health;
    public int damage;
    public  int defence;
    public int actionPoints;
    public  int mana;
    // public boolean haveMana;
    public String name;
    public int initiave;

    public units(int health, int damage, int defence, int actionPoints, int mana, String name, int initiave) {
        this.health = health;
        this.damage = damage;
        this.defence = defence;
        this.actionPoints = actionPoints;
        this.mana = mana;
        this.name = name;
        this.initiave = initiave;
    }

    public boolean hasAP() {
        if(actionPoints > 0){
            return true;
        } else return false;
    }
   
}

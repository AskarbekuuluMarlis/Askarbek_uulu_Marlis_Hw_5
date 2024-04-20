public class Boss {
    private int damage;
    private int health;
    private String bossDef;



    public void setDamage(int damage) {
        this.damage = damage;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void setBossDef(String bossDef) {
        this.bossDef = bossDef;
    }

    public int getDamage() {return this.damage;}
    public int getHealth() {return this.health;}
    public String getBossDef() {return this.bossDef;}

}


public class Hero {
    private int heroHealth;
    private int heroDamage;
    private String heroAbillyty;

    public Hero(int heroHealth, int heroDamage, String heroAbillyty) {
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
        this.heroAbillyty = heroAbillyty;
    }

    public Hero(int heroHealth, int heroDamage) {
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;

    }

    public Hero(int heroHealth, String heroAbillyty, int heroDamage) {
        this.heroHealth = heroHealth;
        this.heroAbillyty = heroAbillyty;
        this.heroDamage = heroDamage;

    }

    public String getHeroAbillyty() {
        return heroAbillyty;
    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public String toString() {
        return "Health: " + heroHealth + "\nDamage: " + heroDamage + "\nAbilyty: " + heroAbillyty;
    }
}


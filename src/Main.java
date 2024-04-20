public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(50);
        boss.setHealth(500);
        boss.setBossDef("Phisical");
        System.out.println(" boss health : " + boss.getHealth() + " boss def : "
                + boss.getBossDef() + " boss damage : " + boss.getDamage());
        createHeroes();

    }

    public static Hero[] createHeroes() {

        Hero hero = new Hero(200, 15, "invisibility");
        Hero Myhero = new Hero(350, 25);
        Hero superhero = new Hero(250, "flight", 10);

        Hero[] heroes = {hero, Myhero, superhero};

        for (Hero hero1 : heroes) {
            System.out.println(hero1);
        }

        return heroes;
    }


}

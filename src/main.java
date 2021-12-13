public class main {
    public static void main(String[] args) {
        Boss boss1 = new Boss();
        boss1.setBossHealth(600);
        boss1.setBossDamage(50);
        boss1.setBossDefence("Telepathy");
        System.out.println("Boss Health: " + boss1.getBossHealth() + "\n" + "Boss Damage: " + boss1.getBossDamage() + "\n"
                + "Boss Defence: " + boss1.getBossDefence());
        System.out.println("\n");
        for (int i = 0; i < createHeroes().length; i++) {

            System.out.println(createHeroes()[i].getHeroName() + createHeroes()[i].getHeroHealth() + " " + createHeroes()[i].getHeroDamage() + " " + createHeroes()[i].getHeroSuperAbility());

        }
    }
    public static Hero[] createHeroes () {
        Hero Ling = new Hero("Ling: ",200, 35, "Weightlessness");
        Hero Guss = new Hero("Guss: ",250, 20, "Telepathy");
        Hero Terizla = new Hero("Terizla: ",400, 10,"Tank");
        Hero[] heroMass = {Ling, Guss, Terizla};
        return heroMass;

    }
}

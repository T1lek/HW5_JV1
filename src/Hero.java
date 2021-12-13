

public class Hero {
    private String heroName;
    private int heroHealth;
    private int heroDamage;
    private String heroSuperAbility;

    public Hero(String  heroName, int heroHealth, int heroDamage, String heroSuperAbility) {
        this.heroName=heroName;
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
        this.heroSuperAbility = heroSuperAbility;
    }

    public Hero(int heroHealth, int heroDamage) {
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
    }

    public String getHeroName() {
        return heroName;
    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public String getHeroSuperAbility() {
        return heroSuperAbility;
    }
}

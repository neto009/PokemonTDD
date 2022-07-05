package pokemons;

public class Pokemon {

    private String name;
    private int life;
    private int damage;
    private int cure;
    private String type;

    public Pokemon(String name, int life, int damage, int cure, String type) {
        this.name = name;
        this.life = life;
        this.damage = damage;
        this.cure = cure;
        this.type = type;
    }

    public Pokemon(String name, int life, int damage, String type){
        this.name = name;
        this.life = life;
        this.damage = damage;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getCure() {
        return cure;
    }

    public void setCure(int cure) {
        this.cure = cure;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

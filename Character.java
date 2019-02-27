public class Character{
    
    protected int health;
    protected int strength;
    protected double attack;
    protected int defense;
    
    public boolean isAlive(){
        return health > 0;
    }

    private int getDefense(){
        return defense;
    }

    private void lowerHP(int dmg){
        health -= dmg;
    }

    public int attack(Character target){
        int damage = (int)((strength * attack) - target.getDefense());
        target.lowerHP(damage);
        return damage;
    }
}
//This comment is added to test the update on GitHub

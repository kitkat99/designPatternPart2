public class Enraged implements EnemyAttack {
    AbstractEnemy abstractEnemy;
    public Enraged(AbstractEnemy abstractEnemy){
        this.abstractEnemy = abstractEnemy;
    }
    @Override
    public int attack() {
        return 2 * baseDamage;
    }

    @Override
    public String getName() {
        return "Enraged";
    }
}

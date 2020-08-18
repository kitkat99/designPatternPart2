public class Normal implements EnemyAttack {
    AbstractEnemy abstractEnemy;
    public Normal(AbstractEnemy abstractEnemy){
        this.abstractEnemy = abstractEnemy;
    }
    @Override
    public int attack() {
        return baseDamage;
    }

    @Override
    public String getName() {
        return "Normal";
    }
}

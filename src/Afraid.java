public class Afraid implements EnemyAttack {
    AbstractEnemy abstractEnemy;
    public Afraid(AbstractEnemy abstractEnemy){
        this.abstractEnemy = abstractEnemy;
    }
    @Override
    public int attack() {
        return baseDamage/2;
    }

    @Override
    public String getName() {
        return "Afraid";
    }
}

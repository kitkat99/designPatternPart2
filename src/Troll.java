import java.util.concurrent.ThreadLocalRandom;

public class Troll extends AbstractEnemy {

    public Troll(String enemyName){
        super(enemyName);
    }
    @Override
    public void defineEnemyState() {

        if (currentHealth < 10) {
            setEnemyAttack(getAfraid());
        } else {
            int randomProbability = ThreadLocalRandom.current().nextInt(1, 100);
            if (0 < randomProbability && randomProbability < 30) {
                setEnemyAttack(getEnraged());
            } else {
                setEnemyAttack(getNormal());
            }
        }
    }
}

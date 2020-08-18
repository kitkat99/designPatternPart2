import java.util.concurrent.ThreadLocalRandom;

public class Game {
    public static void main(String[] args) {
        AbstractEnemy Troll = new Troll("Troll");
        HealthLogger observer1 = new HealthLogger(Troll);

        while (Troll.getCurrentHealth() > 0) {
            Troll.printEnemyInfo();
            Troll.printEnemyDamage();
            Troll.setCurrentHealth(calculateDamageForEnemy(Troll.getCurrentHealth()));
            if (Troll.getCurrentHealth() > 0) {
               Troll.defineEnemyState();
            }
            else
            {
                System.out.println(Troll.getEnemyName()+" is dead");
            }
        }


    }

    public static int calculateDamageForEnemy(int currentHealth) {
        return currentHealth - ThreadLocalRandom.current().nextInt(1, 20);
    }
}

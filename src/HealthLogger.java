public class HealthLogger implements HealthObserver {

    private int currentHealth;
    private AbstractEnemy abstractEnemy;

    public HealthLogger(AbstractEnemy abstractEnemy) {
        this.abstractEnemy = abstractEnemy;
        abstractEnemy.add(this);
    }

    @Override
    public void update(int currentHealth) {
        this.currentHealth = currentHealth;
        printHealthPoints();
    }
    public void printHealthPoints(){
        System.out.println("Enemy Health Points are set to " + abstractEnemy.getCurrentHealth());
    }
}

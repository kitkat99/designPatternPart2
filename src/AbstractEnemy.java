import java.util.ArrayList;

public abstract class AbstractEnemy implements HealthSubject {
    EnemyAttack Normal;
    EnemyAttack Enraged;
    EnemyAttack Afraid;
    EnemyAttack enemyAttack;
    static final int baseHealth = 100;
    protected int currentHealth;
    private String enemyName;
    private ArrayList<HealthObserver> observers;


    public int getCurrentHealth() {
        return currentHealth;
    }

    public String getEnemyName() {
        return enemyName;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }


    public AbstractEnemy(String enemyName) {
        Normal = new Normal(this);
        Enraged = new Enraged(this);
        Afraid = new Afraid(this);
        this.enemyName = enemyName;
        enemyAttack = Normal;
        currentHealth = baseHealth;
        observers = new ArrayList<HealthObserver>();

    }

    public EnemyAttack getEnemyAttack() {
        return enemyAttack;
    }

    public void setEnemyAttack(EnemyAttack enemyAttack) {
        this.enemyAttack = enemyAttack;
        notifyObserver();
    }

    public int attack() {
        return enemyAttack.attack();
    }

    public EnemyAttack getAfraid() {
        return Afraid;
    }

    public EnemyAttack getEnraged() {
        return Enraged;
    }

    public EnemyAttack getNormal() {
        return Normal;
    }

    public abstract void defineEnemyState();

    @Override
    public void add(HealthObserver healthObserver) {
        observers.add(healthObserver);
    }

    @Override
    public void notifyObserver() {
        for(HealthObserver observer : observers){
            observer.update(currentHealth);
        }

    }
    public void printEnemyInfo(){
        System.out.println(getEnemyName()+" is " + getEnemyAttack().getName());
    }
    public void printEnemyDamage(){
        System.out.println(getEnemyName()+" attacks for " + attack());
    }
}

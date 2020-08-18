public interface HealthSubject {
    public void add(HealthObserver healthObserver);
    public void notifyObserver();
}

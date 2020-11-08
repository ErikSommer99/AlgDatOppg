package algdat.hjelpeklasser;

public interface Ko<T> {
    public boolean leggInn(T verdi);

    public T kikk();

    public T taUt();

    public int antall();

    public boolean tom();

    public void nullstill();
}

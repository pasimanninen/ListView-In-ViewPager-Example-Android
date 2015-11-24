package fi.ptm.listviewinviewpagerexample;

/**
 * Created by PTM on 24.11.2015.
 */
public class Person {
    private String name;
    private int count;

    public Person(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void addCount() {
        this.count++;
    }

    public void decreaseCount() {
        if (this.count > 0) this.count--;
    }
}

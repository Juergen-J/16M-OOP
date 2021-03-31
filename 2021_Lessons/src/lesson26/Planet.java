package lesson26;

public class Planet implements Comparable<Planet> {
    private String name;
    private long size;
    private int timeToEarth;

    public Planet(String name, long size, int timeToEarth) {
        this.name = name;
        this.size = size;
        this.timeToEarth = timeToEarth;
    }

    public Planet() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public int getTimeToEarth() {
        return timeToEarth;
    }

    public void setTimeToEarth(int timeToEarth) {
        this.timeToEarth = timeToEarth;
    }

    @Override
    public String toString() {
        return " " + name + "\t" + size +
                "\t" + timeToEarth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Planet)) return false;

        Planet planet = (Planet) o;

        if (size != planet.size) return false;
        if (timeToEarth != planet.timeToEarth) return false;
        return name != null ? name.equals(planet.name) : planet.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (int) (size ^ (size >>> 32));
        result = 31 * result + timeToEarth;
        return result;
    }

    @Override
    public int compareTo(Planet o) {
        return timeToEarth - o.timeToEarth;
    }
}

package rachelmiller.inclassassignment07_rachelm;


public class Planet {
    private String name;
    private int distance;
    private boolean hasWater;

    public Planet() {
    } // Empty constructor is needed to read from Firebase

    public Planet(String name, int distance, boolean hasWater) {
        this.name = name;
        this.distance = distance;
        this.hasWater = hasWater;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
    public boolean isHasWater() {
        return hasWater;
    }

    public void setHasWater(boolean hasWater) {
        this.hasWater = hasWater;
    }

    @Override
    public String toString() {
        if (isHasWater()) {
            return name + "is " + distance + "miles from the sun " + "has Water. ";
        } else {
            return name + "is " + distance + "miles from the sun " + "does not have Water. ";
        }
    }
}


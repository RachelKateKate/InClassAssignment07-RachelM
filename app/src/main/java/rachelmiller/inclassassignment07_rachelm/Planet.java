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

    public int getDistance() {
        return distance;
    }

    public boolean isHasWater() {
        return hasWater;
    }

}


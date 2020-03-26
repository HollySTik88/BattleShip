public enum Orientation {
    NORD ("N"),
    SUD ("S"),
    EST ("E"),
    OUEST ("O");

    private String orientation;

    Orientation(String orientation){
        this.orientation = orientation;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }
}
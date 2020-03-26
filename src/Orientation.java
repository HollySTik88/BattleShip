public enum Orientation {
    N ("Nord"),
    S ("Sud"),
    E ("Est"),
    O ("Ouest");

    private String orientation;

    Orientation(String orientation){
        this.orientation = orientation;
    }

    public String getOrientation() {
        return orientation;
    }
    public String toString() {
        return "Direction : " + orientation ;

    }


}
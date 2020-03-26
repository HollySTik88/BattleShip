public enum Orientation {
    N ( "Nord"),
    S ( "Sud"),
    E ( "Est"),
    O ( "Ouest");

        Orientation(String direction){
            this.direction = direction;
        }

        public String getDirection() {
            return direction;
        }

        public String toString() {
            return
                    "Direction : " + direction;
        }


}
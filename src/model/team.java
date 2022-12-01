package model;

public class team {

    String name;
    String jersey_color;
    String fifa_position;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJersey_color() {
        return jersey_color;
    }

    public void setJersey_color(String jersey_color) {
        this.jersey_color = jersey_color;
    }

    public String getFifa_position() {
        return fifa_position;
    }

    public void setFifa_position(String fifa_position) {
        this.fifa_position = fifa_position;
    }

    public team(String name, String jersey_color, String fifa_position) {
        this.name = name;
        this.jersey_color = jersey_color;
        this.fifa_position = fifa_position;
    }
}
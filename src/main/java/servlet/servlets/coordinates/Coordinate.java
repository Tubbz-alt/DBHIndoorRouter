package servlet.servlets.coordinates;

public class Coordinate {

    private String xAxis;

    private String yAxis;

    private String level;

    public Coordinate(String xAxis, String yAxis, String level) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
        this.level = level;
    }

    public String getxAxis() {
        return xAxis;
    }

    public void setxAxis(String xAxis) {
        this.xAxis = xAxis;
    }

    public String getyAxis() {
        return yAxis;
    }

    public void setyAxis(String yAxis) {
        this.yAxis = yAxis;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}

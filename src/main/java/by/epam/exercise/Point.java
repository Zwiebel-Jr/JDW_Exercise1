package by.epam.exercise;

public class Point {
    private double x,y, distance;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        this.distance = Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
        this.distance=Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2));
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
        this.distance=Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2));
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String comparison(Point b){
        if(this.distance<b.getDistance()){
            return "Точка A ближе чем точка B";
        }else if(this.distance>b.getDistance()){
            return "Точка A дальше чем точка B";
        }else{
            return "Точки находятся на одинаковом расстоянии от начала координат";
        }
    }
}

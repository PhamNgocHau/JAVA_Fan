public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private int speed;
    private boolean on = false;
    private double radius = 5;
    private String color = "BLUE";

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
    }

    @Override
    public String toString() {
        if (this.on = isOn()) {
            System.out.println("Speed: " + this.speed + " - " +
                    " Color: " + this.color + " - " + " Radius: " + this.radius);
            return "Fan is On";
        } else {
            System.out.println("Color: " + this.color + " - " + " Radius: " + this.radius);
        }
        return "Fan is Off";
    }
}

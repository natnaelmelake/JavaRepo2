public class Car {
    private double speedKph;
    private float fuelLevel;
    private int distanceTraveled;

    public Car(){
        
    }



    public void setSpeed(double speed){
        this.speedKph=speed;
    }

    public void setFuelLevel(float fuel){
        this.fuelLevel=fuel;
    }

    public void drive(int distance){
        this.distanceTraveled=distance;
    }

    public double getSpeedMph(){
        double speedInMph=speedKph/1.60934;
        return speedInMph;
    }

    public int getDistancekm(){
        return distanceTraveled;
    }

    public int calculateRemainingFuel(double distance){
        double remainingFuel=distance*(0.005*fuelLevel);
        int remainingFuelInteger=(int)remainingFuel;
        return remainingFuelInteger;
    }
}
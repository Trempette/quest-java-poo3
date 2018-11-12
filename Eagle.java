public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    
    public void takeOff(){
        if(!this.isFlying() && altitude == 0){
            this.flying = true;
            System.out.printf("%s flies into the beautiful and endless sky. %n", this.getName());
        }

    } 

    
    public int ascend(int meters){
        if(this.isFlying()){
            this.altitude+=meters;
            System.out.printf("%s flies upward. Altitude : %d %n", this.getName(), this.altitude);
        }
        else{
            System.out.printf("%s is not flying. Dumbass. Altitude : %d", this.getName(), this.altitude);    
        }
        return this.altitude;

    } 

    
    public int descend(int meters){
        if(this.isFlying()){
            this.altitude-=meters;
            System.out.printf("%s flies downward. Altitude : %d %n", this.getName(), this.altitude);
        }
        else{
            System.out.printf("%s is not flying. Dumbass. Altitude : %d", this.getName(), this.altitude);    
        }
        return this.altitude;
    }
    
    
    public void land(){
        if (this.flying && this.altitude == 0) {
            System.out.printf("%s gets on the ground.%n", this.getName());
        } else {
            System.out.printf("%s is too high !.%n", this.getName());
        }

    }

    public void glide(){}


}

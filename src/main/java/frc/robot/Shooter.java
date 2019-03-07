package frc.robot;

public class Shooter{

    public static void shoot(double trigger){
        double shooterSpeed;
        if (trigger != 0) {
            shooterSpeed = Constants.SHOOTER_MULTIPLIER * trigger;
        } else {
            shooterSpeed = Constants.SHOOTER_STOP;
        }
        //invert
        //shooterSpeed = -1 * shooterSpeed;
        Actuators.getShooter().set(shooterSpeed);
    }
    
}
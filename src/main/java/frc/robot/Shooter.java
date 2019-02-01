package frc.robot;

public class Shooter{

    public static void shoot(double trigger) {
        double shooterSpeed;
        if (trigger != 0) {
            shooterSpeed = trigger;
        } else {
            shooterSpeed = Constants.SHOOTER_STOP;
        }
        Actuators.getShooterTop().set(shooterSpeed);
    }
        
}
package frc.robot;

public class Turret {
    public static void turret(double turretSpeed) {
        double turnSpeed = Math.min(turretSpeed, Constants.MAX_MOTOR_SPEED);
        Actuators.getTurret().set(turnSpeed);
    }
}
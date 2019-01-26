package frc.robot;

public class RampTip {
    public static void tip(double rampSpeed) {
        double tipSpeed = Math.min(rampSpeed, Constants.MAX_MOTOR_SPEED);
        Actuators.getRampTipMotor().set(tipSpeed);
    }
}
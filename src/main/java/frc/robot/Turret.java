package frc.robot;

public class Turret {
    public static void turret(double turretSpeed) {
        double turnSpeed = Math.min(turretSpeed, Constants.MAX_MOTOR_SPEED);
        /*if ((turnSpeed < 0 && Sensors.getTurretLeftLimitSwitch().get()) || 
                (turnSpeed > 0 && Sensors.getTurretRightLimitSwitch().get())) {
            
             Actuators.getTurret().set(Constants.TURRET_STOP);
        }else {
            Actuators.getTurret().set(turnSpeed);
        }*/
    }
}
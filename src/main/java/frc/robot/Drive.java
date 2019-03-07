package frc.robot;

public class Drive {

    public static void tankdrive(double speed, double turnSpeed) {
        double leftSpeed = Math.min(speed + turnSpeed, Constants.MAX_MOTOR_SPEED);
        double rightSpeed = Math.min(speed - turnSpeed, Constants.MAX_MOTOR_SPEED);

        //invert left
        leftSpeed = -1 * leftSpeed;

        Actuators.getChassisLeft().set(leftSpeed);
        Actuators.getChassisRight().set(rightSpeed);

    }

    public static void setGear(boolean high, boolean low) {
        if (high) {
            Actuators.getServo1().setPosition(1);
            //Actuators.getServo2().set(true);
        } else if (low) {
            Actuators.getServo1().setPosition(0);
            //Actuators.getServo2().set(false);
        }
    }

}
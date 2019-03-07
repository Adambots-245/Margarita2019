package frc.robot;

public class Elevator {
    public static void elevator(double elevatorSpeed) {
        double liftSpeed = Math.min(elevatorSpeed, Constants.MAX_MOTOR_SPEED);
        // invert
        liftSpeed = -1 * liftSpeed;
        Actuators.getBallInFeedElevator().set(liftSpeed);
    }

    public static void indexingRoller(boolean down, boolean up) {
        double speed = 0;
        if (up) {
            speed = Constants.INDEX_SPEED;
        } else if (down) {
            speed = -Constants.INDEX_SPEED;
        }
        //invert 
        speed = -1 * speed;
        Actuators.getIndexingRoller().set(speed);
    }
    public static void combinedIntake(double speeed){
        elevator(speeed);
        //invert 
        double invertSpeeed = -1 * speeed;
        //multiplier
        double finalSpeeed = Constants.INDEX_MULTIPLIER * invertSpeeed;
        Actuators.getIndexingRoller().set(finalSpeeed);
    }
}
package frc.robot;

import edu.wpi.first.wpilibj.util.WPILibVersion;
import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.VictorSP;

public class Actuators {

    private static VictorSP chassisLeft;
    private static VictorSP chassisRight;
    private static VictorSP ballInFeedElevator;
    private static VictorSP turret;
    private static VictorSP shooter;
    private static Servo servo1;
    private static VictorSP indexingRoller;
    //private static DigitalOutput servo2;

    public static void init() {

        chassisLeft = new VictorSP(Constants.CHASSIS_LEFT);
        chassisRight = new VictorSP(Constants.CHASSIS_RIGHT);
        ballInFeedElevator = new VictorSP(Constants.BALL_IN_FEED_ELEVATOR);
        turret = new VictorSP(Constants.TURRET);
        shooter = new VictorSP(Constants.SHOOTER);
        servo1 = new Servo(Constants.GEAR_SHIFT_SERVO_ONE_PORT);
        //servo2 = new DigitalOutput(Constants.GEAR_SHIFT_SERVO_TWO_PORT);
        indexingRoller = new VictorSP(Constants.SHOOTER_IN_FEED);

    }

    public static VictorSP getChassisLeft() {
        return chassisLeft;
    }

    public static VictorSP getChassisRight() {
        return chassisRight;
    }
    public static Servo getServo1() {
        return servo1;
    }
    //public static DigitalOutput getServo2() {
   //     return servo2;
    //}
    public static VictorSP getBallInFeedElevator() {
        return ballInFeedElevator;
    }
    public static VictorSP getIndexingRoller(){
        return indexingRoller;
    }

    public static VictorSP getTurret() {
        return turret;
    }

    public static VictorSP getShooter() {
        return shooter;
    }
}
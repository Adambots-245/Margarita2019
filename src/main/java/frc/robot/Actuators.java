package frc.robot;

import edu.wpi.first.wpilibj.util.WPILibVersion;
import edu.wpi.first.wpilibj.VictorSP;

public class Actuators{

private static VictorSP chassisLeftMaster;
private static VictorSP chassisLeftSlave;
private static VictorSP chassisRightMaster;
private static VictorSP chassisRightSlave;
private static VictorSP ballInFeedElevator;
private static VictorSP turret;
private static VictorSP shooterTop;
private static VictorSP shooterBottom;

public static void init() {

chassisLeftMaster = new VictorSP(Constants.CHASSIS_LEFT_MASTER);
chassisLeftSlave = new VictorSP(Constants.CHASSIS_LEFT_SLAVE);
chassisRightMaster = new VictorSP(Constants.CHASSIS_RIGHT_MASTER);
chassisRightSlave = new VictorSP(Constants.CHASSIS_RIGHT_SLAVE);
ballInFeedElevator = new VictorSP(Constants.BALL_IN_FEED_ELEVATOR);
turret = new VictorSP(Constants.TURRET);
shooterTop = new VictorSP(Constants.SHOOTER_TOP);
shooterBottom = new VictorSP(Constants.SHOOTER_BOTTOM);

}

public static VictorSP getChassisLeftMaster() {
    return chassisLeftMaster;
}
public static VictorSP getChassisLeftSlave() {
    return chassisLeftSlave;
}
public static VictorSP getChassisRightMaster() {
    return chassisRightMaster;
}
public static VictorSP getChassisRightSlave() {
    return chassisRightSlave;
}

public static VictorSP getBallInFeedElevator() {
    return ballInFeedElevator;
}
public static VictorSP getTurret() {
    return turret;
}

public static VictorSP getShooterTop() {
    return shooterTop;
}

public static VictorSP getShooterBottom() {
    return shooterBottom;
}

}
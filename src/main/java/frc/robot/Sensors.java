package frc.robot;

import edu.wpi.first.wpilibj.util.WPILibVersion;
import edu.wpi.first.wpilibj.DigitalInput;

public class Sensors{

private static DigitalInput turretLeftLimitSwitch;
private static DigitalInput turretRightLimitSwitch;

public static void init() {

turretLeftLimitSwitch = new DigitalInput(Constants.TURRET_LEFT_LIMIT_SWITCH);
turretRightLimitSwitch = new DigitalInput(Constants.TURRET_RIGHT_LIMIT_SWITCH);

}

public static DigitalInput getTurretLeftLimitSwitch() {
    return turretLeftLimitSwitch;
}

public static DigitalInput getTurretRightLimitSwitch() {
    return turretRightLimitSwitch;
}

}
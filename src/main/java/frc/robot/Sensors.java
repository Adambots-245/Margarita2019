package frc.robot;

import edu.wpi.first.wpilibj.util.WPILibVersion;
import edu.wpi.first.wpilibj.DigitalInput;

public class Sensors{

    private static DigitalInput cargoRetrievablePhotoEye;

    public static void init() {
        cargoRetrievablePhotoEye = new DigitalInput(Constants.CARGO_RETRIEVABLE_PHOTO_EYE);
    }

    public static DigitalInput getCargoRetrievablePhotoEye() {
        return cargoRetrievablePhotoEye;
    }
}
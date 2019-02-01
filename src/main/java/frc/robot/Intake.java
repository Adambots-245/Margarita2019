package frc.robot;

public class Intake {

    public static void cargoIntake(boolean button) {
        if (button && Sensors.getCargoRetrievablePhotoEye().get()) {
            //TODO: the arm thingy to actually get the ball
        }
    }

}
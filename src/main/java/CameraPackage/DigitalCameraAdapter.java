package CameraPackage;

public class DigitalCameraAdapter implements CameraAdapter{
    private Camera digitalCamera;

    public DigitalCameraAdapter(Camera digitalCamera) {
        this.digitalCamera = digitalCamera;
    }

    public void takePhotograph(double shutterSpeed) {
        Logger.getInstance().log(digitalCamera.getName() + " is taking a digital photo.");
        digitalCamera.getMirrorOps().openMirror();
        digitalCamera.getShutterOps().initializeShutter();
        digitalCamera.getShutterOps().setShutterSpeedSetting(shutterSpeed);
        digitalCamera.getShutterOps().activateShutter();
        digitalCamera.getShutterOps().releaseShutter();
        digitalCamera.getMirrorOps().closeMirror();
        Logger.getInstance().log(digitalCamera.getName() + " has completed digital photo.");
    }
}

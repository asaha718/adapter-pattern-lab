import CameraPackage.Camera;
import CameraPackage.CameraFactory;
import CameraPackage.DigitalCameraAdapter;

public class StudioRunner {
    public static void main(String[] args) {
        CameraFactory camFactory = new CameraFactory();
        Camera canonCam = camFactory.makeCamera(CameraFactory.CameraManufacturer.CANON_FILM);
        DigitalCameraAdapter canonDigitalCam = new DigitalCameraAdapter( canonCam );

        canonDigitalCam.takePhotograph(12.5);
    }
}

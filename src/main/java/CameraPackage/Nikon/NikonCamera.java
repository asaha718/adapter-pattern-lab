package CameraPackage.Nikon;

import CameraPackage.Camera;
import CameraPackage.FilmOperations;
import CameraPackage.MirrorOperations;
import CameraPackage.ShutterOperations;

public class NikonCamera extends Camera {
    public NikonCamera(FilmOperations filmOps, ShutterOperations shutterOps, MirrorOperations mirrorOps) {
        super(filmOps, shutterOps, mirrorOps);
    }


    public String getName() {
        return "Nikon";
    }
}

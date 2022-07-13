package CameraPackage.Nikon;

import CameraPackage.Logger;
import CameraPackage.MirrorOperations;

public class NikonMirror implements MirrorOperations {

    public void openMirror() {
        Logger.getInstance().log((getName() + " is open"));
    }

    public void closeMirror() {
        Logger.getInstance().log((getName() + " is closed"));
    }

    public String getName() {
        return "Nikon Mirror";
    }
}

import CameraPackage.Camera;

public class Photographer {
    private Camera camera;

    public Photographer(Camera camera) {
        this.camera = camera;
    }

    public void takePhotograph(){
        camera.takePhotograph(3.6);
    }
}


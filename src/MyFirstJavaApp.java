public class MyFirstJavaApp {

    public static void main(String[] args) {
       byte garantie = 1;
       byte opticalZoom = 1;
       byte photoSensor = 35;

       short sensorResolution = 6048;
       short videoCaptureResolution = 2160;

       float price = 1996.95F;
       float screenSize = 3.2F;
       float itemWeight = 1.36F;

       boolean isNew = true;
       boolean hasImageStabilization = true;

       char serie = 'Z';
       char cameraColor = 'B';

       long serialNumber = 569930094950099L;

       System.out.println("Nikon Z 6II FX-Format Mirroless Camera Body Black");
       System.out.println("Price: $" + price);
       System.out.println("The camera is new: " + isNew);
       System.out.println("Garantie: " + garantie + " years");
       System.out.println("Serie: " + serie);
       System.out.println("Screen size: " + screenSize + "inch");
       System.out.println("Has image stabilization: " + hasImageStabilization);
       System.out.println("Item weight: " + itemWeight + "lbs");
       System.out.println("Sensor resolution: " + sensorResolution + "mpx");
       System.out.println("Optical Zoom: " + opticalZoom + "x");
       System.out.println("Photo sensor: " + photoSensor + "mm");
       System.out.println("Video capture resolution: " + videoCaptureResolution + "p");
       System.out.println("Color " + cameraColor + " (b-black, s-silver)");

    }
}

// NoiseRemoving.java file
package noiseremoving;

import java.io.File;
import javax.swing.JFileChooser;

public class NoiseRemoving {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFileChooser imageFileChooser = new JFileChooser(new File("."));
        int stateImageFileChooser = imageFileChooser.showOpenDialog(null);

        if (stateImageFileChooser == JFileChooser.APPROVE_OPTION) {
            String fileName = imageFileChooser.getSelectedFile().getPath();
            ImageProcess ip = new ImageProcess(fileName);
            ip.removeNoise();
            ip.save("noise_removed.jpg");
        }
    }
}

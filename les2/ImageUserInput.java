import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import java.util.Scanner;
import java.io.File;

public class ImageUserInput {

  public static void main(String[] args) {
    askUserForImage();
  }

  private static void askUserForImage() {
    Scanner user_input = new Scanner( System.in );

		System.out.print("Please Enter a path your the image you want to show: ");
	  String image = user_input.next();
    image = image.replaceAll("\\\\", "/");
    System.out.println("This image path you entered is: "+image);

    createDialog(image);
  }

  private static void createDialog(String image) {
    //System.out.println(image);
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        try {
          JDialog dialog = new JDialog();
          dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
          dialog.setTitle("Image Shower");

          File file = new File(image);
          dialog.add(new JLabel(new ImageIcon(ImageIO.read(file))));

          dialog.pack();
          dialog.setLocationByPlatform(true);
          dialog.setVisible(true);

        }
        catch (Exception e)
        {
          System.out.println("Oow noeees! Either the picture is to fat or does not exist");
        }
      }
    });
  }

}

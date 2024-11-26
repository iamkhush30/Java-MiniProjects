import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Random_MediaPlayer {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the folder path containing videos: ");
        String folderPath = sc.nextLine();  // Read the user input

        // create a file object for path
        File folder = new File(folderPath);

        // check, the folder exists 
        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("The provided path is invalid or not a directory.");
            return;
        }

        // filter the video files (.mp4 and .mov)
        File[] videoFiles = folder.listFiles((dir, name) -> name.toLowerCase().endsWith(".mp4") ||
                                                             name.toLowerCase().endsWith(".mov"));

        // check if there are any video there
        if (videoFiles == null || videoFiles.length == 0) {
            System.out.println("No video files found in the provided directory.");
            return;
        }

        // select a random video file
        Random random = new Random();
        int randomIndex = random.nextInt(videoFiles.length);
        File randomVideoFile = videoFiles[randomIndex];
        System.out.println("Running video: " + randomVideoFile.getName());

        // Open the video 
        Desktop.getDesktop().open(randomVideoFile);
    }
}

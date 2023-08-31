package application;


/**
 * Hello world!
 *
 */
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class App extends Application {
private PDDocument document;
private PDFRenderer pdfRenderer;

public static void main(String[] args) {
launch(args);
}

@Override
public void start(Stage primaryStage) throws Exception {
// Load the PDF document and initialize the PDFRenderer
document = PDDocument.load(new File("path/to/your/book.pdf"));
pdfRenderer = new PDFRenderer(document);

// Initialize the JavaFX application
Platform.runLater(() -> initializeJavaFX(primaryStage));
}

private void initializeJavaFX(Stage primaryStage) {
ImageView imageView = new ImageView();
StackPane root = new StackPane(imageView);
Scene scene = new Scene(root, 800, 600);

// Render the PDF image using a separate thread
new Thread(() -> {
try {
BufferedImage bufferedImage = pdfRenderer.renderImageWithDPI(0, 300);
javafx.scene.image.Image image = SwingFXUtils.toFXImage(bufferedImage, null);

Platform.runLater(() -> imageView.setImage(image));
} catch (IOException e) {
e.printStackTrace();
}
}).start();

primaryStage.setTitle("PDF Viewer");
primaryStage.setScene(scene);
primaryStage.show();
}

@Override
public void stop() throws Exception {
super.stop();
if (document != null) {
document.close();
}
}
}

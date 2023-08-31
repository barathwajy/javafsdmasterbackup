package Project001_PDF.ProjectPDF;


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


/*
package application;
import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

	 public static void main (String[] args)
	    {
	        launch(args);
	    }

    @Override
    public void start(Stage primaryStage) throws ClassNotFoundException, IOException {
    	
    		File file = new File("C:\\Users\\barathwaj.y\\Downloads\\OOPs_Test_8_8_23.pdf");
        	PDDocument document = PDDocument.load(file);
        	PDFRenderer pdfRenderer = new PDFRenderer(document);
        	//Image image = new Image(new ByteArrayInputStream(pdfRenderer.renderImageWithDPI(0, 0)));
        	Image image = convertToJavaFXImage((pdfRenderer.renderImageWithDPI(0,300)),300);
        	ImageView imageview = new ImageView(image);
        	StackPane root  = new StackPane(imageview);
        	Scene scene = new Scene(root,800,600);
        	primaryStage.setTitle("Kindled");
        	primaryStage.setScene(scene);
        	primaryStage.show();
        	document.close();

    }
    private Image convertToJavaFXImage(java.awt.Image awtImage, int dpi) throws IOException
    {
    	java.awt.image.BufferedImage bufferedImage =new java.awt.image.BufferedImage(awtImage.getWidth(null), awtImage.getWidth(null), java.awt.image.BufferedImage.TYPE_INT_ARGB);
		java.awt.Graphics2D graphics = bufferedImage.createGraphics();
		graphics.drawImage(awtImage, 0, 0,null);
		graphics.dispose();
		return javafx.embed.swing.SwingFXUtils.toFXImage(bufferedImage, null);
    }


    

}

*/
/*
    	// TODO Auto-generated method stub
        Button btn1=new Button("Say, Hello World");
        btn1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                // TODO Auto-generated method stub
                System.out.println("hello world");
            }
        });
        StackPane root=new StackPane();
        root.getChildren().add(btn1);
        Scene scene=new Scene(root,600,400);
        primaryStage.setTitle("First JavaFX Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    */
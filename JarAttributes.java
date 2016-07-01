import java.util.*;
import java.util.jar.*;
import java.io.*;

public class JarAttributes {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter jar file name: ");
            String filename = in.readLine();
            if(!filename.endsWith(".jar")){
                System.out.println("File not in jar format.");
                System.exit(0);
            }

            File file = new File(filename);
            if (file.exists()) {
                // Open the JAR file
                JarFile jarfile = new JarFile(filename);

                // Get the manifest
                Manifest manifest = jarfile.getManifest();

                // Get the main attributes in the manifest
                Attributes attrs = (Attributes)manifest.getMainAttributes();

                // Enumerate each attribute
                for (Iterator it=attrs.keySet().iterator(); it.hasNext(); ) {
                    // Get attribute name
                    Attributes.Name attrName = (Attributes.Name)it.next();
                    System.out.print(attrName + ": ");

                    // Get attribute value
                    String attrValue = attrs.getValue(attrName);
                    System.out.print(attrValue);
                    System.out.println();
                }
            }
            else {
                System.out.print("File not found.");
                System.exit(0);
            }
        } catch (IOException e) {}
    }
}

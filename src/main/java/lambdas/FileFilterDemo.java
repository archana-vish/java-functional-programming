package lambdas;

import java.io.File;
import java.io.FileFilter;

public class FileFilterDemo {


    public File[] listDirectories(String dirName) {
        File myDir = new File(dirName);

        // anonymous inner class implementation
//        return myDir.listFiles(new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.isDirectory();
//            }
//        });


        // lambda expression
        return myDir.listFiles(file ->  file.isDirectory());

        // Method reference
//        return myDir.listFiles(File::isDirectory);
    }
}

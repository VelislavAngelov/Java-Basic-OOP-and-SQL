package lectureTask_28_06_2022;

import java.io.File;

public class PrintFiles {
    public static void main(String[] args) {
        File file1 = new File("C:\\Users\\angel\\codeAcademy");

        file(file1);
    }

    private static void file(File file1) {
        if(file1.isFile()){
            System.out.println(file1.getName());
        }
        else {
            System.out.println(System.lineSeparator()+ file1.getName()+":");
            File[] innerFiles = file1.listFiles();
            assert innerFiles != null;
            for(File file:innerFiles){
                file(file);

            }
        }

    }

}

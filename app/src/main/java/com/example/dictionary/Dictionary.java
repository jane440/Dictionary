package com.example.dictionary;

import android.content.Context;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Dictionary {
    public static void copyDictionary (Context context) {

        try {
            String destPath = "/data/data/" + context.getOpPackageName()
                    + "/databases";
            File file = new File (destPath);
            if (!file.exists()){
                file.mkdir();
                // copy the db from the assets folder into the database
                rawCopy(context.getAssets().open("dictionary.db"), new FileOutputStream(destPath + "/dictionary.db"));
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void  rawCopy(InputStream inputStream, OutputStream outputStream) throws IOException {
        // copy 1k bytes at a time
        byte[] buffer = new byte[1024];
        int lenght;
        while ((lenght = inputStream.read(buffer)) > 0) {
            inputStream.close();
            outputStream.close();
        }
    }

}

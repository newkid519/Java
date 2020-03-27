/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kennyzx.termsandconditions;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.net.*;

/**
 *
 * @author kennyzx
 */
public class TnCXmlParser {
    // FEFF because this is the Unicode char represented by the UTF-8 byte order mark (EF BB BF).
    public static final String UTF8_BOM = "\uFEFF";

    /**
     *
     * @param args
     */
    public static void main(String args[]) {
        try {      
            for (int i = 0; i < 1; i++){
                URL url = new URL("http://localhost/a.xml");
                HttpURLConnection conn = (HttpURLConnection)url.openConnection();
                DataInputStream input = new DataInputStream(conn.getInputStream());

                boolean firstLine = true;
                BufferedReader r = new BufferedReader(new InputStreamReader(input,
                        "utf-8"));
                for (String s = ""; (s = r.readLine()) != null;) {
                     if (firstLine) {
                         if (s.startsWith(UTF8_BOM)) {
                            s = s.substring(1);
                         }
                        firstLine = false;
                     }
                     System.out.println(s);
                    }
                }
            //r.close();
            System.exit(0);
        }

        catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    private static String removeUTF8BOM(String s) {
        if (s.startsWith(UTF8_BOM)) {
            s = s.substring(1);
        }
        return s;
    }
}

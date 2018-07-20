/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algostuff;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author joel.eze
 */
public class ConsumeRestService {
    public static void main(String[] args) {
        try{
            URL url = new URL("https://flw-pms-dev.eu-west-1.elasticbeanstalk.com/flwv3-pug/getpaidx/api/charge");
            HttpURLConnection httpConnect = (HttpURLConnection)url.openConnection();
            httpConnect.setDoOutput(true);
            httpConnect.setRequestMethod("POST");
            OutputStreamWriter osw = new OutputStreamWriter(httpConnect.getOutputStream());
            System.out.println(httpConnect.getResponseCode());
            System.out.println(httpConnect.getResponseMessage());
            //System.out.println(httpConnect);
            osw.close();
        }catch(IOException e){
            System.out.println(e);
        }
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Network;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.net.*;
import java.io.*;
/**
 *
 * @author Administrator
 */
public class Client {
    public static int port = 8080;
    public static void Client_init() throws Exception{
        DateFormat dateFormat = new SimpleDateFormat("mm:ss");
        Calendar cal = Calendar.getInstance();
        System.out.println(dateFormat.format(cal.getTime())); //2014/08/06 16:00:22
        String ip = "127.0.0.1";
        Socket client  = new Socket(ip,port);
        InputStream input = client.getInputStream();
        StringBuffer buffer = new StringBuffer("Hello");
        
        OutputStream os = client.getOutputStream();    // 取得輸出串流。
        os.write("From Server : Hi !".getBytes("UTF-8"));// 送訊息到 Client 端。
        //os.close();                                // 關閉輸出串流。
        try{
            while(true){
                int by = input.read();
                if(by == -1){
                    break;
                }
                byte b = (byte) by;
                buffer.append((char)b);
                System.out.println(buffer.toString());
            }
        }catch(Exception ex){
            input.close();
        }
        
        System.out.println(buffer);
        //one time test should be close client!
        client.close();
    }
}

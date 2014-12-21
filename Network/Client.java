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
    public static int port = 6310;
    public static String ip;
    public static Socket client;
    public static InputStream input;
    public static StringBuffer buffer;
    public static  OutputStream os;
    
    public static void Client_init(String ip)throws Exception{
        /*DateFormat dateFormat = new SimpleDateFormat("mm:ss");
        Calendar cal = Calendar.getInstance();
        System.out.println(dateFormat.format(cal.getTime()));*/
        
        client = new Socket(ip,port);
    }
    public static void send() throws IOException{
        os = client.getOutputStream();    // 取得輸出串流。
        os.write("Z".getBytes("UTF-8"));// 送訊息到 Client 端。                    
    }
    public static void send_close()throws IOException{
        os.close(); // 關閉輸出串流。
    }
    public static String Listener()throws IOException{
        input = client.getInputStream();
        buffer = new StringBuffer();

        //Listen Server OK! and Key Code.
        try{
            while(true){
                int by = input.read();
                if(by == -1){
                    break;
                }
                byte b = (byte) by;
                buffer.append((char)b);
            }
        }catch(Exception ex){
            input.close();
        }
        return buffer.toString();
    }
    public static void Connect_Close()throws IOException{
        client.close();
    }
}

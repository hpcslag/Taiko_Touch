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
import java.lang.Exception.*;
/**
 *
 * @author Administrator
 */
public class Client {
    public static String ip ;
    public static void Client_init(String ip) throws IOException,RuntimeException {
        Client.ip = ip;
    }

    public static void send(String parameters)throws IOException{
        if(ip == null){
            
            throw new RuntimeException("No Set IP Address");
        }
        String sentence;
        String modifiedSentence;
        Socket clientSocket = new Socket(ip, 6113);
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        //sentence = inFromUser.readLine();
        outToServer.writeBytes(parameters + '\n');
        modifiedSentence = inFromServer.readLine();
        System.out.println("FROM SERVER: " + modifiedSentence);
        clientSocket.close();
    }
    public static boolean check()throws IOException{
        if(ip == null){
            throw new RuntimeException("No Set IP Address");
        }
        try{
            String sentence;
            String modifiedSentence;
            Socket clientSocket = new Socket(ip, 6113);
            BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
            DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            outToServer.writeBytes("Recod" + '\n');
            modifiedSentence = inFromServer.readLine();
            
            if(modifiedSentence == "Recod"){
                return true;
            }else{
                return false;
            }
        }catch(Exception e){
            return false;
        }
    }
}

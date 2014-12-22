/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Interface.*;
import Network.Client;
/**
 *
 * @author Administrator
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        
        //Input Setting Layer
        Client.Client_init("127.0.0.1");
        if(Client.check() != true){
            throw new RuntimeException("Connect Fail!");
        }
        
        System.out.println("IP: "+Client.ip+" is Connected");
        //Input Control Layer
        /*GUILayer Layer = new GUILayer();
        Layer.Build();*/
        Client.send("Z");
        for(int i = 0;;i++){
            if(i==655350000L){
                break;
            }
        }
        Client.send("X");
        for(int i = 0;;i++){
            if(i==655350000L){
                break;
            }
        }
        Client.send("C");
        for(int i = 0;;i++){
            if(i==655350000L){
                break;
            }
        }
        Client.send("V");
    }
    
}

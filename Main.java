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
        /*GUILayer Layer = new GUILayer();
        Layer.Build();*/
        Client.Client_init("127.0.0.1");
        Client.send("SA");
        Client.send("SA");
        System.out.println(Client.Listener());
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

/**
 *
 * @author haris
 */
public class clientside {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(getDetails(3));
    }

    private static String getDetails(int id) {
        ip14.Ip14Server_Service service = new ip14.Ip14Server_Service();
        ip14.Ip14Server port = service.getIp14ServerPort();
        return port.getDetails(id);
    }
    
}

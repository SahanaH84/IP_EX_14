package client;
public class clientside {
    public static void main(String[] args) {
        System.out.println(getDetails(1));
    }

    private static String getDetails(int id) {
        ip14.Ip14Server_Service service = new ip14.Ip14Server_Service();
        ip14.Ip14Server port = service.getIp14ServerPort();
        return port.getDetails(id);
    }
    
}

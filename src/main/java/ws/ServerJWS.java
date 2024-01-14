package ws;

import jakarta.xml.ws.Endpoint;
//deployer webservice
public class ServerJWS {
    public static void main(String[] args) {
        String url = "http://0.0.0.0:8787/";
        Endpoint.publish(url, new BanqueService());//http://0.0... c'est pour meter en sreverver new for a comunique with another webservice
        System.out.println("wesevice deploye en " +url);
    }
}

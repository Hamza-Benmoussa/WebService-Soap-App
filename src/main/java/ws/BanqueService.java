package ws;

import java.util.Date;
import java.util.List;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(serviceName = "BanqueWS") //library de JAX-WX || BanqueWS et le nom de le webservice

public class BanqueService {
    @WebMethod (operationName = "ConversionEuroToDH") //nom de methode
    public double convertion(@WebParam (name = "montant") double mt){
        return mt * 11;
    }
    public Compte getCompte(@WebParam(name = "code") int code){
     return    new Compte(code,Math.random()*60000,new Date());
    }
    @WebMethod
    public List<Compte> lisrComptes(){
        return List.of(
                new Compte(1,Math.random()*60000 , new Date()),
                new Compte(2,Math.random()*60000 , new Date()),
                new Compte(3,Math.random()*60000 , new Date())
                );
    }
}

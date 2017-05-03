package hello;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.app.model.Demande;
import com.app.model.Departement;
import com.app.model.Pole;
import com.app.model.User;
import com.app.service.MetierDemande;
import com.app.service.MetierDepartement;
import com.app.service.MetierPole;
import com.app.service.MetierUser;

@SpringBootApplication
@EntityScan({"com.app.model"})
public class Application {

    public static void main(String[] args)  {
        SpringApplication.run(Application.class, args);
        
        
      
        Departement depar = new Departement();
       
        MetierDepartement operation = new MetierDepartement();
        depar.setNom_departement("sali");
        operation.add(depar);
        depar.setId_departement(3);
        
        Pole pole = new Pole();
        
        MetierPole opera = new MetierPole();
        pole.setNom_pole("sali");
        opera.add(pole);
        
       
        
        System.out.println(new java.sql.Date(System.currentTimeMillis()));
        User user = new User(0, "", "", "ss", new java.sql.Date(System.currentTimeMillis()), 22, 10);
        
        MetierUser MU = new MetierUser();
        
        MU.add(user);
        
        
 Demande demande = new Demande(new java.sql.Date(System.currentTimeMillis()), new java.sql.Date(System.currentTimeMillis()), "nouvelle demande");
        
        MetierDemande oper = new MetierDemande();
        
        oper.add(demande);
        
        
        
        
      

} }

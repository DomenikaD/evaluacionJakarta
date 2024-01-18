package ec.edu.ups.evaluacion63_delgado.business;

import ec.edu.ups.evaluacion63_delgado.dao.ClienteDao;
import ec.edu.ups.evaluacion63_delgado.model.Cliente;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.inject.Inject;


@Singleton
@Startup
public class GestionDatos {
	
	@Inject
	private ClienteDao daoCliente;
	

	@PostConstruct
	public void init() {
		System.out.println("STARING UP.....");
		
		
		
		/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		~~~~~~~~~~~ CLIENTES ~~~~~~~~~~~
		~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
		*/
		
		
		/*
		~~~~~~~~~ CLIENTE #1 ~~~~~~~~~ 
		*/
		Cliente cliente = new Cliente();
		cliente.setCodigo(1);
		cliente.setCedula("1717273401");
		
		
		/*
		~~~~~~~ DEUDAS DEL #1 ~~~~~~~ 
		*/
		cliente.setMes("marzo");
		cliente.setValor(35.25);
		
		
		cliente.setMes("diciembre");
		cliente.setValor(145.10);
		
		
		daoCliente.insert(cliente);
		
		
		
		/*
		~~~~~~~~~ CLIENTE #2 ~~~~~~~~~ 
		*/
		cliente = new Cliente();
		cliente.setCodigo(2);
		cliente.setCedula("0102104866");
		
		
		/*
		~~~~~~~ DEUDAS DEL #2 ~~~~~~~ 
		*/
		
		cliente.setMes("agosoto");
		cliente.setValor(65.32);
		
		
		cliente.setMes("diciembre");
		cliente.setValor(50.05);
		
		
		daoCliente.insert(cliente);
		
		
		
		
		/*
		~~~~~~~~~ CLIENTE #3 ~~~~~~~~~ 
		*/
		cliente = new Cliente();
		cliente.setCodigo(3);
		cliente.setCedula("1002064002");
		
		
		/*
		~~~~~~~ DEUDAS DEL #3 ~~~~~~~ 
		*/
		
		cliente.setMes("abril");
		cliente.setValor(75.99);
		
		
		cliente.setMes("julio");
		cliente.setValor(100.05);
		
		
		daoCliente.insert(cliente);
		

	
	}

}

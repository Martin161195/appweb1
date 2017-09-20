package appweb1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

	@RequestMapping("/hello")
	public String hello() {
	
		System.out.println("mapeo de /hello");
		
		return "demo springboot";
	}

	@RequestMapping(value="/cliente",method=RequestMethod.GET)
	public Cliente obtenerCliente() {
		
		Cliente cliente = new Cliente();
		cliente.setNombre("Oscar");
		cliente.setApellido("Pando");
		
		
		return cliente;
	}
	
}

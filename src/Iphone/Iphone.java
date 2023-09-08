package Iphone;

import java.time.LocalDate;
import java.time.Month;

import javax.swing.JOptionPane;

import Iphone.Telefone.*;
import Iphone.Musica.*;
import Iphone.Internet.*;

public class Iphone {
	public static void main(String[] args) {
		escolherAplicativo();
	}
	
	public static void escolherAplicativo() {
		
		System.out.println("Usuario escolhe o aplicativo");
		String usuario = JOptionPane.showInputDialog("qual aplicativo");
		
		if(usuario.equals("musica")) {
			new Reprodutor_Musical("nome",  "genero",  0.20, true);
			
		}else if(usuario.equals("internet")) {
			new Navegador_Internet("nome",  "dominio", LocalDate.of(2023, Month.MARCH, 9));
			
		}else if(usuario.equals("telefone")) {
			new Aparelho_Telefonico("nome", 718980422, "sms");
		}
	}

}

package Api;

import model.Hotel;

import javax.swing.JOptionPane;

import controller.UsuarioController;

import model.Quarto;

public class Main {
    public static void main(String[] args) {
       Hotel hotel = new Hotel();
       		UsuarioController usuarioController = new UsuarioController(hotel);
        while (true) {
            Object[] options = {"Cadastrar", "Login", "Listar Usuários", "Opções de Hoteis"};
            int escolha = JOptionPane.showOptionDialog(null, "Bem-vindo HospedeJá! Escolha uma opção:", "HOSPEDE JÁ!",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                    null, options, options[0]);

            switch (escolha) {
            case 0: //Cadastro
            	
                break;
             
            case 1: //Login
            		
            	break;
            	
            case 2: //Listar Usuarios
        		
            	break;	
                
            case 3: //Selecionar Hotel
        		
            	
            	
            	break;
            	
            	
        }
            
      
            
            
            
        }
    }
}
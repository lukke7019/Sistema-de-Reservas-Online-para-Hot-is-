package Api;

import model.Hotel;

import javax.swing.JOptionPane;

import controller.UsuarioController;


public class Main {
    public static void main(String[] args) {
       Hotel hotel = new Hotel();
       		UsuarioController usuarioController = new UsuarioController(hotel);
        while (true) {
            Object[] options = {"Cadastrar", "Login", "Listar Usuários"};
            int escolha = JOptionPane.showOptionDialog(null, "Bem-vindo ao Banco HOTEL! Escolha uma opção:", "HOTEL",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                    null, options, options[0]);

            switch (escolha) {
            case 0: //Cadastro
            	
                break;
             
            case 1: //Login
            		
            	break;	
                
            
          
        }
        }
    }
}
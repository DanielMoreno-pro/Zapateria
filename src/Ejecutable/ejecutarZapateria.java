package Ejecutable;

import Interfaces.FormularioLogin;

public class ejecutarZapateria {

    public static void main(String[] args) {
        FormularioLogin fl = new FormularioLogin();
        fl.setVisible(true);
        fl.setResizable(false);
        fl.setLocationRelativeTo(null);
        fl.setTitle("Zapatería Navarrete");
        
        
        System.out.println("Hola Ramon");
        
    }

}

package diaLaboral;

import java.util.Scanner;

public class DiaLaboral {
    public String seTrabaja(){
        System.out.println("Elige un dia de la semana:\n 1.Lunes \n 2.Martes \n 3.Miercoles \n 4.Jueves \n 5.Viernes \n 6.Sabado \n 7.Domingo");
        Scanner sc = new Scanner(System.in);
        byte dia = 0;
        String mensaje = null;
        try {
            dia = sc.nextByte();
            switch (dia) {
                case 1, 5 -> mensaje = "Dia laboral";
                case 6, 7 -> mensaje = "Dia Descanso";
                default -> mensaje = "Error dia no encontrado";
            }
        }catch (Exception e){
            mensaje = "Ha escrito un numero incorrecto";
        }
        return mensaje;
    }

}

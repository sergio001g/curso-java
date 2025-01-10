public class EstructurasControl {
    public static void main(String[] args) {
        int edad = 18;
        
        if (edad < 13) {
            System.out.println("Niño");
        } else if (edad >= 13 && edad < 18) {
            System.out.println("Adolescente");
        } else {
            System.out.println("Adulto");
        }
        
        String diaSemana = "Martes";
        switch (diaSemana) {
            case "Lunes":
            case "Martes":
            case "Miércoles":
            case "Jueves":
            case "Viernes":
                System.out.println("Día laboral");
                break;
            case "Sábado":
            case "Domingo":
                System.out.println("Fin de semana");
                break;
            default:
                System.out.println("Día inválido");
        }
    }
}


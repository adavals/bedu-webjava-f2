
public class Aplicacion {
    public static void main(String[] args){
        Helado heladoSuave = new HeladoSuave();
        System.out.println("Ya tengo un: " + heladoSuave.getDescription());
        System.out.printf("Por: $ %d \n", heladoSuave.getPrice());

        System.out.println("Le agregamos cobertura... ");
        heladoSuave = new DecoradorCobertura(heladoSuave);
        System.out.println("Ahora tengo un: " + heladoSuave.getDescription());
        System.out.printf("Por: $ %d \n", heladoSuave.getPrice());

        System.out.println("Le agregamos granola... ");
        heladoSuave = new DecoradorGranola(heladoSuave);
        System.out.println("Ahora tengo un: " + heladoSuave.getDescription());
        System.out.printf("Por: $ %d \n", heladoSuave.getPrice());

        System.out.println("Le agregamos topping... ");
        heladoSuave = new DecoradorTopping(heladoSuave);
        System.out.println("Ahora tengo un: " + heladoSuave.getDescription());
        System.out.printf("Por: $ %d \n", heladoSuave.getPrice());

        System.out.println("Le agregamos mermelada... ");
        heladoSuave = new DecoradorMermelada(heladoSuave);
        System.out.println("Ahora tengo un: " + heladoSuave.getDescription());
        System.out.printf("Por: $ %d \n", heladoSuave.getPrice());

        System.out.println("Y le agregamos galleta... ");
        heladoSuave = new DecoradorGalleta(heladoSuave);
        System.out.println("Ahora tengo un: " + heladoSuave.getDescription());
        System.out.printf("Por: $ %d \n", heladoSuave.getPrice());

        System.out.println("...y 200 de nivel de glucosa en sangre");

    }
}
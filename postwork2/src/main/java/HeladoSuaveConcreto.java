public class HeladoSuaveConcreto implements HeladoSuave{

    public HeladoSuaveConcreto(){
        System.out.println("Helado Suave");
    }

    @Override
    public float getPrecio() {
        return 30;
    }
}

import java.security.SecureRandom;

class contrasena {
    private int longitud=8;
    private String passw;

    public contrasena(){

    }
    public contrasena(int longitud){
        this.longitud=longitud;
        this.passw=generar_pasw(longitud);
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public void setPassw(String passw) {
        this.passw = passw;
    }

    public int getLongitud() {
        return longitud;
    }

    public String getPassw() {
        return passw;
    }


    public String generar_pasw(int n){
        StringBuilder aux= new StringBuilder();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        for (int i = 0; i < n; i++) {
            aux.append(caracteres.charAt(new SecureRandom().nextInt(caracteres.length())));
        }

        return aux.toString();
    }
    public String datos(){
        return getPassw()+" "+getLongitud()+" "+(esFuerte(passw)?"Fuerte":"Devil");
    }
    public boolean esFuerte(String passw){

        int mayusculas = 0;
        int minusculas= 0 ;
        int numeros= 0 ;
        for (char c : passw.toCharArray()) {
            if (Character.isUpperCase(c)) mayusculas++;
            else if (Character.isLowerCase(c)) minusculas++;
            else if (Character.isDigit(c)) numeros++;
        }

        return mayusculas >= 3 && minusculas >= 2 && numeros >= 3;
    }



}

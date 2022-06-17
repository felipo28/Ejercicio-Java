package ejerciciomientras;
public class Ejerciciomientras {

    /*
    Definir variable de control
    
    while (condicion){
        incrementar variable
    }
     */
    public static void main(String[] args) {
        //multiplicar por sumas susesivas
        
        int mdo = 0, mdor = 0, res = 0, i  = 1;
        mdo = 7;
        mdor = 8;
        while (i<=8) {            
            res+=mdo;
            i++;
        }
        System.out.println(mdo + " x " + mdor + " = " + res);
    }
}

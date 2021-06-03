import java.util.Scanner;
public class minijuego{
    public static void main (String [] args){
        Bichos [][] bichos = new Bichos [2][2]; 
        Scanner scan = new Scanner(System.in);

        System.out.println("----Bienvenido presione el numero 1 para comenzar el Juego.----");
        System.out.println("----Presione el numero 2 para disparar una bala.----");
        System.out.println("----Presione el numero 0 para salir.----");

        int num = scan.nextInt();
        while(true){
            if(num == 0){
                System.out.println("El juego ha terminado.");
                break;
            }else if(num == 1){
                for(int i  = 0; i < 2; i++){
                    for(int j = 0; j < 2;j++){
                        bichos[i][j] = new Bichos("",0);
                    }
                }
                int cantidadBichos = (int )Math.floor(Math.random()*4+1);

                System.out.println("Cree esta cantidad de bichos = " + cantidadBichos); 

                int limite = 0;
                for(int i = 0; i < 2; i++){
                    for(int j = 0; j < 2; j++){
                        int bichoaCrear = (int )Math.floor(Math.random()*2+1);
                        if(limite == cantidadBichos){
                            break;
                        }else if(bichoaCrear == 1){
                            Bichos b1 = new Bichos("BN",10);
                            limite++;
                            bichos[i][j] = b1;
                        }else if(bichoaCrear == 2){
                            Bichos b2 = new Bichos("BA",20);
                            limite++;
                            bichos[i][j] = b2;
                        }
                    }
                }
                System.out.println("-------------");
                for(int i = 0; i < 2; i++){
                    System.out.print("|");
                    for(int j = 0; j<2;j++){
                        if(bichos[i][j].getNombre().equals("")){
                            System.out.print("     "+"|");
                        }else{
                            System.out.print(bichos[i][j].toString()+"|");
                        }
                    }
                    System.out.println();
                    System.out.println("-------------");
                }
                
            }else if (num == 2){
                System.out.println("Ingrese el numero de la fila:");
                int fila = scan.nextInt();
                System.out.println("Ingrese el numero de la columna:");
                int columna = scan.nextInt();
                if (fila > 1){
                    break;
                }else if(columna > 1){
                    break;  
                }else{
                    bichos[fila][columna].atacar();
                }
                System.out.println("-------------");
                for(int i = 0; i < 2; i++){
                    System.out.print("|");
                    for(int j = 0; j<2;j++){
                        if(bichos[i][j].getNombre().equals("")){
                            System.out.print("     "+"|");
                        }else{
                            System.out.print(bichos[i][j].toString()+"|");
                        }
                    }
                    System.out.println();
                    System.out.println("-------------");
                }
            }
         
            if(bichos[0][0].getSalud()==0){
                if(bichos[0][1].getSalud()==0){
                    if(bichos[1][0].getSalud()==0){
                        if(bichos[1][1].getSalud()==0){
                        }
                         break;
                    }
                }
            }
            num = scan.nextInt();            
        }
    }
 }
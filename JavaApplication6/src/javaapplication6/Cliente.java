/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;


public class Cliente {
    
    
    public int CalcularFrecuencia() {
    int frecuencia,f2=0,f3=0,f4=0,f5=0,f6=0,f7=0,f8=0,f9=0,f10=0,f11=0,f12=0;
    Dado dado1=new Dado();
    Dado dado2=new Dado();
    
        for(int i=0;i<1000;i++){
 
           
            frecuencia=dado1.lanzar()+dado2.lanzar();
            if (frecuencia==2){
                f2++;
            }
           if (frecuencia==3){

              f3++;
          }
            if (frecuencia==4){
              f4++;
          }
             if (frecuencia==5){
              f5++;
          }
              if (frecuencia==6){
              f6++;
          }
               if (frecuencia==7){
              f7++;
          }
                if (frecuencia==8){
              f8++;
          }
                 if (frecuencia==9){
              f9++;
          }
                  if (frecuencia==10){
              f10++;
          }
                   if (frecuencia==11){
              f11++;
          }
                    if (frecuencia==12){
              f12++;
          }
        }
    
System.out.println("frecuencia 2:  "+f2);
System.out.println("frecuencia 3:  "+f3);
System.out.println("frecuencia 4:  "+f4);
System.out.println("frecuencia 5:  "+f5);
System.out.println("frecuencia 6:  "+f6);
System.out.println("frecuencia 7:  "+f7);
System.out.println("frecuencia 8:  "+f8);
System.out.println("frecuencia 9:  "+f9);
System.out.println("frecuencia 10: "+f10);
System.out.println("frecuencia 11: "+f11);
System.out.println("frecuencia 12: "+f12);
        

return 0;
        
    }

}


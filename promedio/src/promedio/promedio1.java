package promedio;
import java.io.*;

public class promedio1{
   
    public static final String delimiter = ",";                      //mira si el archivo esta separado por ","
   
   public static void read(String csvFile) {
	      try {
		         File file = new File(csvFile);                      //abre el archivo
		         FileReader fr = new FileReader(file);               //lee el archivo
		         BufferedReader br = new BufferedReader(fr);        //lee y guarda los datos del archivo
		         String line = "";                                  // son variables queutilizaremos mas tarde
		         String[] tempArr;                               
		         float sumapromestud = 0;
		         int cont = 1;                                      //** 
		         while((line = br.readLine()) != null) {            //lee cada linea del archivo  
		        	 
		        	 float num = 0;                                // variable
		        	 tempArr = line.split(delimiter);              //variable que coge la variable line y lo delimita por el delimitador        
		        	 for(int i = 2; i<=5;i++) {                     // ciclo for
		                num += Float.parseFloat(tempArr[i]);           //almacena la variable fila
		            }
		        	 
		          float promedio = num /4;                            // operacion que saca el promedio de los estudiantes
		          System.out.println("Promedio estudiante "+cont+": "+promedio);       // imprime el promedio de los estudiantes
		          sumapromestud += promedio;                           // almacena la variable de los estudiantes  para hallarr  promedio total del salon
		          cont ++;                                              //contador      
		         }
		         float promeTotaldelsalon = sumapromestud / 19;          //calculo para determinar el promedio total de los estudiantes 
		         System.out.println("Promedio total del salón es: "+promeTotaldelsalon); //muestra el resultado de los estudiantes
		         
		         } catch(IOException ioe) {
		            ioe.printStackTrace();
		            
		         }
	             finally {
	              if (null!=br) {
	               br.close();
	          }

		   }
		   
   
   public static void main(String[] args) {
      String csvFile = D:\OneDrive\Escritorio\projects\PromedioCSV.csv";
      lector_csv_y_promedio_de_notas.read(csvFile);     //funcion    
      
   }
}

package arrayClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Frigorifero {

		public static void main(String[] args) {

			Cibo[] arrCibi= new Cibo[3];//dichiarazione di un arrai non di un oggetto
			
			Cibo cibo1= new Cibo("formaggio",2);
			Cibo cibo2= new Cibo("insalata",3);
			Cibo cibo3= new Cibo("pollo",5);
			
			arrCibi[0]=cibo1;
			arrCibi[1]=cibo2;
			arrCibi[2]=cibo3;
			
			System.out.println("nel frigorifero ho i seguenti cibi:");
			for (Cibo cibo : arrCibi) {
				System.out.println(cibo);//perchè ho il toString()
			}
			
			//oggetti anonimi
			Cibo[] dispensa= {new Cibo("formaggio",2),new Cibo("insalata",3),new Cibo("pollo",5)};
			for (Cibo cibo : dispensa) {
				System.out.println(cibo);
			}
			
			//qui trasformiamo l'array in un arrayList
			ArrayList<Cibo> lista= new ArrayList<>(Arrays.asList(dispensa));
			lista.add(new Cibo("pasta",8));
			
			for (Cibo cibo : lista) {
				System.out.println(cibo);
			}
			
			
			
			
			
			
			
			
		}

	}



//nested ForLoop is just a ForLoop in a ForLoop
package nestedForLoop;

public class nestedForLoop {

	public static void main(String[] args) {
		for (int i =0; i < 10; i++) {
		 System.out.println("Horray!!");
	}
		System.out.println("----------------");
		
		String[] colors = {"Red", "Purple", "Blue"};
		
		for (int i = 0; i < 3; i++) {
		System.out.println(colors[i]);			
		}
		System.out.println("----------------");
		
		String [] [] fancyColors ={ {"Red", "Purple", "Blue"},
									{"Cyan", "Magenta", "Turqiouse"}
		};
		for (int row =0; row < 2;  row ++) {
		 for (int column = 0; column < 3; column ++) {	
			 System.out.println(fancyColors[row][column]);
	}
  }
 }
}

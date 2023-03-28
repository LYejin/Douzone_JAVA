import java.io.IOException;

import kr.or.kosa.utils.ExClass;

public class Ex04_Throws {

	public static void main(String[] args)  {  //1) 첫번재 방법 : throws NullPointerException, IOException
		/*
		 2) 두번째 방법 
		try {
			ExClass ex = new ExClass("Temp");
		} catch (NullPointerException | IOException e1) {
			e1.printStackTrace();
		}
		 */
		
		/*
		 3) 세번째 방법
		try {
			ExClass ex = new ExClass("Temp");
		} catch (NullPointerException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		*/
		
		
		
		//ExClass ex = new ExClass("Temp");
		
		try {
			
		} catch (Exception e) {
			
		} finally {
			
		}

	}

}

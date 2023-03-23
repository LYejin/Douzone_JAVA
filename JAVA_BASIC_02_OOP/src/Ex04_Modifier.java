import kr.or.kosa.Mouse;
import kr.or.kosa.NoteBook;

public class Ex04_Modifier {

	public static void main(String[] args) {
		
		/*
		NoteBook notebook = new NoteBook();
		notebook.color = "blue";
		notebook.year = -2023; //직접할당 
		
		System.out.println("년도 : " + notebook.year);
		*/
		
		NoteBook notebook = new NoteBook();
		notebook.setColor("blue");
		notebook.setYear(-100);; //The field NoteBook.year is not visible 안 보여..
		notebook.noteBookInfo();
		System.out.println(notebook.getYear());
		System.out.println(notebook.getColor());
		
		
		//---------------------------------------------------------------------
		NoteBook mynote = new NoteBook(); // 내가 만든 설계도 메모리에 올리기
		Mouse mouse = new Mouse();
		
		// 마우스 필요해 연결해 줄게 
		mynote.handleMouse(mouse); // 주소값을 전달
		
	}

}

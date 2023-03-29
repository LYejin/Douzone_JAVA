package kr.or.kosa.utils;

import java.io.IOException;

/*
설계도 
.....
개발자아니고 설계자 입장에서 ... 생각 ....
개발자가 어떤 상황에 대해서 반드시 예외를 처리 했으면 ... 강제성

생성자나 함수 만들었을때 ... 반드시 예외처리를 하도록 강제 코드 생성 
 */

public class ExClass { // 
	public ExClass(String path) throws IOException, NullPointerException { // 예외처리를 하지 않으면 동작하지 않음 
		System.out.println("path : " + path );
	}
}

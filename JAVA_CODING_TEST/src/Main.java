import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 숫자로도 받을 수 있음
		int N = Integer.parseInt(br.readLine());
		Stack<String> stack = new Stack<>();

		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == '(') {
					stack.push("(");
				} else {
					if (stack.size() == 0) {
						stack.push(")");
						break;
					} else {
						stack.pop();
					}
				}
			}
			
			if (stack.empty()) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			stack.clear();
		}
	}
}

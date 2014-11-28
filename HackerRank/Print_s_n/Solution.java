import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		try {
			int n = 0;
			String s = new String("");
			BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
			n = Integer.parseInt(stdin.readLine());
			s = stdin.readLine();
			for (int i = 1; i <= n; i++) {
				System.out.println(s);
			}
		} catch (IOException io) {
			io.printStackTrace();
		}
	}
}

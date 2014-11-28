import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		
		try {
		
			BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(stdin.readLine());
			String s = stdin.readLine();
			
			for (int i = 1; i <= n; i++) System.out.println(s);
		
		} catch (IOException io) {
			io.printStackTrace();
		}

	}

}

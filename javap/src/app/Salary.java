package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Salary {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int salary = 0;
	
	int init() {
		try {
			salary = Integer.parseInt(br.readLine());
			
		} catch (IOException e) {
			// TODO: handle exception
		}
		return salary;
	}
	
	void cal() {
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

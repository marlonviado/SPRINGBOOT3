package com.marlonviado.main;

public class Main {
	
	public static void main(String[] args) {
		
		String header = "firstName,lastName";
		
		StringBuilder stringBuilder = new StringBuilder();
		
		for(int i=0; i<header.length(); i++) {
			if(Character.isUpperCase(header.charAt(i))) {
				stringBuilder.append((char)' ');
				stringBuilder.append((char)header.charAt(i));
			}
			else if(header.charAt(i)==',') {
				stringBuilder.append((char)header.charAt(i));
			}

			else {
				stringBuilder.append((char)header.charAt(i));
			}
		}
		
		System.out.println(stringBuilder.toString().toUpperCase());
		
	}

}

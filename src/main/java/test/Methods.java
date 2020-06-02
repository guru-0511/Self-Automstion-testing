package test;

import java.util.Scanner;
import java.util.Set;

import com.beust.jcommander.converters.IntegerConverter;

import net.bytebuddy.asm.Advice.OffsetMapping.Target.ForArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class LinkListExample {

	static String getUserInput() {
		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine();
		return userInput;

	}

	static ArrayList<Character> convertStringToCharacter(String userInput) {
		//LinkedList<Character> llis = new LinkedList<>();
		 ArrayList<Character> llis = new ArrayList<Character>();
		for (int i = 0; i < userInput.length(); i++) {
			char ch = userInput.charAt(i);
			llis.add(ch);

		}
		System.out.println("Before Sorting the String Character ="  + llis);
		return llis;
	}

	// Sort the list
	static void sort() {
		
		String userInput = getUserInput();
		
		ArrayList<Character> sorting = convertStringToCharacter(userInput);
		//ArrayList<Character> sorting = convertStringToCharacter(userInput);
		
		sorting.sort(Comparator.reverseOrder());
		
		System.out.println("After Sorting the String Character ="  + sorting);
		if (sorting.clone().equals(userInput)) {
			System.out.println("Not Equal");
		}
		else {
			System.out.println("i am equal"); 
		}
		
	}

}

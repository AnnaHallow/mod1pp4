package com.techelevator;


import com.techelevator.search.SearchDomain;
import com.techelevator.search.SearchEngine;

import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		try {

			// Step Two: Create TELog, and log the start of the application.
			 TELog.log("Search application started.");
			
			
			
			// Step Four: Instantiate a Search Domain
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter the folder to be searched:");
			String folder = input.nextLine();
			SearchDomain searchDomain = new SearchDomain(folder);
			TELog.log(searchDomain.toString());
			
			
			
			// Step Six: Single word search
			SearchEngine searchEngine = new SearchEngine(searchDomain);
			searchEngine.indexFiles();
			System.out.println("Please input the word to be searched:");
			String wordToSearch = input.nextLine();

			for(String file : searchEngine.search(wordToSearch)) {
				if(searchEngine.search(wordToSearch).size() < 0){
					System.out.println("No files containing this word could be found.");
				}else {
					System.out.println(searchEngine.search(wordToSearch));
				}
			}

			
			
			// Step Seven: Multiple word search
			//
			
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

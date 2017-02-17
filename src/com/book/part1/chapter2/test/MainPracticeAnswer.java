package com.book.part1.chapter2.test;

import java.io.IOException;

import com.book.part1.chapter2.answer.FileIO;
import com.book.part1.chapter2.answer.FileProperties;

/************************************************
 * Description:
 * 
 * @author Vermouth.yf
 * @version 1.0
 * @date ：2017年2月17日 上午10:12:20
 **************************************************/
public class MainPracticeAnswer {
	public static void main(String[] args) {
		FileIO f = new FileProperties();
		try{
			f.readFromFile("file.txt");
			f.setValue("year", "2017");
			f.setValue("month", "02");
			f.setValue("date", "17");
            f.writeToFile("newfile.txt");	
            System.out.println(f.getValue("date"));
		}catch (IOException e){
			e.printStackTrace();
		}
		
 	}
}

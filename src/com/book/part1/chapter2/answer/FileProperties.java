package com.book.part1.chapter2.answer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/************************************************
    * Description: 
    *     我把问题想复杂了，也就是说明  在这个练习上 我并未理解其真正含义
    * 
    * @author    Vermouth.yf  
    * @version  1.0
    * @date ：2017年2月17日 上午11:24:10 
**************************************************/
public class FileProperties extends Properties implements FileIO {

	private static final long serialVersionUID = 1L;

	@Override
	public void readFromFile(String filename) throws IOException {
          load(new FileInputStream("file/"+File.separator+filename));
	}

	@Override
	public void writeToFile(String filename) throws IOException {
          store(new FileOutputStream("file/"+File.separator+filename),"written by FileProperties");
	}

	@Override
	public void setValue(String key, String value) {
          setProperty(key,value);
	}

	@Override
	public String getValue(String key) {
		return getProperty(key);
	}

}

package com.book.part1.chapter2.practice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;


/************************************************
    * Description: 
    *    adapter
    *    
    *    我自己写的啊 好棒
    *    
    *    然鹅 标准答案还是参考answer包里的FileProperties
    * 
    * @author    Vermouth.yf  
    * @version  1.0
    * @date ：2017年2月17日 上午10:06:46 
**************************************************/
public class FileProperties implements FileIO {
	
	private Properties prop;
	
	public FileProperties(){
		prop = new Properties();
	}
	
	@Override
	public void readFromFile(String filename) throws IOException {
		InputStream input = null;
		File file = null;
        try {
			file = new File("file/"+File.separator+filename);
		    input = new FileInputStream(file);
			prop.load(input);
			Iterator<Entry<Object,Object>> it = prop.entrySet().iterator();
			System.out.println("读入的文件内容如下：");
			while(it.hasNext()){
				Entry<Object,Object> entry = (Entry<Object,Object>)it.next();
				String key = (String)entry.getKey();
				String value = (String)entry.getValue();
				System.out.println(key+"="+value);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			input.close();
		}
	}

	@Override
	public void writeToFile(String filename) throws IOException {
		File file = null;
		BufferedWriter bw = null;
        try {
		    file = new File("file/"+File.separator+filename);
			bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
			StringBuffer sb = new StringBuffer();
			Iterator<Entry<Object,Object>> it = prop.entrySet().iterator();
			while(it.hasNext()){
				Entry<Object,Object> entry = (Entry<Object,Object>)it.next();
				String key = (String)entry.getKey();
				String value = (String)entry.getValue();
				sb.append(key).append("=").append(value).append("\n");
			}
			bw.write(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			bw.close();
		}
	}

	@Override
	public void setValue(String key, String value) {
       prop.setProperty(key, value);
	}

	@Override
	public String getValue(String key) {
		return prop.getProperty(key);
	}

}

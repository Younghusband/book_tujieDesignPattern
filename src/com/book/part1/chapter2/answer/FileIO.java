package com.book.part1.chapter2.answer;

import java.io.IOException;

/************************************************
    * Description: 
    *     角色为target
    * @author    Vermouth.yf  
    * @version  1.0
    * @date ：2017年2月17日 上午10:04:47 
**************************************************/
public interface FileIO {
    public void readFromFile(String filename) throws IOException;
    public void writeToFile(String filename) throws IOException;
    public void setValue(String key,String value);
    public String getValue(String key);
}

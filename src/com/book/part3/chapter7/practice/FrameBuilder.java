package com.book.part3.chapter7.practice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/************************************************
    * Description: 
    * 
    *   基于JFC java foundation classes 的gui界面来扮演ConcreteBuilder角色。
    * 
    * @author    Vermouth.yf  
    * @version  1.0
    * @date ：2017年2月22日 下午3:49:42 
**************************************************/
public class FrameBuilder extends Builder implements ActionListener{
	private JFrame frame = new JFrame();
    private Box box = new Box(BoxLayout.Y_AXIS);  
	@Override
	protected void buildTitle(String s) {
		frame.setTitle(s);
	}

	@Override
	protected void buildString(String s) {
		box.add(new JLabel(s));
	}
	@Override
	protected void buildItems(String[] items) {
		Box innerbox = new Box(BoxLayout.Y_AXIS);
		for(String temp : items){
			JButton button = new JButton(temp);
			button.addActionListener(this);
			innerbox.add(button);
		}
		box.add(innerbox);
	}

	@Override
	protected void buildclose() {
		frame.getContentPane().add(box);
		frame.pack();
		frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
	}
	
	public JFrame getResult(){
		return frame;
	}

}

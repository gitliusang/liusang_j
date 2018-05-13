package fileList;

import java.io.File;

public class fileList {

	public static void main(String[] args) {
		//1.创建file对象---读取起始位置
		File f = new File("d:/ssr");
		
		
		readFile(f, 0);
		
	}
	
	/**
	 * 读取目录文件方法
	 * @param file  文件名（文件位置）
	 * @param level  层级
	 */
	public static void readFile(File file,int level){
		//输出前先输出-方便层级展示
		for (int i = 0; i <level; i++) {
			System.out.print("-");
		}
		System.out.println(file.getName());
		
		//判断当前文件是否是文件夹
		if (file.isDirectory()) {
			//创建集合获取文件夹下的所以信息
			File [] files = file.listFiles();
			//遍历file对象
			for (File temfile : files) {
//				System.out.println(temfile.getName());
				readFile(temfile, level+1);
			}
			
		}
	}
}

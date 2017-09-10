package com.imooc.view;

import java.util.Scanner;

import com.imooc.action.GoddessAction;
import com.imooc.model.Goddess;

public class View {

	private static final String CONTEXT = "欢迎来到女神禁区：\n" + "下面是女神禁区的功能列表：\n"
			+ "[MAIN/M]:主菜单\n" + "[QUERY/Q]:查看全部女神的信息\n"
			+ "[GET/G]:查看某位女神的详细信息\n" + "[ADD/A]:添加女神信息\n"
			+ "[UPDATE/U]:更新女神信息\n" + "[DELETE/D]:删除女神信息\n"
			+ "[SEARCH/S]:查询女神信息(根据姓名、手机号来查询)\n" + "[EXIT/E]:退出女神禁区\n"
			+ "[BREAK/B]:退出当前功能，返回主菜单";

	private static final String OPERATION_MAIN = "MAIN";
	private static final String OPERATION_QUERY = "QUERY";
	private static final String OPERATION_GET = "GET";
	private static final String OPERATION_ADD = "ADD";
	private static final String OPERATION_UPDATE = "UPDATE";
	private static final String OPERATION_DELETE = "DELETE";
	private static final String OPERATION_SEARCH = "SEARCH";
	private static final String OPERATION_EXIT = "EXIT";
	private static final String OPERATION_BREAK = "BREAK";

	public static void main(String[] args) {
		System.out.println(CONTEXT);
		Scanner scan=new Scanner(System.in);
		Goddess goddess = new Goddess();
		GoddessAction action = new GoddessAction();
		String prenious = null;
		
		while(scan.hasNext()) {
			String input = scan.next().toString();
			if (OPERATION_EXIT.equals(input.toUpperCase())
					||OPERATION_EXIT.substring(0, 1).equals(input.toUpperCase())) {
				System.out.println("您已成功退出女神禁区");
				break;
			}else if(OPERATION_ADD.equals(input.toUpperCase())
					||OPERATION_ADD.substring(0, 1).equals(input.toUpperCase())){
				System.out.println("请输入女神的信息[姓名]：");
				
			}
					
		}
	}
}

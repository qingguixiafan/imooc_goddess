package com.imooc.view;

import java.util.Scanner;

import com.imooc.action.GoddessAction;
import com.imooc.model.Goddess;

public class View {

	private static final String CONTEXT = "��ӭ����Ů�������\n" + "������Ů������Ĺ����б�\n"
			+ "[MAIN/M]:���˵�\n" + "[QUERY/Q]:�鿴ȫ��Ů�����Ϣ\n"
			+ "[GET/G]:�鿴ĳλŮ�����ϸ��Ϣ\n" + "[ADD/A]:���Ů����Ϣ\n"
			+ "[UPDATE/U]:����Ů����Ϣ\n" + "[DELETE/D]:ɾ��Ů����Ϣ\n"
			+ "[SEARCH/S]:��ѯŮ����Ϣ(�����������ֻ�������ѯ)\n" + "[EXIT/E]:�˳�Ů�����\n"
			+ "[BREAK/B]:�˳���ǰ���ܣ��������˵�";

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
				System.out.println("���ѳɹ��˳�Ů�����");
				break;
			}else if(OPERATION_ADD.equals(input.toUpperCase())
					||OPERATION_ADD.substring(0, 1).equals(input.toUpperCase())){
				System.out.println("������Ů�����Ϣ[����]��");
				
			}
					
		}
	}
}

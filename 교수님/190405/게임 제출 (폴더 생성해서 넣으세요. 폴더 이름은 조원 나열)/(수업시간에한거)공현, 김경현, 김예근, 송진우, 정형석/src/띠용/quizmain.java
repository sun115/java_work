package ���;

import java.util.Scanner;

public class quizmain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�÷��̾� �̸�");
		String pName = s.next();
		System.out.println("�÷��̾��� ü��");
		int pHP = s.nextInt();
		Player p = new Player(pName, pHP);
		Enemy[] enemy = new Enemy[5];
		for (int i = 0; i < enemy.length; i++) {
			enemy[i] = new Enemy();
			enemy[i].makeEnemy();
		}
		System.out.println("���ʹ����� ����");
		while (p.status()) {
			
			s.nextLine();
			for (int i = 0; i < enemy.length; i++) {
				p.attack();
				enemy[i].eAttack();
			}
			boolean nonDefeat = false;
			for (int i = 0; i < enemy.length; i++) {
				if (enemy[i].HP > 0) {
					nonDefeat = true;
				}
			}
			if (!nonDefeat) {
				System.out.println("�÷��̾��� �¸�");
				break;
			}
			if (!p.status()) {
				System.out.println("�ֱ� �̤�");
				break;
			}
		}
	}
}
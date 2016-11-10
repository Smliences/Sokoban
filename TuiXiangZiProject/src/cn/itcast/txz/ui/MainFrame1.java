package cn.itcast.txz.ui;

import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MainFrame1 extends Frame implements KeyListener{
	public MainFrame1(){
		targenInit();
		wolfInit();
		//����
		sheepInit();
		
		treeInit();
		backgroundInit();
		//����
		setMainFrameUI();
		
		this.addKeyListener(this);
	}
	
	private void treeInit() {
		Icon t = new ImageIcon("1.png");
		for(int i = 0;i<datas.length;i++){
			for(int j=0;j<datas[i].length;j++){
				if(datas[i][j]==1){
				JLabel lab_tree = new JLabel(t);
				lab_tree.setBounds(12+j*50,36+i*50,50,50);
				this.add(lab_tree);
				}
			}
			
		}
		
	}

	private void targenInit() {
		Icon i =new ImageIcon("8.png");
		JLabel lab_target1 = new JLabel(i);
		lab_target1.setBounds(712,136,50,50);
		this.add(lab_target1);
		
		JLabel lab_target2 = new JLabel(i);
		lab_target2.setBounds(712,186,50,50);
		this.add(lab_target2);
		
		JLabel lab_target3 = new JLabel(i);
		lab_target3.setBounds(712,236,50,50);
		this.add(lab_target3);
	}
	
	JLabel[][] sheeps = new JLabel[12][16];
//	int [][] datas = {
//			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
//			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
//			{1,0,1,0,1,1,1,0,1,1,1,1,1,0,0,1},
//			{1,0,1,0,0,0,1,0,0,0,0,0,1,0,0,1},
//			{1,0,1,0,1,1,1,0,0,0,0,0,1,0,0,1},
//			{1,0,1,0,1,0,0,0,0,1,1,1,1,0,0,1},
//			{1,0,1,0,1,1,1,0,0,0,0,0,1,0,0,1},
//			{1,0,1,0,0,0,0,0,0,0,0,0,1,0,0,1},
//			{1,0,1,0,0,0,0,0,1,1,1,1,1,0,0,1},
//			{1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1},
//			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
//			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
//	};
	int [][] datas = {
	{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
	{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
	{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
	{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
	{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
	{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
	{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
	{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
	{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
	{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
	{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
	{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
};

	int wx;
	int wy;
	int num = 0;
	int total = 3;
	private void sheepInit() {

		//����һֻ��������ķ�ʽ����
				//�������ӵ�ģ��
				//1.����һ��ͼƬ������ͼƬ
				Icon i = new ImageIcon("sheep-no.png");
				//2.ʹ��JLabel���ģ������
				JLabel lab_sheep1 = new JLabel(i);
				//3.�������ӵ�λ��
				lab_sheep1.setBounds(12+6*50, 36+4*50, 50, 50);
				//4.��������ӵ�������
				this.add(lab_sheep1);
				//�޸����Ӷ�Ӧλ���ϵ����Ϊ4
				datas[4][6] = 4;
				//�����JLabel������뵽sheeps��������
				sheeps[4][6] = lab_sheep1;
				
				//�����ڶ�ֻ��ͼƬ����Ҫ������
				//�ڶ�ֻ������ʱ��ֻ��Ҫ�޸Ķ�Ӧ����ʾλ�þ�����
				JLabel lab_sheep2 = new JLabel(i);
				lab_sheep2.setBounds(312, 336, 50, 50);	
				this.add(lab_sheep2);
				datas[6][6] = 4;
				sheeps[6][6] = lab_sheep2;
				
				//��������ֻ��ͼƬ����Ҫ������
				//����ֻ������ʱ��ֻ��Ҫ�޸Ķ�Ӧ����ʾλ�þ�����
				JLabel lab_sheep3 = new JLabel(i);
				lab_sheep3.setBounds(312, 436, 50, 50);	
				this.add(lab_sheep3);
				datas[8][6] = 4;
				sheeps[8][6] = lab_sheep3;
	}

	private void wolfInit() {
		//�������λ�������
		wx = 4 ;
		wy = 5 ;
		
		//ʹ��һ��ͼƬ��ģ������
		//1.����һ��ͼƬ������ͼƬ
		Icon i = new ImageIcon("wolf-zm.png");
		//2.ʹ��JLabel���ģ������
		lab_wolf = new JLabel(i);
		//3.������������Ļ�ϵ���ʾλ��
		//�������ʾλ�÷����ںδ���Ϊ���?----------------
		lab_wolf.setBounds(12 + wx*50, 36 + wy*50, 50, 50);
		//4.���������ŵ���������
		this.add(lab_wolf);
		//datas[6][4] = 2;
	}
	JLabel lab_wolf;

	private void backgroundInit(){
		Icon i = new ImageIcon("bg.png");
		JLabel lab_bg = new JLabel(i);
		lab_bg.setBounds(12,36,800,600);
		this.add(lab_bg);
	}
	
	private void setMainFrameUI(){
		this.setLayout(null);
		this.setSize(825, 650);
		//this.setResizable(false);
		this.setLocation(150, 100);
		this.setTitle("������ V1.0 by Smilence");
		this.setVisible(true);
	}

	public void keyTyped(KeyEvent e) {
		
	}
//��37 ��38 ��39 ��40
	private void victory(){
		//���num��ֵ������total��ֵ��ʤ��
		if(num == total){
			System.out.println("ʤ��");
			//����Լ�����Ҫ���ʤ�����Dialog
			//��һ�ؾ������¶�ȡһ��ȫ�µ����飬���ǣ����������³�ʼ������num��total���³�ʼ��
		}
	}
//	public void keyPressed(KeyEvent e) {
//		int key = e.getKeyCode();
//		int x;
//		int y;
//		Icon r = new ImageIcon("0-1.png");
//		Icon l = new ImageIcon("01.png");
//		Icon u = new ImageIcon("10.png");
//		Icon d = new ImageIcon("-10.png");
//		if(key==39){
//			if(datas[wy][wx+1]==1){
//				return ;
//			}
//			if(datas[wy][wx+1]==4){
//				if((datas[wy][wx+2]!=1) && (datas[wy][wx+2]!=4)){
//				datas[wy][wx+1] = 0;
//				datas[wy][wx+2] = 4;
//				sheeps[wy][wx+1].setLocation(12+wx*50+100,36+wy*50);
//				sheeps[wy][wx+2] = sheeps[wy][wx+1];
//				sheeps[wy][wx+2]=null;
//			
//				
//			
//			wx = wx+1;
//		x = (int)lab_wolf.getLocation().getX();
//		y = (int)lab_wolf.getLocation().getY();
//			
//		lab_wolf.setLocation(x+50, y);
//		lab_wolf.setIcon(r);	
//		
//				}
//			}
//			if(datas[wy][wx+1]==0){
//				wx = wx+1;
//				x = (int)lab_wolf.getLocation().getX();
//				y = (int)lab_wolf.getLocation().getY();
//					
//				lab_wolf.setLocation(x+50, y);
//				lab_wolf.setIcon(r);
//				return ;
//			}
//		}
//		
//		if(key==40){
//			if(datas[wy+1][wx]==1){
//				return ;
//			}
//			if(datas[wy+1][wx]==4){
//				if((datas[wy+2][wx]!=1)&&(datas[wy+2][wx]!=4)){
//				datas[wy+1][wx] = 0;
//				datas[wy+2][wx] = 4;
//				sheeps[wy+1][wx].setLocation(12+wx*50,36+wy*50+100);
//				sheeps[wy+2][wx] = sheeps[wy+1][wx];
//				sheeps[wy+2][wx]=null;
//			
//				
//			
//				wy = wy +1;
//				x =(int) lab_wolf.getLocation().getX();
//				y = (int) lab_wolf.getLocation().getY();
//				
//				lab_wolf.setIcon(d);
//				lab_wolf.setLocation(x,y+50);	
//				
//				}
//			}
//			if(datas[wy+1][wx]==0){
//				wy = wy +1;
//				x =(int) lab_wolf.getLocation().getX();
//				y = (int) lab_wolf.getLocation().getY();
//				
//				lab_wolf.setIcon(d);
//				lab_wolf.setLocation(x,y+50);
//				return ;
//			}
//		
//			
//		}
//		if(key==38){
//			if(datas[wy-1][wx]==1){
//				return ;
//			}
//		
//			if(datas[wy-1][wx]==4){
//				if((datas[wy-2][wx]!=1)&&(datas[wy-2][wx]!=4)){
//				datas[wy-1][wx] = 0;
//				datas[wy-2][wx] = 4;
//				sheeps[wy-1][wx].setLocation(12+wx*50,36+wy*50-100);
//				sheeps[wy-2][wx] = sheeps[wy-1][wx];
//				sheeps[wy-2][wx]=null;
//				
//				wy = wy -1;
//				x =(int) lab_wolf.getLocation().getX();
//				y = (int) lab_wolf.getLocation().getY();
//				
//				lab_wolf.setLocation(x,y-50);	
//				lab_wolf.setIcon(u);
//				
//				}
//			}
//			if(datas[wy-1][wx]==0){
//				wy = wy -1;
//				x =(int) lab_wolf.getLocation().getX();
//				y = (int) lab_wolf.getLocation().getY();
//				
//				lab_wolf.setLocation(x,y-50);
//				lab_wolf.setIcon(u);
//				return ;
//			}
//			
//		
//			
//		}
//		if(key==37){
//			if(datas[wy][wx-1]==1){
//				return ;
//			}
//			if(datas[wy][wx-1]==4){
//				if((datas[wy][wx-2]!=1)&&(datas[wy][wx-2]!=4)){
//				datas[wy][wx-1] = 0;
//				datas[wy][wx-2] = 4;
//				sheeps[wy][wx-1].setLocation(12+wx*50-100,36+wy*50);
//				sheeps[wy][wx-2] = sheeps[wy][wx-1];
//				sheeps[wy][wx-2]=null;
//			
//				
//			
//			wx = wx-1;
//		x = (int)lab_wolf.getLocation().getX();
//		y = (int)lab_wolf.getLocation().getY();
//			
//		lab_wolf.setLocation(x-50, y);
//		lab_wolf.setIcon(l);	
//		
//				}
//			}
//			if(datas[wy][wx-1]==0){
//				wx = wx-1;
//				x = (int)lab_wolf.getLocation().getX();
//				y = (int)lab_wolf.getLocation().getY();
//					
//				lab_wolf.setLocation(x-50, y);
//				lab_wolf.setIcon(l);
//				return ;
//			}
//			
//		}
		//��37 ��38 ��39 ��40
	public void keyReleased(KeyEvent e) {
		//������̺����ڳ����ж���ִ����
		//��ηֱ��û�������Ǽ����ϵ�ĳ������
		//ͨ�����ֵ�ֱ�����һ������
		//��ȡ����ֵ�ķ�ʽ��
		//key���������������ĸ�����
		//�� 37
		//�� 38
		//�� 39
		//�� 40
		int key = e.getKeyCode();
		if(key == 39){
			//�����������ƶ�
			//�����ϵ�һλ������� wy wx+1
			//�����ϵڶ�λ������� wy wx+2
			if(datas[wy][wx+1] == 0){
				wx = wx+1;
				int x =(int)lab_wolf.getLocation().getX();
				int y =(int)lab_wolf.getLocation().getY();
				lab_wolf.setLocation(x+50, y);
				Icon i = new ImageIcon("wolf-ym.png");
				lab_wolf.setIcon(i);
				return;
			}
			
			if(datas[wy][wx+1] == 1){
				return;
			}
			if(datas[wy][wx+1] == 4 && datas[wy][wx+2] == 1){
				return;
			}
			if(datas[wy][wx+1] == 4 && datas[wy][wx+2] == 4){
				return;
			}
			if(datas[wy][wx+1] == 4 && datas[wy][wx+2] == 12){
				return;
			}
			if(datas[wy][wx+1] == 12 && datas[wy][wx+2] == 1){
				return;
			}
			if(datas[wy][wx+1] == 12 && datas[wy][wx+2] == 4){
				return;
			}
			if(datas[wy][wx+1] == 12 && datas[wy][wx+2] == 12){
				return;
			}
			
			if(datas[wy][wx+1] == 8){
				wx = wx+1;
				int x =(int)lab_wolf.getLocation().getX();
				int y =(int)lab_wolf.getLocation().getY();
				lab_wolf.setLocation(x+50, y);
				Icon i = new ImageIcon("wolf-ym.png");
				lab_wolf.setIcon(i);
				return;
			}

			if(datas[wy][wx+1] == 4 && datas[wy][wx+2] == 0){
				datas[wy][wx+1] = 0;
				datas[wy][wx+2] = 4;
			}

			if(datas[wy][wx+1] == 4 && datas[wy][wx+2] == 8){
				datas[wy][wx+1] = 0;
				datas[wy][wx+2] = 12;
				num++;
			}
			if(datas[wy][wx+1] == 12 && datas[wy][wx+2] == 0){
				datas[wy][wx+1] = 8;
				datas[wy][wx+2] = 4;
				num--;
			}
			if(datas[wy][wx+1] == 12 && datas[wy][wx+2] == 8){
				datas[wy][wx+1] = 8;
				datas[wy][wx+2] = 12;
			}
			sheeps[wy][wx+1].setLocation(12+wx*50+100,36+wy*50);
			sheeps[wy][wx+2] = sheeps[wy][wx+1];
			sheeps[wy][wx+1] = null;
			wx = wx+1;
			int x =(int)lab_wolf.getLocation().getX();
			int y =(int)lab_wolf.getLocation().getY();
			lab_wolf.setLocation(x+50, y);
			Icon i = new ImageIcon("wolf-ym.png");
			lab_wolf.setIcon(i);
			//�ж�ʤ��
			victory();
			return;
		}
		if(key == 37){
			//�����������ƶ�
			//�����ϵ�һλ������� wy wx-1
			//�����ϵڶ�λ������� wy wx-2
			if(datas[wy][wx-1] == 0){
				wx = wx-1;
				int x =(int)lab_wolf.getLocation().getX();
				int y =(int)lab_wolf.getLocation().getY();
				lab_wolf.setLocation(x-50, y);
				Icon i = new ImageIcon("wolf-zb.png");
				lab_wolf.setIcon(i);
				return;
			}
			
			if(datas[wy][wx-1] == 1){
				return;
			}
			if(datas[wy][wx-1] == 4 && datas[wy][wx-2] == 1){
				return;
			}
			if(datas[wy][wx-1] == 4 && datas[wy][wx-2] == 4){
				return;
			}
			if(datas[wy][wx-1] == 4 && datas[wy][wx-2] == 12){
				return;
			}
			if(datas[wy][wx-1] == 12 && datas[wy][wx-2] == 1){
				return;
			}
			if(datas[wy][wx-1] == 12 && datas[wy][wx-2] == 4){
				return;
			}
			if(datas[wy][wx-1] == 12 && datas[wy][wx-2] == 12){
				return;
			}
			
			if(datas[wy][wx-1] == 8){
				wx = wx-1;
				int x =(int)lab_wolf.getLocation().getX();
				int y =(int)lab_wolf.getLocation().getY();
				lab_wolf.setLocation(x-50, y);
				Icon i = new ImageIcon("wolf-zb.png");
				lab_wolf.setIcon(i);
				return;
			}

			if(datas[wy][wx-1] == 4 && datas[wy][wx-2] == 0){
				datas[wy][wx-1] = 0;
				datas[wy][wx-2] = 4;
			}

			if(datas[wy][wx-1] == 4 && datas[wy][wx-2] == 8){
				datas[wy][wx-1] = 0;
				datas[wy][wx-2] = 12;
				num++;
			}
			if(datas[wy][wx-1] == 12 && datas[wy][wx-2] == 0){
				datas[wy][wx-1] = 8;
				datas[wy][wx-2] = 4;
				num--;
			}
			if(datas[wy][wx-1] == 12 && datas[wy][wx-2] == 8){
				datas[wy][wx-1] = 8;
				datas[wy][wx-2] = 12;
			}
			sheeps[wy][wx-1].setLocation(12+wx*50-100,36+wy*50);
			sheeps[wy][wx-2] = sheeps[wy][wx-1];
			sheeps[wy][wx-1] = null;
			wx = wx-1;
			int x =(int)lab_wolf.getLocation().getX();
			int y =(int)lab_wolf.getLocation().getY();
			lab_wolf.setLocation(x-50, y);
			Icon i = new ImageIcon("wolf-zb.png");
			lab_wolf.setIcon(i);
			victory();
			return;
		}
		if(key == 38){
			//�����������ƶ�
			//�����ϵ�һλ������� wy wx-1
			//�����ϵڶ�λ������� wy wx-2
			if(datas[wy-1][wx] == 0){
				wy = wy-1;
				int x =(int)lab_wolf.getLocation().getX();
				int y =(int)lab_wolf.getLocation().getY();
				lab_wolf.setLocation(x, y-50);
				Icon i = new ImageIcon("wolf-sm.png");
				lab_wolf.setIcon(i);
				return;
			}
			
			if(datas[wy-1][wx] == 1){
				return;
			}
			if(datas[wy-1][wx] == 4 && datas[wy-2][wx] == 1){
				return;
			}
			if(datas[wy-1][wx] == 4 && datas[wy-2][wx] == 4){
				return;
			}
			if(datas[wy-1][wx] == 4 && datas[wy-2][wx] == 12){
				return;
			}
			if(datas[wy-1][wx] == 12 && datas[wy-2][wx] == 1){
				return;
			}
			if(datas[wy-1][wx] == 12 && datas[wy-2][wx] == 4){
				return;
			}
			if(datas[wy-1][wx] == 12 && datas[wy-2][wx] == 12){
				return;
			}
			
			if(datas[wy-1][wx] == 8){
				wy = wy-1;
				int x =(int)lab_wolf.getLocation().getX();
				int y =(int)lab_wolf.getLocation().getY();
				lab_wolf.setLocation(x, y-50);
				Icon i = new ImageIcon("wolf-sm.png");
				lab_wolf.setIcon(i);
				return;
			}

			if(datas[wy-1][wx] == 4 && datas[wy-2][wx] == 0){
				datas[wy-1][wx] = 0;
				datas[wy-2][wx] = 4;
			}

			if(datas[wy-1][wx] == 4 && datas[wy-2][wx] == 8){
				datas[wy-1][wx] = 0;
				datas[wy-2][wx] = 12;
				num++;
			}
			if(datas[wy-1][wx] == 12 && datas[wy-2][wx] == 0){
				datas[wy-1][wx] = 8;
				datas[wy-2][wx] = 4;
				num--;
			}
			if(datas[wy-1][wx] == 12 && datas[wy-2][wx] == 8){
				datas[wy-1][wx] = 8;
				datas[wy-2][wx] = 12;
			}
			sheeps[wy-1][wx].setLocation(12+wx*50,36+wy*50-100);
			sheeps[wy-2][wx] = sheeps[wy-1][wx];
			sheeps[wy-1][wx] = null;
			wy = wy-1;
			int x =(int)lab_wolf.getLocation().getX();
			int y =(int)lab_wolf.getLocation().getY();
			lab_wolf.setLocation(x, y-50);
			Icon i = new ImageIcon("wolf-sm.png");
			lab_wolf.setIcon(i);
			victory();
			return;
		}
		
		if(key == 40){
			//�����������ƶ�
			//�����ϵ�һλ������� wy wx-1
			//�����ϵڶ�λ������� wy wx-2
			if(datas[wy+1][wx] == 0){
				wy = wy+1;
				int x =(int)lab_wolf.getLocation().getX();
				int y =(int)lab_wolf.getLocation().getY();
				lab_wolf.setLocation(x, y+50);
				Icon i = new ImageIcon("wolf-zm.png");
				lab_wolf.setIcon(i);
				return;
			}
			
			if(datas[wy+1][wx] == 1){
				return;
			}
			if(datas[wy+1][wx] == 4 && datas[wy+2][wx] == 1){
				return;
			}
			if(datas[wy+1][wx] == 4 && datas[wy+2][wx] == 4){
				return;
			}
			if(datas[wy+1][wx] == 4 && datas[wy+2][wx] == 12){
				return;
			}
			if(datas[wy+1][wx] == 12 && datas[wy+2][wx] == 1){
				return;
			}
			if(datas[wy+1][wx] == 12 && datas[wy+2][wx] == 4){
				return;
			}
			if(datas[wy+1][wx] == 12 && datas[wy+2][wx] == 12){
				return;
			}
			
			if(datas[wy+1][wx] == 8){
				wy = wy+1;
				int x =(int)lab_wolf.getLocation().getX();
				int y =(int)lab_wolf.getLocation().getY();
				lab_wolf.setLocation(x, y+50);
				Icon i = new ImageIcon("wolf-zm.png");
				lab_wolf.setIcon(i);
				return;
			}

			if(datas[wy+1][wx] == 4 && datas[wy+2][wx] == 0){
				datas[wy+1][wx] = 0;
				datas[wy+2][wx] = 4;
			}

			if(datas[wy+1][wx] == 4 && datas[wy+2][wx] == 8){
				datas[wy+1][wx] = 0;
				datas[wy+2][wx] = 12;
				num++;
			}
			if(datas[wy+1][wx] == 12 && datas[wy+2][wx] == 0){
				datas[wy+1][wx] = 8;
				datas[wy+2][wx] = 4;
				num--;
			}
			if(datas[wy+1][wx] == 12 && datas[wy+2][wx] == 8){
				datas[wy+1][wx] = 8;
				datas[wy+2][wx] = 12;
			}
			sheeps[wy+1][wx].setLocation(12+wx*50,36+wy*50+100);
			sheeps[wy+2][wx] = sheeps[wy+1][wx];
			sheeps[wy+1][wx] = null;
			wy = wy+1;
			int x =(int)lab_wolf.getLocation().getX();
			int y =(int)lab_wolf.getLocation().getY();
			lab_wolf.setLocation(x, y+50);
			Icon i = new ImageIcon("wolf-zm.png");
			lab_wolf.setIcon(i);
			victory();
			return;
		}
	}

	


	@Override
	public void keyPressed(KeyEvent e) {
		
		
	}
}

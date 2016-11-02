package cn.itcast.txz.ui;

import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

//������ʾ��������
//��Ҫ�̳�Frame�ࡪ�������̳�
//���ֺ�ɫ�����ߴ�������˴���ǰ����һ����ɫ��
public class MainFrame extends Frame implements KeyListener{
	//1.������Ӧ������һ�´������������Ϣ
	//1.1�����Ƿ���ʾ
	//���췽��
	public MainFrame(){
		//�������ͼƬ�����ʱ�����˳�����Ҫ������Ҫ����
		//���ͼƬ�����˳��
		//����ͼƬ������������ͼƬ����������ӣ���������
		//��Ҫ�ڱ���ͼƬ֮ǰ���
		
		//��Ӹ��ָ���Ҫ��ʾ�Ķ���.....
		
		//������(Ŀ��λ��)
		targetInit();
		//����̫��(����)
		wolfInit();
		//��������(����)
		sheepInit();
		//����ľ(�ϰ�)
		treeInit();
		//����һ������������������ӵ�������
		backgroundInit();
		//������������
		setMainFrameUI();
		//ʹ�����ܹ��ල�û��ǲ��ǵ��˼���
		this.addKeyListener(this);
	}
	
	//��ǰ�����������JLabel��JLabel�����޷��жϵ�����ʲôλ��
	//�趨һ�������ݴ洢��Ӧ�ŵ�JLabel�洢����
	JLabel[][] sheeps = new JLabel[12][16];
	//��ǰ���鴴��������JLabel������û���κζ���
	//����������Ӧ�÷ŵ����������
	//��Ҫ������г�ʼ���ĵط��������������Ӷ�Ӧ������ŵ����������
	
	
	//�������ݵ�ģ�⣬ʹ�ö�ά����ģ��
	//1�����ϰ���0����յ�
	//4��������
	//8����Ŀ��
	//12����������Ŀ����
	int[][] datas = {
		{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
		{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
		{1,0,0,0,0,0,0,0,0,1,1,1,0,0,0,1},
		{1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1},
		{1,0,0,0,0,0,0,0,0,1,1,1,0,0,0,1},
		{1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1},
		{1,0,0,0,0,0,0,0,0,1,1,1,0,0,0,1},
		{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
		{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
		{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
		{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
		{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
	};
	//������������λ��
	int wx ;
	//�������������λ��
	int wy ;
	//����ǰ�ж��ٸ������ƶ�����Ŀ����
	int num = 0;
	//�������ӵ�����
	int total = 3;
	
	//�������ϰ��ĳ�ʼ��
	private void treeInit(){
		//1.����ͼƬ
		Icon ic = new ImageIcon("tree.png");
		//������ά����
		for(int i = 0;i<datas.length;i++){
			for(int j = 0;j<datas[i].length;j++){
				//�ж�һ��ԭʼ���������ֵ�����1�����ϰ�
				if(datas[i][j] == 1){
					//�ϰ��ĳ�ʼ��
					//2.����JLabel
					JLabel lab_tree = new JLabel(ic);
					//3.���ô�Сλ��
					lab_tree.setBounds(12+50*j,36+50*i,50,50);                           
					//4.��ӵ�������
					this.add(lab_tree);
				}
			}
		}
	}
	
	
	//������Ŀ��ĳ�ʼ��
	private void targetInit() {
		//����Ŀ�귽ʽͬ����������ӵ�����
		//1.����ͼƬ
		Icon i = new ImageIcon("target.png");
		//2.Jable
		JLabel lab_target1 = new JLabel(i);
		//3.��λ��
		lab_target1.setBounds(712, 236, 50, 50);
		//4.��ӽ�����
		this.add(lab_target1);
		//�޸�Ŀ���Ӧλ���ϵ�����Ϊ8
		datas[4][14] = 8;
		 
		//����������������
		JLabel lab_target2 = new JLabel(i);
		lab_target2.setBounds(712, 286, 50, 50);
		this.add(lab_target2);
		datas[5][14] = 8;
		
		JLabel lab_target3 = new JLabel(i);
		lab_target3.setBounds(712, 336, 50, 50);
		this.add(lab_target3);
		datas[6][14] = 8;
	}

	//���������ӵĳ�ʼ��
	private void sheepInit(){
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
		//�޸����Ӷ�Ӧλ���ϵ�����Ϊ4
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
	
	//����������ĳ�ʼ��
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
		//�������ʾλ�÷����ںδ���Ϊ����----------------
		lab_wolf.setBounds(12 + wx*50, 36 + wy*50, 50, 50);
		//4.���������ŵ���������
		this.add(lab_wolf);
	}
	JLabel lab_wolf;
	//������ʼ��
	private void backgroundInit() {
		//���������ʵ�ֵģ������������
		//��ʹ��ͼƬ��ΪJLabel�ڲ���ʾ������
		//����һ��ͼƬ
		Icon i = new ImageIcon("bg.png");
		//ʹ��JLabel��������
		JLabel lab_bg = new JLabel(i);
		//����Ҫ��ӵ������λ�����С
		lab_bg.setBounds(12, 36, 800, 600);
		//�����������ӵ���������
		this.add(lab_bg);
	}
	//���������������ʾЧ��
	private void setMainFrameUI(){
		//������������Ĳ���ģʽΪ���ɲ���
		this.setLayout(null);
		//���ô��ڵı���
		this.setTitle("������ v5.0 - java.itcast.cn");
		//���ô��ڵ�λ��
		this.setLocation(110, 30);
		//���ô��ڳߴ磬�೤400�����300
		this.setSize(826,650);
		//���ô��ڲ������
		//this.setResizable(false);
		//���ô�����ʾ����
		this.setVisible(true);
	}
	private void victory(){
		//���num��ֵ������total��ֵ��ʤ��
		if(num == total){
			System.out.println("ʤ��");
			//�����Լ�����Ҫ���ʤ������Dialog
			//��һ�ؾ������¶�ȡһ��ȫ�µ����飬���ǣ����������³�ʼ������num��total���³�ʼ��
		}
	}
	
	public void keyReleased(KeyEvent e) {
		//������̺����ڳ����ж���ִ����
		//��ηֱ��û�������Ǽ����ϵ�ĳ��������
		//ͨ������ֵ�ֱ�����һ������
		//��ȡ����ֵ�ķ�ʽ��
		//key����������������ĸ�����
		//�� 37
		//�� 38
		//�� 39
		//�� 40
		int key = e.getKeyCode();
		if(key == 39){
			//�����������ƶ�
			//�����ϵ�һλ�������� wy wx+1
			//�����ϵڶ�λ�������� wy wx+2
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
			//�����ϵ�һλ�������� wy wx-1
			//�����ϵڶ�λ�������� wy wx-2
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
			//�����ϵ�һλ�������� wy wx-1
			//�����ϵڶ�λ�������� wy wx-2
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
			//�����ϵ�һλ�������� wy wx-1
			//�����ϵڶ�λ�������� wy wx-2
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
	public void keyTyped(KeyEvent e) {
		
	}
	public void keyPressed(KeyEvent e) {
		
	}
	
	
}

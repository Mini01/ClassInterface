package com.biz.interfaces.remocon;
/*
 *  프로젝트 작성 지시서
 *  1. TvRCom 클래스를 TvRCom 객체로 생성하라
 *  2. TvRCom 객체에 있는
 *     volUp(), volDown, chUp(), chDown(),power(0
 *     매소드를 사용해서 나머지 코드를 구현
 */
public class RemoconExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		TvRCom tvRCom = new TvRCom();
		
		tvRCom.volUp();
		tvRCom.volDown();
		tvRCom.chUp();
		tvRCom.chDown();
		tvRCom.power();

	}

}

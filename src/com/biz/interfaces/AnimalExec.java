package com.biz.interfaces;

public class AnimalExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ZooKeper zookeper = new ZooKeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		
		AnimalInterface tigerImp = new Tiger();
		AnimalInterface lionInp = new Lion();
		
		zookeper.food(lion); // ZooKeper에 있는 food(Lion lion)메소드를 호출
		zookeper.food(tiger); // ZooKeper에 있는 food (Tiger tiger) 메소드를 호출
		
		zookeper.add(3, 4);
		zookeper.add(3f, 4f);

	}

}

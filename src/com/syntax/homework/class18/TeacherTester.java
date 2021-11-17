package com.syntax.homework.class18;

public class TeacherTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MathTeacher math=new MathTeacher();
		math.name="Adolf";
		math.sex='m';
		math.age=33;
		math.math();
		math.presentation();
		
		ChemistryTeacher t2=new ChemistryTeacher();
		t2.name="Elen";
		t2.chem();
		
		PianoTeacher t3=new PianoTeacher();
		t3.name="Vira";
		t3.piaon();

	}

}

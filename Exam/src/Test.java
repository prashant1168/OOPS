
public class Test {
public static void main(String args[]) {
	String[] option= {"a","b","c","d"};
	Question q1=new Question(1,"why?",option,"1",1);
	Question q2=new Question(2,"How?",option,"2",2);
	Question q3=new Question(3,"When?",option,"3",4);
	Question q4=new Question(4,"Where?",option,"4",1);
	Question q5=new Question(5,"who?",option,"1",10);
	Question[] q= {q1,q2,q3,q4,q5};
	Exam e = new Exam(11,"end-game",15,5,q);
	System.out.println(e);
	System.out.println(e.getQuestions()[2].getQue());
	System.out.println(e.getQuestions()[2].getAns());
}
}

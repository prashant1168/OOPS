
public class Exam {
private int examno;
private String examname;
private int marks;
private int duration;
private Question[] questions;
public Exam() {
	examno=0;
	examname=null;
	marks=0;
	duration=0;
	questions=new Question[5];
}
public Exam(int examno,String examname,int marks,int duration,Question[] questions) {
	this.examno=examno;
	this.examname=examname;
	this.marks=marks;
	this.duration=duration;
	this.questions=questions;
}
public int getExamno() {
	return examno;
}
public void setExamno(int examno) {
	this.examno = examno;
}
public String getExamname() {
	return examname;
}
public void setExamname(String examname) {
	this.examname = examname;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}
public Question[] getQuestions() {
	return questions;
}
public void setQuestions(Question[] questions) {
	this.questions = questions;
}
public String toString() {
	String str="";
	for(Question q:this.questions) {
		str=str+q.toString();
	}
	return "exam no: "+examno+"\nExam Name= "+examname+" Duration: "+this.duration+" Marks:"+this.marks+" questions "+str;
}
}

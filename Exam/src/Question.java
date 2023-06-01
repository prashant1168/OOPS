
public class Question {
private int qno;
private String que;
private String[] option;
private String ans;
private int marks;
public Question() {
	qno=0;
	que=null;
	option=new String[4];
	ans=null;
	marks=0;
}
public Question(int qno,String que,String[] option,String ans,int marks) {
	this.qno=qno;
	this.que=que;
	this.option=option;
	this.ans=ans;
	this.marks=marks;
}
public void setQno(int qno) {
	this.qno=qno;
}
public void setQue(String que) {
	this.que=que;
}
public void setOption(String[] option) {
	this.option=option;
}
public void setAns(String ans) {
	this.ans=ans;
}
public void setMarks(int marks) {
	this.marks=marks;
}
public int getQno() {
	return this.qno;
}
public String getQue() {
	return this.que;
}
public String[] getOption() {
	return this.option;
}
public String getAns() {
	return this.ans;
}
public int getMarks() {
	return this.marks;
}
public String toString() {
	String str="";
	for(int i=0;i<option.length;i++) {
		str=str+ (i+1)+" "+option[i]+"\n";
	}
	return "\nQuestion no: "+this.qno+" \nQuestion: "+que+" \nOption "+"\n"+str+" \nanswer "+ans+"\n marks: "+marks;
}
}

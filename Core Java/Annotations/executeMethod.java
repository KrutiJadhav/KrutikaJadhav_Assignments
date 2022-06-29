package com.cg.annote;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Info
{
	int AuthorID() default 111;
	String Author() default "Krutika";
	String Supervisor() default "AJ Johnson";
	int Date() default 23 / 06 / 2022;
	int Time() default 9;
	int Version() default 10;
	String Description() default "Personal Data";
}

@Info
class PersonalInfo
{
	String name;
	int age;
	public PersonalInfo(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	public void Data(String Author)
	{
		this.name=Author;
		System.out.println(Author);
	}
	
}
public class executeMethod {

	public static void main(String[] args) {
		PersonalInfo p=new PersonalInfo("Kruti", 22);
		
		p.Data("Kesar");
		
		Class c=p.getClass();
		Annotation an=c.getAnnotation(Info.class);
		Info i=(Info)an;
		System.out.println(i.Author());
		System.out.println(i.Supervisor());
		System.out.println(i.AuthorID());
		System.out.println(i.Date());
	}

}

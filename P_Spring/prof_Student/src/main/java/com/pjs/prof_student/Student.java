package com.pjs.prof_student;

public class Student {
	   public int idx;
	   public String name;
	   public String address;
	   public String birthday;
	   public String favoriteColor;
	   
	   
	   public Student() {
	      
	   }
	   
	   public Student(String name, String address, String birthday, String favorieColor) {
	      this.name=name;
	      this.address=address;
	      this.birthday =birthday;
	      this.favoriteColor = favorieColor;
	   }
	   
	   public String toTableTagString() {
			String tagString = "";
			tagString = tagString + "<tr>";
			tagString = tagString + "<td>";
			tagString = tagString + this.idx;
			tagString = tagString + "</td>";
			tagString = tagString + "<td>";
			tagString = tagString + this.name;
			tagString = tagString + "</td>";
			tagString = tagString + "<td>";
			tagString = tagString + this.address;
			tagString = tagString + "</td>";
			tagString = tagString + "<td>";
			tagString = tagString + this.birthday;
			tagString = tagString + "</td>";
			tagString = tagString + "<td>";
			tagString = tagString + this.favoriteColor;
			tagString = tagString + "</td>";
			tagString = tagString + "<td>";
			tagString = tagString + "<a href ='modify?idx="+this.idx+"'>�����ϱ�</a>";
			tagString = tagString + "</td>";
			tagString = tagString + "</tr>";
			return tagString;
		}
	}
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.Scanner;

public class postGo {
	public static void main(String[] args) {
		post post = new post();
		post.insertPost();
		
		System.out.println("" + post.title + ", " + post.description + ", " + post.createDate);

	}

}

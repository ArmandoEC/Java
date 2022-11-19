package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");
		
		Post post = new Post(LocalDateTime.parse("21/06/2018 13:05:44",fmt1),"Traveling to New Zealand","I'm going to visit this wonderful country!",12);
		post.addComments(c1);
		post.addComments(c2);
		
		System.out.println(post);

	}

}

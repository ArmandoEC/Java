package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {

	public static DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	private LocalDateTime date;
	private String title;
	private String content;
	private int likes;
	
	private List<Comment> comments = new ArrayList <>();
	
	public Post() {
		
	}

	public Post(LocalDateTime date, String title, String content, int likes) {
		this.date = date;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public void addComments (Comment c) {
		comments.add(c);
	}

	public void removeComments(Comment c) {
		comments.remove(c);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes + " Likes - ");
		sb.append(fmt1.format(date) + "\n");
		sb.append(content + "\n");
		sb.append("Comments: \n");
		for(Comment c : comments) {
			sb.append(c.getText()+"\n");
		}
		
		return sb.toString();
	}
	
	
}

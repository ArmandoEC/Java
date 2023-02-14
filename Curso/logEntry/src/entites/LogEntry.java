package entites;

import java.time.Instant;
import java.util.Objects;

public class LogEntry {
	private String username;
	private Instant entry;
	
	public LogEntry(String username, Instant entry) {
		this.username = username;
		this.entry = entry;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Instant getEntry() {
		return entry;
	}

	public void setEntry(Instant entry) {
		this.entry = entry;
	}

	@Override
	public int hashCode() {
		return Objects.hash(username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogEntry other = (LogEntry) obj;
		return Objects.equals(username, other.username);
	}
	
	
}

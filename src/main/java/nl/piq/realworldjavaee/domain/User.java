package nl.piq.realworldjavaee.domain;

import java.net.URL;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class User {

	public static final User ANONYMOUS = new User("anonymous", "", "") {
        @Override
        public boolean isFollowing(Profile profile) {
            return false;
        }
    };

	private String username;
    private Password password;
	private String email;
    private String bio;
    private URL image;
	private Set<Profile> following = new HashSet<>();

	User(String username, String email, String password) {
		setUsername(username);
		setEmail(email);
		setPassword(password);
	}

    String getUsername() {
		return username;
	}

	String getEmail() {
		return email;
	}

	public void setEmail(String email) {
        Objects.requireNonNull(email);
		this.email = email;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		User user = (User) o;
		return Objects.equals(username, user.username) &&
				Objects.equals(email, user.email);
	}

	@Override
	public int hashCode() {
		return Objects.hash(username, email);
	}

	boolean hasPassword(String password) {
	    return this.password.matches(password);
	}

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getBio() {
        return bio;
    }

    public void setImage(URL image) {
        this.image = image;
    }

    public URL getImage() {
        return image;
    }

    public void setUsername(String username) {
        Objects.requireNonNull(username);
        this.username = username;
    }

    public void setPassword(String newPassword) {
        this.password = new Password(newPassword);
    }

	public void follow(Profile profile) {
        Objects.requireNonNull(profile);
        following.add(profile);
	}

	public void unfollow(Profile p) {
		Objects.requireNonNull(p);
		following.remove(p);
    }

    public boolean isFollowing(Profile profile) {
    	return following.contains(profile);
    }

}
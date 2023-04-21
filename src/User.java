
import java.util.ArrayList;

public class User {

	private String name;
	private String password;
	private int userID;
	private ArrayList<String> userTrans;

	public static class Builder {

		private String name;
		private String password;
		private int userID;
		private ArrayList<String> userTrans;

		public Builder(String name, String password) {
			this.name = name;
			this.password = password;
		}

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setPassword(String password) {
			this.password = password;
			return this;
		}

		public Builder setUserID(int userID) {
			this.userID = userID;
			return this;
		}

		public Builder setUserTrans(ArrayList<String> userTrans) {
			this.userTrans = userTrans;
			return this;
		}

		public User build() {
			return new User(this);
		}
	}

	public User(Builder builder) {
		this.name = builder.name;
		this.password = builder.password;
		this.userID = builder.userID;
		this.userTrans = builder.userTrans;

	}

	public User(String name, String password) {
		this.name = name;
		this.password = password;
		this.userID = 1;
		userTrans = new ArrayList<String>();

	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String pass) {
		this.password = pass;
	}

	public void Spend(int accID, double amount, String type) {
		String s1 = accID + " " + amount + " " + type;
		userTrans.add(s1);
	}

	public ArrayList<String> getUserTrans() {
		return userTrans;
	}

	public int getUID() {
		return this.userID;
	}

}

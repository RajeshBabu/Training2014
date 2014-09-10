package com.pcs.model;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {
	private String username;
	private String password;
	private String email;
	private String phonenumber;
	private String address;

	public User(Parcel source) {
		setPassword(source.readString());
		setEmail(source.readString());
		setAddress(source.readString());
		setPhonenumber(source.readString());
		setUsername(source.readString());

	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(getPassword());
		dest.writeString(getEmail());
		dest.writeString(getAddress());
		dest.writeString(getPhonenumber());
		dest.writeString(getUsername());


	}

	public static final Creator<User> CREATOR = new Creator<User>() {

		@Override
		public User[] newArray(int size) {
			// TODO Auto-generated method stub
			return new User[size];
		}

		@Override
		public User createFromParcel(Parcel source) {
			// TODO Auto-generated method stub
			return new User(source);
		}
	};

	public String toString() {
		return "Username = " + getUsername() + "  Password =" + getPassword()
				+ " Email = " + getEmail();

	};

}

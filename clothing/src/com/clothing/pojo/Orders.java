package com.clothing.pojo;

import java.util.Date;
//订单表
public class Orders {
	private int or_id;
	private int or_number;
	private Date or_data;
	private String or_state;
	private String or_sendmode;
	// 关联用户
	private Users user;

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orders(int or_id, int or_number, Date or_data, String or_state,
			String or_sendmode, Users user) {
		super();
		this.or_id = or_id;
		this.or_number = or_number;
		this.or_data = or_data;
		this.or_state = or_state;
		this.or_sendmode = or_sendmode;
		this.user = user;
	}

	public int getOr_id() {
		return or_id;
	}

	public void setOr_id(int or_id) {
		this.or_id = or_id;
	}

	public int getOr_number() {
		return or_number;
	}

	public void setOr_number(int or_number) {
		this.or_number = or_number;
	}

	public Date getOr_data() {
		return or_data;
	}

	public void setOr_data(Date or_data) {
		this.or_data = or_data;
	}

	public String getOr_state() {
		return or_state;
	}

	public void setOr_state(String or_state) {
		this.or_state = or_state;
	}

	public String getOr_sendmode() {
		return or_sendmode;
	}

	public void setOr_sendmode(String or_sendmode) {
		this.or_sendmode = or_sendmode;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Orders [or_id=" + or_id + ", or_number=" + or_number
				+ ", or_data=" + or_data + ", or_state=" + or_state
				+ ", or_sendmode=" + or_sendmode + ", user=" + user + "]";
	}

}

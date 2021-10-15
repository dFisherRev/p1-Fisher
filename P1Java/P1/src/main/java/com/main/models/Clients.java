package com.main.models;

public class Clients {
	private int policy_id;
	private String first_name;
	private String last_name;
	private int deductable;
	private String home_location;
	public Clients() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Clients(int policy_id, String first_name, String last_name, int deductable, String home_location) {
		super();
		this.policy_id = policy_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.deductable = deductable;
		this.home_location = home_location;
	}
	public Clients(String first_name, String last_name, int deductable, String home_location) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.deductable = deductable;
		this.home_location = home_location;
	}
	@Override
	public String toString() {
		return "Clients [policy_id=" + policy_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", deductable=" + deductable + ", home_location=" + home_location + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + deductable;
		result = prime * result + ((first_name == null) ? 0 : first_name.hashCode());
		result = prime * result + ((home_location == null) ? 0 : home_location.hashCode());
		result = prime * result + ((last_name == null) ? 0 : last_name.hashCode());
		result = prime * result + policy_id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clients other = (Clients) obj;
		if (deductable != other.deductable)
			return false;
		if (first_name == null) {
			if (other.first_name != null)
				return false;
		} else if (!first_name.equals(other.first_name))
			return false;
		if (home_location == null) {
			if (other.home_location != null)
				return false;
		} else if (!home_location.equals(other.home_location))
			return false;
		if (last_name == null) {
			if (other.last_name != null)
				return false;
		} else if (!last_name.equals(other.last_name))
			return false;
		if (policy_id != other.policy_id)
			return false;
		return true;
	}
	public int getPolicy_id() {
		return policy_id;
	}
	public void setPolicy_id(int policy_id) {
		this.policy_id = policy_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public int getDeductable() {
		return deductable;
	}
	public void setDeductable(int deductable) {
		this.deductable = deductable;
	}
	public String getHome_location() {
		return home_location;
	}
	public void setHome_location(String home_location) {
		this.home_location = home_location;
	}
	
}

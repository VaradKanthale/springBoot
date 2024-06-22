package spring_web.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Customer_Table")
public class Customer {

	@Column(name = "Id", length = 10)
	@NotNull(message = "Please id is Enter")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;

	@Column(name = "Customer_Name")
	@Size(max = 8, min = 3, message = "Please Enter minimum 3 letters and maximum 8 letters ")
	@NotNull
	String name;

	@Size(max = 8, message = "Password length must be 8 and contain uppercase,lowercase,digits")
	@Pattern(regexp = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}")
	@NotNull
	String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Customer(@NotNull(message = "Please id is Enter") int id,
			@NotNull(message = "please name is enter") String name,
			@NotNull(message = "Please correct password is enter") @Pattern(regexp = "([A-Z],[a-z],[1-9],%#$!@*)") String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", password=" + password + "]";
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

}

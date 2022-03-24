package UjianRalationalJPA.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="admin")
public class AdminModel {

	@Id
	@Column(length = 25 , nullable = false)
	String username;
	@Column(length = 25 , nullable = false)
	String password;
}

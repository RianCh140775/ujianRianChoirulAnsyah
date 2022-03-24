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
@Table(name="mahasiswa")
public class MahasiswaModel {

	@Id
	@Column(columnDefinition ="char(8)" , nullable = false)
	String nim;
	@Column(length = 25 , nullable = false)
	String namaMahasiswa;
	@Column(length = 10 , nullable = false)
	String jenisKelamin;
	@Column(length = 25 , nullable = false)
	String password;
	
}

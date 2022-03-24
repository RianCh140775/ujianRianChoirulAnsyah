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
@Table(name="nilai")
public class NilaiModel {

	@Id
	@Column(columnDefinition = "char(10)", nullable = false)
	String idSoal;
	@Column(length = 3, nullable = true)
	int nilai;
}

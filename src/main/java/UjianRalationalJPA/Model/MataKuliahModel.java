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
@Table(name="matakuliah")
public class MataKuliahModel {

	@Id
	@Column(columnDefinition ="char(8)", nullable = false)
	String idMataKuliah;
	@Column(length = 25 ,nullable = false)
	String namaMatakuliah;
}

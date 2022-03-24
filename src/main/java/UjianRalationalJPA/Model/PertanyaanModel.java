package UjianRalationalJPA.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="pertanyaan")
public class PertanyaanModel {

	@Id
	@Column(columnDefinition = "char(10)", nullable = false)
	String idPertanyaan;
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "idSoal", referencedColumnName = "idSoal",unique = true)
	private SoalModel idSoal;
	@Column(columnDefinition = "text" , nullable = false)
	String Pertanyaan;
	@Column(columnDefinition = "text" , nullable = false)
	String jawaban1;
	@Column(columnDefinition = "text" , nullable = false)
	String jawaban2;
	@Column(columnDefinition = "text" , nullable = false)
	String jawaban3;
	@Column(columnDefinition = "text" , nullable = false)
	String jawaban4;
	@Column(columnDefinition = "text" , nullable = false)
	String jawabanBenar;
	@Column(columnDefinition = "text(1)", nullable = true)
	int statusGambar;
}

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
@Table(name="soal")
public class SoalModel {

	@Id
	@Column(columnDefinition = "char(10)" , nullable = false)
	String idSoal;
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "idPlotMK", referencedColumnName = "idPlotMK",unique = true)
	private PlotMataKuliahModel idPlotMK;
	@Column(length = 25, nullable = false)
	String namaSoal;
	@Column(length = 1, nullable = false)
	int status;
	
}

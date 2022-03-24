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
@Table(name="plotmatakuliah")
public class PlotMataKuliahModel {

	@Id
	@Column(columnDefinition ="char(8)" , nullable = false)
	String idPlotMK;
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "idMataKuliah", referencedColumnName = "idMataKuliah",unique = true)
	private MataKuliahModel idMataKuliah;
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "idDosen", referencedColumnName = "idDosen",unique = true)
	private DosenModel idDosen;
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "nim", referencedColumnName = "nim",unique = true)
	private MahasiswaModel nim;
	
}

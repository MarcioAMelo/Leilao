import java.util.Date;
import java.util.Timer;

public class TempoLeilao {
	private Date dataInicio;
	private Timer horainicio;
	private Date dataFinal;
	private Timer horaFinal;
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Timer getHorainicio() {
		return horainicio;
	}
	public void setHorainicio(Timer horainicio) {
		this.horainicio = horainicio;
	}
	public Date getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}
	public Timer getHoraFinal() {
		return horaFinal;
	}
	public void setHoraFinal(Timer horaFinal) {
		this.horaFinal = horaFinal;
	} 
	
}

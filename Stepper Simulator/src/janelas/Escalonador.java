package janelas;

import java.util.ArrayList;

public interface Escalonador {
	public abstract ArrayList<TimeSlice> escalonar(ArrayList<Processo> processos,
			int timeSlice);

}

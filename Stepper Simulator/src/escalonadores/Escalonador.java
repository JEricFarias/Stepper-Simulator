package escalonadores;

import java.util.ArrayList;

import janelas.Processo;
import janelas.TimeSlice;

public interface Escalonador {
	public abstract ArrayList<TimeSlice> escalonar(ArrayList<Processo> processos,
			int timeSlice);

}

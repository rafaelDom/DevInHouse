package curtir_descurtir_filme;

import java.util.ArrayList;
import java.util.List;

public class ListaFilmesCurtidosDescurtidos {
	private List<CurtirDescurtirFilmeModelo> filmesCurtidos = new ArrayList<CurtirDescurtirFilmeModelo>();
	private List<CurtirDescurtirFilmeModelo> filmesDescurtidos = new ArrayList<CurtirDescurtirFilmeModelo>();

	public ListaFilmesCurtidosDescurtidos(CurtirDescurtirFilmeModelo curtirDescurtirFilme) {
		super();
		
		if(curtirDescurtirFilme.isCurtiu()) {
			filmesCurtidos.add(curtirDescurtirFilme);
		}else {
			filmesDescurtidos.add(curtirDescurtirFilme);
		}
	}

	public List<CurtirDescurtirFilmeModelo> getFilmesCurtidos() {
		return filmesCurtidos;
	}

	public void setFilmesCurtidos(List<CurtirDescurtirFilmeModelo> filmesCurtidos) {
		this.filmesCurtidos = filmesCurtidos;
	}

	public List<CurtirDescurtirFilmeModelo> getFilmesDescurtidos() {
		return filmesDescurtidos;
	}

	public void setFilmesDescurtidos(List<CurtirDescurtirFilmeModelo> filmesDescurtidos) {
		this.filmesDescurtidos = filmesDescurtidos;
	}
	
	
}

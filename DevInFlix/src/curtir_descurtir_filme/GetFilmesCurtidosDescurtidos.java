package curtir_descurtir_filme;

import java.util.ArrayList;
import java.util.List;

import usuarios.Usuario;

public class GetFilmesCurtidosDescurtidos {
	private ListaFilmesCurtidosDescurtidos listaFilmesCurtidosDescurtidos;
	private List<CurtirDescurtirFilmeModelo> listaFilmesCurtidos = new ArrayList<CurtirDescurtirFilmeModelo>();
	private List<CurtirDescurtirFilmeModelo> listaFilmesDescurtidos = new ArrayList<CurtirDescurtirFilmeModelo>();

	public GetFilmesCurtidosDescurtidos(ListaFilmesCurtidosDescurtidos listaFilmesCurtidosDescurtidos) {
		super();
		this.listaFilmesCurtidosDescurtidos = listaFilmesCurtidosDescurtidos;
	}

	public List<CurtirDescurtirFilmeModelo> filmesCurtidos(Usuario usuario) {
		for (int i = 0; i < listaFilmesCurtidosDescurtidos.getFilmesCurtidos().size(); i++) {
			if(listaFilmesCurtidosDescurtidos.getFilmesCurtidos().get(i).getUsuario().equals(usuario)) {
				listaFilmesCurtidos.add(listaFilmesCurtidosDescurtidos.getFilmesCurtidos().get(i));
			}
		}
		return listaFilmesCurtidos;
	}
	
	public List<CurtirDescurtirFilmeModelo> filmesDescurtidos(Usuario usuario) {
		for (int i = 0; i < listaFilmesCurtidosDescurtidos.getFilmesDescurtidos().size(); i++) {
			if(listaFilmesCurtidosDescurtidos.getFilmesDescurtidos().get(i).getUsuario().equals(usuario)) {
				listaFilmesDescurtidos.add(listaFilmesCurtidosDescurtidos.getFilmesDescurtidos().get(i));
			}
		}
		return listaFilmesDescurtidos;
	}

}

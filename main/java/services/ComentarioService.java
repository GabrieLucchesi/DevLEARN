package services;

import daos.ComentarioDAO;
import models.Comentario;
import spark.Request;
import spark.Response;

public class ComentarioService {
	private ComentarioDAO ComentarioDAO;

	public ComentarioService() {
		ComentarioDAO = new ComentarioDAO();
		ComentarioDAO.conectar();
	}
}

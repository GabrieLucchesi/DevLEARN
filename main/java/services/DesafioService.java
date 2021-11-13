package services;

import daos.DesafioDAO;
import models.Desafio;
import spark.Request;
import spark.Response;

public class DesafioService {
	private DesafioDAO DesafioDAO;

	public DesafioService() {
		DesafioDAO = new DesafioDAO();
		DesafioDAO.conectar();
	}
}

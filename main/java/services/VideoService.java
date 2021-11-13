package services;

import daos.VideoDAO;
import models.Video;
import spark.Request;
import spark.Response;

public class VideoService {
	private VideoDAO VideoDAO;

	public VideoService() {
		VideoDAO = new VideoDAO();
		VideoDAO.conectar();
	}
}

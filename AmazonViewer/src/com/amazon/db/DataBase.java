package com.amazon.db;

public class DataBase {
	
	public static final String URL   = "jdbc:mysql://localhost:3306/";
	public static final String DB    = "Amazon";
	public static final String PARAM = "?autoReconnect=true&useSSL=false";
	public static final String USER  = "ezetina";
	public static final String PASS  = "Vincent17!";
	
	
	public static final String TMOVIE          = "movie";
	public static final String TMOVIE_ID       = "id";
	public static final String TMOVIE_TITLE    = "title";
	public static final String TMOVIE_GENERE   = "genre";
	public static final String TMOVIE_CREATOR  = "creator";
	public static final String TMOVIE_DURATION = "duration";
	public static final String TMOVIE_YEAR     = "year";
	
	public static final String TMATERIAL       = "material";
	public static final String TMATERIAL_ID    = "id";
	public static final String TMATERIAL_NAME  = "name";
	
	public static final String TUSER        = "user";
	public static final String TUSER_ID     = "id";
	public static final String TUSER_NAME   = "name";
	
	public static final String TVIEWED             = "viewed";
	public static final String TVIEWED_ID          = "id";
	public static final String TVIEWED_IDMATERIAL  = "id_material";
	public static final String TVIEWED_IDELEMENT   = "id_element";
	public static final String TVIEWED_IDUSER      = "id_user";

}

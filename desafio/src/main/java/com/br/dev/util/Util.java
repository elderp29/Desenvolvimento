package com.br.dev.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {

public static String dataParaString(Date date, String pattern) {
		
		DateFormat dateFormat = new SimpleDateFormat(pattern);
        String dataFormatada = dateFormat.format(date);
        
        return dataFormatada;
	}
}
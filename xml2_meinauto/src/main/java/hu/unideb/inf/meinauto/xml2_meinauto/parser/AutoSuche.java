package hu.unideb.inf.meinauto.xml2_meinauto.parser;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import hu.unideb.inf.meinauto.xml2_meinauto.model.SearchResults;
import hu.unideb.inf.jaxb.JAXBUtil;
import hu.unideb.inf.meinauto.xml2_meinauto.model.Auto;
import hu.unideb.inf.meinauto.xml2_meinauto.model.SearchResultItem;

public class AutoSuche {

	/*	private static Logger logger = LoggerFactory.getLogger(AutoSuche.class);
		private static final int TIMEOUT_IN_SECONDS = 60000;
		private static final String URI ="http://www.meinauto.de/";*/
		
		
	/*	public AutoSuche() {
		}*/
		
	/*	public SearchResultItem parse(String url) throws IOException {
			Document doc = Jsoup.connect(url).userAgent("Mozilla").get();
			SearchResultItem sri = parse(doc);
			sri.setUri(url);
			return sri;
		}

		public SearchResultItem parse(File file) throws IOException {
			Document doc = Jsoup.parse(file, null);
			SearchResultItem ri = parse(doc);
			ri.setUri(file.toURI().toString());
			return ri;
		}*/

	/*	private SearchResultItem parse(Document doc) throws IOException {
			System.out.println(doc.html());
			SearchResultItem sri = new SearchResultItem();
			
			String name = null;
			try {
				name = doc.select("body > div.page > div > section > div > div:nth-child(2) > div > div:nth-child(2) > div > section > div > div.vehicle-active > div:nth-child(2) > div:nth-child(2) > article > div > div > label").text().trim();
			/*	Elements e = doc.select("div:nth-child(1) > div:nth-child(1) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)");
				for(Element el: e){
					System.out.println(el.text());
				}
			//	name = doc.select("div.widget-foldable:nth-child(5) > div:nth-child(1)").text().trim();
				System.out.println(name+" name");
			
			} catch(Exception e) {
				throw new IOException("Malformed document");
			}
			sri.setName(name);
			
			String uri = null;
			try {
				uri = doc.select("div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > img:nth-child(1)").get(0).attr("abs:href").trim().split("\\?")[0];
			} catch(Exception e) {
				throw new IOException("Malformed document");
			}
			logger.debug("Uri: {}", uri);
			sri.setUri(uri);
			
			return sri;
			
		}*/
		
	/*	public static void main(String[] args){
			if (args.length != 1) {
				System.err.printf("Usage: java %s <url>\n", AutoParser.class.getName());
				System.exit(1);
			}
			try {
				//SearchResultItem ri = new AutoSuche().parse(args[0]);
				System.out.println("MEGZKFDJB");
				//JAXBUtil.toXML(ri, System.out);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}*/
		
		
		public static void main(String[] args){
				//System.err.printf("Usage: java %s <url>\n", AutoParser.class.getName());
			System.out.println("looob");
		
		}
	}


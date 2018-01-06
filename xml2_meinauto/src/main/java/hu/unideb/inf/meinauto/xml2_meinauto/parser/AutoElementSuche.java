package hu.unideb.inf.meinauto.xml2_meinauto.parser;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import hu.unideb.inf.jaxb.JAXBUtil;
import hu.unideb.inf.meinauto.xml2_meinauto.model.Auto;
import hu.unideb.inf.meinauto.xml2_meinauto.model.Dimensions;
import hu.unideb.inf.meinauto.xml2_meinauto.model.Gepackraumvol;
import hu.unideb.inf.meinauto.xml2_meinauto.model.Hubraum;
import hu.unideb.inf.meinauto.xml2_meinauto.model.SearchResultItem;
import hu.unideb.inf.meinauto.xml2_meinauto.model.Verbrauch;

public class AutoElementSuche {
	private static Logger logger = LoggerFactory.getLogger(AutoElementSuche.class);

	public AutoElementSuche() {
	}

	public SearchResultItem parse(String url) throws IOException {
		Document doc = Jsoup.connect(url).userAgent("Mozilla").get();
	//	System.out.println("!!!!!!Hvhshd" + doc.title());
	/*	if (doc.title().contains("Angebote für Neuwagen")){
			logger.warn("Das Modell wurde nicht gefunden!");
			return new Auto();
		}*/
		SearchResultItem sri = parse(doc);
		sri.setUri(url);
		return sri;
	}

	public SearchResultItem parse(File file) throws IOException {
		Document doc = Jsoup.parse(file, null);
		System.out.println("!!!!!!Hvhshd" + doc.title());
		SearchResultItem sri = parse(doc);
		sri.setUri(file.toURI().toString());
		return sri;
	}

	private SearchResultItem parse(Document doc) throws IOException {
		// TODO Auto-generated method stub

		SearchResultItem sri = new SearchResultItem();

		String name = null;
		try {
			name = doc.select("body > div.page > div > section > div > div:nth-child(2) > div > div:nth-child(2) > div > section > div > div.vehicle-active > div:nth-child(2) > div:nth-child(2) > article > div > div > label").text().trim();
			System.out.println(name);

			logger.info("Auto name: {}", name);
		} catch (Exception e) {
			throw new IOException("Malformed document");
		}
		sri.setName(name);


		return sri;

	}

	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.printf("Usage: java %s <url>\n", AutoElementSuche.class.getName());
			System.exit(1);
		}
		try {
			SearchResultItem sri = new AutoElementSuche().parse(args[0]);
			System.out.println(sri);
			JAXBUtil.toXML(sri, System.out);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}







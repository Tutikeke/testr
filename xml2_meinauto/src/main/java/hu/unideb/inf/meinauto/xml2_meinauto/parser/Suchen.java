package hu.unideb.inf.meinauto.xml2_meinauto.parser;

public class Suchen {

	/*
	 * private static Logger logger = LoggerFactory.getLogger(AutoSuche.class);
	 * private static final int TIMEOUT_IN_SECONDS = 60000; private static final
	 * String URI ="http://www.meinauto.de/";
	 */

	/*
	 * public SearchResultItem parse(String url) throws IOException { Document
	 * doc = Jsoup.connect(url).userAgent("Mozilla").get(); SearchResultItem sri
	 * = parse(doc); sri.setUri(url); return sri; }
	 * 
	 * public SearchResultItem parse(File file) throws IOException { Document
	 * doc = Jsoup.parse(file, null); SearchResultItem ri = parse(doc);
	 * ri.setUri(file.toURI().toString()); return ri; }
	 */

	/*
	 * private SearchResultItem parse(Document doc) throws IOException {
	 * System.out.println(doc.html()); SearchResultItem sri = new
	 * SearchResultItem();
	 * 
	 * String name = null; try { name = doc.select(
	 * "body > div.page > div > section > div > div:nth-child(2) > div > div:nth-child(2) > div > section > div > div.vehicle-active > div:nth-child(2) > div:nth-child(2) > article > div > div > label"
	 * ).text().trim(); /* Elements e = doc.select(
	 * "div:nth-child(1) > div:nth-child(1) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1)"
	 * ); for(Element el: e){ System.out.println(el.text()); } // name =
	 * doc.select("div.widget-foldable:nth-child(5) > div:nth-child(1)"
	 * ).text().trim(); System.out.println(name+" name");
	 * 
	 * } catch(Exception e) { throw new IOException("Malformed document"); }
	 * sri.setName(name);
	 * 
	 * String uri = null; try { uri = doc.select(
	 * "div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > img:nth-child(1)"
	 * ).get(0).attr("abs:href").trim().split("\\?")[0]; } catch(Exception e) {
	 * throw new IOException("Malformed document"); } logger.debug("Uri: {}",
	 * uri); sri.setUri(uri);
	 * 
	 * return sri;
	 * 
	 * }
	 */

	public static void main(String[] args) {
		
		
		System.out.println("MEGZKFDJB");
	}
}

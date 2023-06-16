package ch7_object2;

interface Parseable {
	public abstract void parse(String fileName);
}

class ParserManager {
	// 리턴타입이 Parseable인터페이스
	public static Parseable getParser(String type) {
		if(type.equals("XML")) {
			return new XMLParser();
		} else {
			Parseable p = new HTMLParser();
			return p;
		}
	}
}

class XMLParser implements Parseable {
	public void parse (String fileName) {
		/* 구문 분석작업을 수행하는 코드를 작성 */
		System.out.println(fileName + "- XML parsing completed");
	}
}

class HTMLParser implements Parseable {
	public void parse (String fileName) {
		/* 구문 분석작업을 수행하는 코드를 작성 */
		System.out.println(fileName + "- HTML parsing completed");
	}
}

class ParserTest {
	public static void main(String[] args) {
		Parseable parser = ParserManager.getParser("XML");
		parser.parse("document.xml");
		parser = ParserManager.getParser("HTML");
		parser.parse("document2.xml");
	}
}
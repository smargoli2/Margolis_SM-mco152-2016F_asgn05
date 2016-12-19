
public class DecoratorExample {

	public String newH(String name, String id, int size) {
		if (size < 1 || size > 6) {
			System.out.println("Invalid header size.");
		}
		String tag = "";
		tag = tag.concat("<h" + size + " name=\"" + name + "\" id=\"" + id + "\"></h" + size + ">");
		return tag;
	}

	public String newDiv(String name, String id) {
		String tag = "";
		tag = tag.concat("<div name=\"" + name + "\" id=\"" + id + "\"></div>");
		return tag;
	}

	public String newP(String name, String id) {
		String tag = "";
		tag = tag.concat("<p name=\"" + name + "\" id=\"" + id + "\"></p>");
		return tag;
	}

	public String newInput(String name, String id, String type, String event, String value) {
		String tag = "";
		tag = tag.concat("<input name=\"" + name + "\" id=\"" + id + "\" type=\"" + type 
				+ "\" value=\"" + value + "\" event=\"" + event
				+ "\"></input>");
		return tag;
	}

	public String addEm(String tag) {
		return "<em>" + tag + "</em>";
	}

	public String addStrong(String tag) {
		return "<strong>" + tag + "</strong>";
	}

	public String addI(String tag) {
		return "<i>" + tag + "</i>";
	}

	public String addU(String tag) {
		return "<u>" + tag + "</u>";
	}

	public String addSmall(String tag) {
		return "<small>" + tag + "</small>";
	}

	public String addA(String tag, String href) {
		return "<a href=\"" + href + "\">" + tag + "</a>";
	}

	public static void main(String[] args) {
		DecoratorExample tagCreator = new DecoratorExample();
		String tag = tagCreator.newH("Me", "myName", 2);
		System.out.println(tag.toString());
		tag = tagCreator.addEm(tag);
		System.out.println(tag);
		tag = tagCreator.addStrong(tag);
		System.out.println(tag);

		String link = tagCreator.newP("The site", "par1");
		System.out.println(link);
		link = tagCreator.addA(link, "www.mysite.com");
		System.out.println(link);
		link = tagCreator.addU(tag);
		System.out.println(link);
	}
}

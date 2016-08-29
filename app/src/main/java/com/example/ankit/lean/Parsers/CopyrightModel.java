
class CopyrightModel {

	public String licence_url;
	public int year;
	public String logo;
	public String licence;
	public String holder;
	public String holder_url;

	public CopyrightModel(String licence_url, int year, String logo, String licence, String holder, String holder_url) {

		this.licence_url = licence_url;
		this.year = year;
		this.logo = logo;
		this.licence = licence;
		this.holder = holder;
		this.holder_url = holder_url;

	}

}

class CopyrightModel {

	public String licence_url;
	public int year;
	public String licence;
	public String logo;
	public String holder;
	public String holder_url;

	public CopyrightModel(String licence_url, int year, String licence, String logo, String holder, String holder_url) {

		this.licence_url = licence_url;
		this.year = year;
		this.licence = licence;
		this.logo = logo;
		this.holder = holder;
		this.holder_url = holder_url;

	}

}
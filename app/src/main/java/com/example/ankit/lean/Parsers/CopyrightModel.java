
class CopyrightModel {

	public String holder_url;
	public int year;
	public String logo;
	public String holder;
	public String licence;
	public String licence_url;

	public CopyrightModel(String holder_url, int year, String logo, String holder, String licence, String licence_url) {

		this.holder_url = holder_url;
		this.year = year;
		this.logo = logo;
		this.holder = holder;
		this.licence = licence;
		this.licence_url = licence_url;

	}

}
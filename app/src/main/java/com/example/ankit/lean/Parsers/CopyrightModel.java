
class CopyrightModel {

	public String licence_url;
	public String licence;
	public String holder;
	public String holder_url;
	public String logo;
	public int year;

	public CopyrightModel(String licence_url, String licence, String holder, String holder_url, String logo, int year) {

		this.licence_url = licence_url;
		this.licence = licence;
		this.holder = holder;
		this.holder_url = holder_url;
		this.logo = logo;
		this.year = year;

	}

}
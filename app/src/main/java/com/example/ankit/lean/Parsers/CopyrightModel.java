
class CopyrightModel {

	public String holder_url;
	public String holder;
	public String licence;
	public String licence_url;
	public int year;
	public String logo;

	public CopyrightModel(String holder_url, String holder, String licence, String licence_url, int year, String logo) {

		this.holder_url = holder_url;
		this.holder = holder;
		this.licence = licence;
		this.licence_url = licence_url;
		this.year = year;
		this.logo = logo;

	}

}